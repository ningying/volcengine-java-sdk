package com.volcengine.speech.listener;

import com.google.gson.JsonObject;
import com.volcengine.speech.model.AsrStreamRequest;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import static com.volcengine.speech.Const.*;

/**
 * SpeechASRWebsocketListener is a listener for websocket connection of Speech ASR service.
 *
 * @author ningy
 */
public class AsrWebsocketListener extends WebSocketListener {

    private byte[] buffer;
    private int bufferSize;
    private int seq;
    private int lastSeq;

    private final String format;

    private final String codec;

    private final Integer rate;

    private final Integer bits;

    private final Integer channel;

    private final Integer endWindowSize;

    private final Integer forceToSpeechTime;

    private Flowable<byte[]> inputStream;

    private FlowableEmitter<Map<String, Object>> emitter;

    public AsrWebsocketListener(AsrStreamRequest request, Flowable<byte[]> inputStream, FlowableEmitter<Map<String, Object>>  emitter) {
        this.format = request.getFormat();
        this.codec = request.getCodec();
        this.rate = request.getRate();
        this.bits = request.getBits();
        this.channel = request.getChannel();
        this.inputStream = inputStream;
        this.emitter = emitter;
        this.endWindowSize = request.getEndWindowSize();
        this.forceToSpeechTime = request.getForceToSpeechTime();
    }

    @SuppressWarnings("[ByDesign12.1]UsingRuntimeExec")
    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        String logId = response.header("X-Tt-Logid");
        System.out.println("===> onOpen,X-Tt-Logid:" + logId);

        // send full client request
        // step 1: append payload json string
        JsonObject user = new JsonObject();
        user.addProperty("uid", "test");

        JsonObject audio = new JsonObject();
        audio.addProperty("format", format); //
        audio.addProperty("sample_rate", rate);
        audio.addProperty("bits", bits);
        audio.addProperty("channel", channel);
        audio.addProperty("codec", codec);
//        audio.addProperty("show_utterances", true);

        JsonObject request = new JsonObject();
        request.addProperty("model_name", "bigmodel");
        request.addProperty("enable_punc", true);
        request.addProperty("result_type", "single");
        request.addProperty("end_window_size", endWindowSize);
        request.addProperty("force_to_speech_time", forceToSpeechTime);

        JsonObject payload = new JsonObject();
        payload.add("user", user);
        payload.add("audio", audio);
        payload.add("request", request);

        String payloadStr = payload.toString();
        System.out.println(payloadStr);
        // step2: 压缩 payload 字段。
        final byte[] payloadBytes = gzipCompress(payloadStr.getBytes());
        // step3:组装 fullClientRequest；fullClientRequest= header+ sequence + payload
        byte[] header = getHeader(FULL_CLIENT_REQUEST, POS_SEQUENCE, JSON, GZIP, (byte) 0);
        final byte[] payloadSize = intToBytes(payloadBytes.length);
        seq = 1;
        byte[] seqBytes = generateBeforPayload(seq);
        final byte[] fullClientRequest = new byte[header.length + seqBytes.length + payloadSize.length
                + payloadBytes.length];
        int destPos = 0;
        System.arraycopy(header, 0, fullClientRequest, destPos, header.length);
        destPos += header.length;
        System.arraycopy(seqBytes, 0, fullClientRequest, destPos, seqBytes.length);
        destPos += seqBytes.length;
        System.arraycopy(payloadSize, 0, fullClientRequest, destPos, payloadSize.length);
        destPos += payloadSize.length;
        System.arraycopy(payloadBytes, 0, fullClientRequest, destPos, payloadBytes.length);
        boolean suc = webSocket.send(ByteString.of(fullClientRequest));
        if (!suc) {
            return;
        }
//        AudioFormat format = ins.getFormat();
//        // 一次性传输的帧数可视内存及网络承载能力决定，不唯一。
//        int frames = (int) Math.min(ins.getFrameLength(), ins.getFrameLength() / 10);// 切成10 段。
//        bufferSize = (format.getSampleSizeInBits() / Byte.SIZE) * format.getChannels() * frames;
//        buffer = new byte[bufferSize];

