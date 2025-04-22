package com.volcengine.speech.client;

import com.google.gson.JsonObject;
import com.volcengine.speech.Const;
import com.volcengine.speech.model.AsrResponse;
import okio.ByteString;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import static com.volcengine.speech.Const.*;

public class AsrBigModelClient extends WebSocketClient {
    private static final String URL = "wss://openspeech.bytedance.com/api/v3/sauc/bigmodel_nostream";
    private static final Logger logger = LoggerFactory.getLogger(WebSocketClient.class);
    private String appid;
    private String token;
    private String sk;
    private String cluster;
    private String workflow = "audio_in,resample,partition,vad,fe,decode";
    private String uid = "user_id";
    private int nhest = 1;
    private boolean show_utterances = true;
    private String result_type = "full";
    private String format = "wav";
    private String codec = "raw";
    private int sample_rate = 16000;
    private int channels = 1;
    private int bits = 16;
    private Const.AuthType authType = Const.AuthType.TOKEN;
    private byte[] params_msg = null;
    private Map<String, Object> asr_response;
    private CountDownLatch recv_latch = null;
    private int recv_timeout = 5;
    private boolean recv_suc = true;
    private int seq;
    public static AsrBigModelClient build() throws URISyntaxException {
        URI uri = new URI(URL);
        return new AsrBigModelClient(uri);
    }

    // TODO 接受一个 listener 监听消息, onOpen, onMessage, onError, onComplete
    private AsrBigModelClient(URI uri) {
        super(uri);
    }



    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        logger.info("asr client onOpen");
    }

    @Override
    public void onMessage(String s) {
        logger.info("onMessage String, should be onMessage(ByteBuffer) called");
//        try {
//            if (parse_response(s) != 0) {
//                logger.error("error happends to close connection");
//                close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void onMessage(ByteBuffer bytes) {
        try {
            if (parse_response(bytes.array()) != 0) {
                recv_suc = false;
                logger.error("error happends to close connection");
                close();
            }
            recv_latch.countDown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        logger.info("asr onClose {}, {}, {}", i, s, b);
    }

    @Override
    public void onError(Exception e) {
        logger.info("asr onError {}", e.getMessage());
        recv_suc = false;
        recv_latch.countDown();
        this.close();
    }

//    public int asr_connect() throws IOException, NoSuchAlgorithmException, InvalidKeyException {
//        this.params_msg = construct_param();
//        set_auth_header();
//        this.connect();
//        return 0;
//    }

    public boolean asr_sync_connect() throws IOException, InterruptedException, NoSuchAlgorithmException, InvalidKeyException {
        this.params_msg = construct_param();
        set_auth_header();
        boolean ret = this.connectBlocking();
        if (!ret) {
            return ret;
        }
        recv_latch = new CountDownLatch(1);
        this.send(this.params_msg);
        ret = recv_latch.await(recv_timeout, TimeUnit.SECONDS);
        return ret && recv_suc;
    }

    public Map<String, Object> asr_send(byte[] audio, boolean is_last) throws IOException, InterruptedException {
        recv_latch = new CountDownLatch(1);
        byte[] payload = construct_audio_payload(audio, is_last);
        this.send(payload);
        boolean ret = recv_latch.await(recv_timeout, TimeUnit.SECONDS);
        if (!ret) {
            logger.error("recv message timeout");
            this.close();
            return new HashMap<>();
        }
        return asr_response;
    }

    public int asr_close() {
        this.close();
        return 0;
    }

    private void set_auth_header() throws NoSuchAlgorithmException, InvalidKeyException {
        this.addHeader("X-Api-App-Key", appid);
        this.addHeader("X-Api-Access-Key", token);
        this.addHeader("X-Api-Resource-Id", "volc.bigasr.sauc.duration");
        this.addHeader("X-Api-Connect-Id", UUID.randomUUID().toString());
    }

    private byte[] construct_param() throws IOException {

        // send full client request
        // step 1: append payload json string
        JsonObject user = new JsonObject();
        user.addProperty("uid", "test");

        JsonObject audio = new JsonObject();
        audio.addProperty("format", "pcm"); //
        audio.addProperty("sample_rate", sample_rate);
        audio.addProperty("bits", bits);
        audio.addProperty("channel", channels);
        audio.addProperty("codec", "raw");

        JsonObject request = new JsonObject();
        request.addProperty("model_name", "bigmodel");
        request.addProperty("enable_punc", true);

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
        return fullClientRequest;
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

    private int parse_response(byte[] res) throws IOException {
        asr_response = new HashMap<>();
        asr_response.put("messageType", EVENT_SessionStarted);
        if (res == null || res.length == 0) {
            asr_response.put("code", -1);
            asr_response.put("messageType", EVENT_SessionFinished);
            return -1;
        }
        // 当符号位为1时进行 >> 运算后高位补1（预期是补0），导致结果错误，所以增加个数再与其& 运算，目的是确保高位是补0.
        final byte num = 0b00001111;
        // header 32 bit=4 byte
        int protocol_version = (res[0] >> 4) & num;
        asr_response.put("protocol_version", protocol_version);
        int header_size = res[0] & 0x0f;
        asr_response.put("header_size", header_size);

        int message_type = (res[1] >> 4) & num;
        asr_response.put("message_type", message_type);
        int message_type_specific_flags = res[1] & 0x0f;
        asr_response.put("message_type_specific_flags", message_type_specific_flags);
        int serialization_method = res[2] >> num;
        asr_response.put("serialization_method", serialization_method);
        int message_compression = res[2] & 0x0f;
        asr_response.put("message_compression", message_compression);
        int reserved = res[3];
        asr_response.put("reserved", reserved);

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
            asr_response.put("payloadSize", payloadSize);
            asr_response.put("payload", payloadStr);
            asr_response.put("messageType", message_type);
            asr_response.put("code", sequence);

        } else if (message_type == SERVER_ACK) {
            payloadStr = new String(payload);
            asr_response.put("payloadSize", payloadSize);
            asr_response.put("messageType", message_type);
            asr_response.put("code", sequence);
            asr_response.put("payload", payloadStr);

        } else if (message_type == SERVER_ERROR_RESPONSE) {
            // 此时 sequence 含义就是 错误码 code，payload 就是 error msg。
            payloadStr = new String(payload);
            asr_response.put("code", sequence);
            asr_response.put("errorMsg", payloadStr);
            asr_response.put("messageType", message_type);
            return -1;
        }
        return 0;
    }

    private byte[] construct_audio_payload(byte[] buffer, boolean isLast) throws IOException {
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
        byte[] payloadBytes = gzipCompress(buffer, buffer.length);
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
        return audio_only_request;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public void setWorkflow(String workflow) {
        this.workflow = workflow;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setShow_utterances(boolean show_utterances) {
        this.show_utterances = show_utterances;
    }

    public void setResult_type(String result_type) {
        this.result_type = result_type;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public void setSample_rate(int sample_rate) {
        this.sample_rate = sample_rate;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public Map<String, Object> getAsrResponse() {
        return asr_response;
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

    private byte[] concat_byte(byte[] first, byte[] second, byte[] third) {
        byte[] result = new byte[first.length + second.length + third.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        System.arraycopy(third, 0, result, first.length+second.length, third.length);
        return result;
    }
}