        this.inputStream.doOnNext(buffer -> {
                    sendAudioOnlyRequest(webSocket, buffer, buffer.length, false);
                    System.out.println("send audio request, len: " + buffer.length);
                })
                .subscribe();
    }


    @Override
    public void onMessage(WebSocket webSocket, String text) {
        super.onMessage(webSocket, text);
        System.out.println("===> onMessage： text:" + text);
    }

    @Override
    public void onMessage(WebSocket webSocket, ByteString bytes) {

        System.out.println("===> onMessage： binary size:" + bytes.size());
        byte[] res = bytes.toByteArray();
        Map<String, Object> result = parserResponse(res);
        emitter.onNext(result);
    }

    // audio_only_request= header + sequence + payload size+ payload
    boolean sendAudioOnlyRequest(WebSocket webSocket, byte[] buffer, int len, boolean isLast) {
        seq++;
//        System.out.println("seq:" + seq);
        if (isLast) {
            seq = -seq;
        }
        byte messageTypeSpecificFlags = isLast ? NEG_WITH_SEQUENCE : POS_SEQUENCE;
        // header
        byte[] header = getHeader(AUDIO_ONLY_REQUEST, messageTypeSpecificFlags, JSON, GZIP, (byte) 0);
        // sequence
        byte[] sequenceBytes = generateBeforPayload(seq);
        // payload size
        byte[] payloadBytes = gzipCompress(buffer, len);
        // payload
        byte[] payloadSize = intToBytes(payloadBytes.length);
        byte[] audio_only_request = new byte[header.length + sequenceBytes.length + payloadSize.length
                + payloadBytes.length];
        int destPos = 0;
        System.arraycopy(header, 0, audio_only_request, destPos, header.length);
        destPos += header.length;
        System.arraycopy(sequenceBytes, 0, audio_only_request, destPos, sequenceBytes.length);
        destPos += sequenceBytes.length;
        System.arraycopy(payloadSize, 0, audio_only_request, destPos, payloadSize.length);
        destPos += payloadSize.length;
        System.arraycopy(payloadBytes, 0, audio_only_request, destPos, payloadBytes.length);
        return webSocket.send(ByteString.of(audio_only_request));
    }

    @Override
    public void onClosing(WebSocket webSocket, int code, String reason) {
        super.onClosing(webSocket, code, reason);
        System.out.println("===> onClosing： code:" + code + " reason:" + reason);
    }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
        super.onClosed(webSocket, code, reason);
        System.out.println("===> onClosed： code:" + code + " reason:" + reason);
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        super.onFailure(webSocket, t, response);
        System.out.println(
                "===> onFailure： Throwable:" + t.getMessage() + " Response:" + (response == null ? "null"
                        : response.toString()));
        System.exit(0);
    }

    static byte[] getHeader(byte messageType, byte messageTypeSpecificFlags, byte serialMethod, byte compressionType,
                            byte reservedData) {
        final byte[] header = new byte[4];
        header[0] = (PROTOCOL_VERSION << 4) | DEFAULT_HEADER_SIZE; // Protocol version|header size
        header[1] = (byte) ((messageType << 4) | messageTypeSpecificFlags); // message type | messageTypeSpecificFlags
        header[2] = (byte) ((serialMethod << 4) | compressionType);
        header[3] = reservedData;
        return header;
    }

    static byte[] intToBytes(int a) {
        return new byte[]{
                (byte) ((a >> 24) & 0xFF),
                (byte) ((a >> 16) & 0xFF),
                (byte) ((a >> 8) & 0xFF),
                (byte) (a & 0xFF)

        };
    }

    static int bytesToInt(byte[] src) {
        if (src == null || (src.length != 4)) {
            throw new IllegalArgumentException("");
        }
        return ((src[0] & 0xFF) << 24)
                | ((src[1] & 0xff) << 16)
                | ((src[2] & 0xff) << 8)
                | ((src[3] & 0xff));
    }

    static byte[] generateBeforPayload(int seq) {
        return intToBytes(seq);
    }

    static byte[] gzipCompress(byte[] src) {
        return gzipCompress(src, src.length);
    }

    static byte[] gzipCompress(byte[] src, int len) {
        if (src == null || len == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = null;
        try {
            gzip = new GZIPOutputStream(out);
            gzip.write(src, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (gzip != null) {
                try {
                    gzip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return out.toByteArray();
    }

    static byte[] gzipDecompress(byte[] src) {
        if (src == null || src.length == 0) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream ins = new ByteArrayInputStream(src);
        GZIPInputStream gzip = null;
        try {
            gzip = new GZIPInputStream(ins);
            byte[] buffer = new byte[ins.available()];
            int len = 0;
            while ((len = gzip.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (gzip != null) {
                try {
                    gzip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return out.toByteArray();
    }


    static Map<String, Object> parserResponse(byte[] res) {
        Map<String, Object> result = new HashMap<>();
        result.put("messageType", EVENT_SessionStarted);
        if (res == null || res.length == 0) {
            result.put("code", -1);
            result.put("messageType", EVENT_SessionFinished);
            return result;
        }
        // 当符号位为1时进行 >> 运算后高位补1（预期是补0），导致结果错误，所以增加个数再与其& 运算，目的是确保高位是补0.
        final byte num = 0b00001111;
        // header 32 bit=4 byte
        int protocol_version = (res[0] >> 4) & num;
        result.put("protocol_version", protocol_version);
        int header_size = res[0] & 0x0f;
        result.put("header_size", header_size);

        int message_type = (res[1] >> 4) & num;
        result.put("message_type", message_type);
        int message_type_specific_flags = res[1] & 0x0f;
        result.put("message_type_specific_flags", message_type_specific_flags);
        int serialization_method = res[2] >> num;
        result.put("serialization_method", serialization_method);
        int message_compression = res[2] & 0x0f;
        result.put("message_compression", message_compression);
        int reserved = res[3];
        result.put("reserved", reserved);

        // sequence 4 byte
        byte[] temp = new byte[4];
        System.arraycopy(res, 4, temp, 0, temp.length);
        int sequence = bytesToInt(temp);// sequence 4 byte

        // payload size 4 byte
        String payloadStr = null;
        System.arraycopy(res, 8, temp, 0, temp.length);
        int payloadSize = bytesToInt(temp);
        byte[] payload = new byte[res.length - 12];
        System.arraycopy(res, 12, payload, 0, payload.length);
        // 正常Response
        if (message_type == FULL_SERVER_RESPONSE) {
            if (message_compression == GZIP) {
                payloadStr = new String(gzipDecompress(payload));
            } else {
                payloadStr = new String(payload);
            }
            result.put("payloadSize", payloadSize);
            result.put("payload", payloadStr);
            result.put("messageType", message_type);
            result.put("code", sequence);

        } else if (message_type == SERVER_ACK) {
            payloadStr = new String(payload);
            result.put("payloadSize", payloadSize);
            result.put("messageType", message_type);
            result.put("code", sequence);
            result.put("payload", payloadStr);

        } else if (message_type == SERVER_ERROR_RESPONSE) {
            // 此时 sequence 含义就是 错误码 code，payload 就是 error msg。
            payloadStr = new String(payload);
            result.put("code", sequence);
            result.put("errorMsg", payloadStr);
            result.put("messageType", message_type);

        }
        return result;
    }
}
