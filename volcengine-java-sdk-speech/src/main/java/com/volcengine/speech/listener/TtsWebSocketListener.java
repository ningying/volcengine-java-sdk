package com.volcengine.speech.listener;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.volcengine.speech.model.TtsStreamRequest;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

import java.util.UUID;
import java.util.logging.Logger;

import static com.volcengine.speech.Const.*;

/**
 * TtshWebSocketListener is a subclass of WebSocketListener.
 *
 * @author ningy
 */
public class TtsWebSocketListener extends WebSocketListener {
    private static final Logger logger = Logger.getLogger(TtsWebSocketListener.class.getName());

    boolean hasFinishedSession = false;
    final String sessionId = UUID.randomUUID().toString().replace("-", "");

    private TtsStreamRequest ttsStreamRequest;

    private Flowable<String> inputStream;

    private FlowableEmitter<byte[]> emitter;
    // Message Serialization
    private static final int NO_SERIALIZATION = 0b0000;
    private static final int JSON = 0b0001;

    public TtsWebSocketListener(TtsStreamRequest ttsStreamRequest, FlowableEmitter<byte[]>  emitter) {
        this.inputStream = ttsStreamRequest.getInputStream();
        this.ttsStreamRequest = ttsStreamRequest;
        this.emitter = emitter;
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        logger.info("WebSocket opened: X-Tt-Logid: " + response.header("X-Tt-Logid"));
        startConnection(webSocket);
        this.inputStream.subscribe(
                item -> {
                    logger.info("===>sendTTSMessage item:" + item);
                    sendMessage(webSocket, ttsStreamRequest, sessionId, item);
                },
                error -> {
                    logger.severe("===>sendTTSMessage error:" + error.getMessage());
                },
                () -> {
                    logger.info("===>sendTTSMessage complete");
                    finishSession(webSocket, sessionId);
                }
        );
    }

    @Override
    public void onMessage(WebSocket webSocket, ByteString bytes) {
        TTSResponse response = parserResponse(bytes.toByteArray());
        System.out.println("===>response:" + response);
        switch (response.optional.event) {
            case EVENT_ConnectionFailed:
            case EVENT_SessionFailed:
                logger.info("===>response error:" + response.optional.event);
                break;
            case EVENT_ConnectionStarted:
                logger.info("===>response ConnectionStarted:" + response.optional.event);
                startTTSSession(webSocket, sessionId, ttsStreamRequest);
                break;
            case EVENT_SessionStarted:
                logger.info("===>response SessionStarted:" + response.optional.event);
                break;
            case EVENT_TTSSentenceStart:
                logger.info("===>response TTSSentenceStart:" + response.optional.event);
                break;
            case EVENT_TTSSentenceEnd:
                logger.info("===>response TTSSentenceEnd:" + response.optional.event);
                break;
            case EVENT_TTSResponse: {
                logger.info("===>response TTSResponse:" + response.optional.event);
                if (response.payload == null) {
                    return;
                }
                // 输出结果
                if (response.header.message_type == AUDIO_ONLY_RESPONSE) {
                    emitter.onNext(response.payload);
                } else if (response.header.message_type == FULL_SERVER_RESPONSE) {
                    logger.info("===> payload:" + new String(response.payload));
                }
                break;
            }
            case EVENT_ConnectionFinished:
                logger.info("===>response SessionFinished:" + response.optional.event);
                emitter.onComplete();
                // 关闭连接
                webSocket.close(1000, "Connection Finished");
            case EVENT_SessionFinished:
                finishConnection(webSocket);
                break;
            default:
                break;
        }
    }

    
    @Override
    public void onClosing(WebSocket webSocket, int code, String reason) {
        logger.info("===> onClosing： code:" + code + " reason:" + reason);
    }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
        logger.info("===> onClosed： code:" + code + " reason:" + reason);
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        logger.severe(
                "===> onFailure： Throwable:" + t.getMessage() + " Response:" + (response == null ? "null"
                        : response.toString()));
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

    static byte[] intToBytes(int a) {
        return new byte[]{
                (byte) ((a >> 24) & 0xFF),
                (byte) ((a >> 16) & 0xFF),
                (byte) ((a >> 8) & 0xFF),
                (byte) (a & 0xFF)

        };
    }

    public static class Header {

        public int protocol_version = PROTOCOL_VERSION;
        public int header_size = DEFAULT_HEADER_SIZE;
        public int message_type;
        public int message_type_specific_flags = MsgTypeFlagWithEvent;
        public int serialization_method = NO_SERIALIZATION;
        public int message_compression = COMPRESSION_NO;
        public int reserved = 0;

        public Header() {
        }

        public Header(int protocol_version, int header_size, int message_type, int message_type_specific_flags,
                      int serialization_method, int message_compression, int reserved) {
            this.protocol_version = protocol_version;
            this.header_size = header_size;
            this.message_type = message_type;
            this.message_type_specific_flags = message_type_specific_flags;
            this.serialization_method = serialization_method;
            this.message_compression = message_compression;
            this.reserved = reserved;
        }

        /**
         * 转成 byte 数组
         *
         * @return
         */
        public byte[] getBytes() {
            return new byte[]{
                    // Protocol version | Header size (4x)
                    (byte) ((protocol_version << 4) | header_size),
                    // Message type | Message type specific flags
                    (byte) (message_type << 4 | message_type_specific_flags),
                    // Serialization method | Compression method
                    (byte) ((serialization_method << 4) | message_compression),
                    (byte) reserved
            };
        }
    }

    public static class Optional {

        public int event = EVENT_NONE;
        public String sessionId;

        public int errorCode;
        public String connectionId;

        public String response_meta_json;

        public Optional(int event, String sessionId) {
            this.event = event;
            this.sessionId = sessionId;
        }

        public Optional() {
        }

        public byte[] getBytes() {
            byte[] bytes = new byte[0];
            if (event != EVENT_NONE) {
                bytes = intToBytes(event);
            }
            if (sessionId != null) {
                byte[] sessionIdSize = intToBytes(sessionId.getBytes().length);
                final byte[] temp = bytes;
                int desPos = 0;
                bytes = new byte[temp.length + sessionIdSize.length + sessionId.getBytes().length];
                System.arraycopy(temp, 0, bytes, desPos, temp.length);
                desPos += temp.length;
                System.arraycopy(sessionIdSize, 0, bytes, desPos, sessionIdSize.length);
                desPos += sessionIdSize.length;
                System.arraycopy(sessionId.getBytes(), 0, bytes, desPos, sessionId.getBytes().length);

            }
            return bytes;
        }
    }

    static class Pair<F, S> {

        public Pair(F fst, S snd) {
            this.fst = fst;
            this.snd = snd;
        }

        public F fst;
        public S snd;
    }

    public static class TTSResponse {

        public Header header;
        public Optional optional;
        public int payloadSize;
        transient public byte[] payload;

        public String payloadJson;


        @Override
        public String toString() {
            return new Gson().toJson(this);
        }


    }


    /**
     * 解析响应包
     *
     * @param res
     * @return
     */
    static TTSResponse parserResponse(byte[] res) {
        if (res == null || res.length == 0) {
            return null;
        }
        final TTSResponse response = new TTSResponse();
        Header header = new Header();
        response.header = header;

        // 当符号位为1时进行 >> 运算后高位补1（预期是补0），导致结果错误，所以增加个数再与其& 运算，目的是确保高位是补0.
        final byte num = 0b00001111;
        // header 32 bit=4 byte
        header.protocol_version = (res[0] >> 4) & num;
        header.header_size = res[0] & 0x0f;
        header.message_type = (res[1] >> 4) & num;
        header.message_type_specific_flags = res[1] & 0x0f;
        header.serialization_method = res[2] >> num;
        header.message_compression = res[2] & 0x0f;
        header.reserved = res[3];

        int offset = 4;
        response.optional = new Optional();
        // 正常Response
        if (header.message_type == FULL_SERVER_RESPONSE || header.message_type == AUDIO_ONLY_RESPONSE) {
            // 如果有event
            offset = readEvent(res, header.message_type_specific_flags, response, offset);
            final int event = response.optional.event;
            // 根据 event 类型解析
            switch (event) {
                case EVENT_ConnectionStarted:
                    readConnectStarted(res, response, offset);
                    break;
                case EVENT_ConnectionFailed:
                    readConnectFailed(res, response, offset);
                    break;
                case EVENT_SessionStarted:
                    offset = readSessionId(res, response, offset);
                    break;
                case EVENT_TTSResponse:
                    offset = readSessionId(res, response, offset);
                    offset = readPayload(res, response, offset);
                    break;
                case EVENT_TTSSentenceStart:
                case EVENT_TTSSentenceEnd:
                    offset = readSessionId(res, response, offset);
                    offset = readPayloadJson(res, response, offset);
                    break;

                case EVENT_SessionFailed:
                case EVENT_SessionFinished:
                    offset = readSessionId(res, response, offset);
                    readMetaJson(res, response, offset);
                    break;
                default:
                    break;


            }
        }
        // 错误
        else if (header.message_type == ERROR_INFORMATION) {
            offset = readErrorCode(res, response, offset);
            readPayload(res, response, offset);
        }
        return response;
    }

    static void readConnectStarted(byte[] res, TTSResponse response, int start) {
        // 8--11: connection id size
        start = readConnectId(res, response, start);
    }

    static void readConnectFailed(byte[] res, TTSResponse response, int start) {
        // 8--11: connection id len
        start = readConnectId(res, response, start);

        readMetaJson(res, response, start);
    }

    static int readConnectId(byte[] res, TTSResponse response, int start) {
        Pair<Integer, String> r = readText(res, start);
        start = r.fst;
        response.optional.connectionId = r.snd;
        return start;
    }


    static int readMetaJson(byte[] res, TTSResponse response, int start) {
        Pair<Integer, String> r = readText(res, start);
        start = r.fst;
        response.optional.response_meta_json = r.snd;
        return start;
    }

    static int readPayloadJson(byte[] res, TTSResponse response, int start) {
        Pair<Integer, String> r = readText(res, start);
        start = r.fst;
        response.payloadJson = r.snd;
        return start;
    }

    static Pair<Integer, String> readText(byte[] res, int start) {
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        start += b.length;
        int size = bytesToInt(b);
        b = new byte[size];
        System.arraycopy(res, start, b, 0, b.length);
        String text = new String(b);
        start += b.length;
        return new Pair<>(start, text);
    }

    static int readPayload(byte[] res, TTSResponse response, int start) {
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        start += b.length;
        int size = bytesToInt(b);
        response.payloadSize += size;
        b = new byte[size];
        System.arraycopy(res, start, b, 0, b.length);
        response.payload = b;
        start += b.length;
        if (response.optional.event == FULL_SERVER_RESPONSE) {
            System.out.println("===> payload:" + new String(b));
        }
        return start;
    }

    static int readErrorCode(byte[] res, TTSResponse response, int start) {
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        start += b.length;
        response.optional.errorCode = bytesToInt(b);
        return start;
    }


    static int readEvent(byte[] res, int masTypeFlag, TTSResponse response, int start) {
        if (masTypeFlag == MsgTypeFlagWithEvent) {
            byte[] temp = new byte[4];
            System.arraycopy(res, start, temp, 0, temp.length);
            response.optional.event = bytesToInt(temp);
            start += temp.length;
        }
        return start;
    }


    static int readSessionId(byte[] res, TTSResponse response, int start) {
        Pair<Integer, String> r = readText(res, start);
        start = r.fst;
        response.optional.sessionId = r.snd;
        return start;
    }


    static boolean startConnection(WebSocket webSocket) {
        byte[] header = new Header(
                PROTOCOL_VERSION,
                FULL_CLIENT_REQUEST,
                DEFAULT_HEADER_SIZE,
                MsgTypeFlagWithEvent,
                JSON,
                COMPRESSION_NO,
                0).getBytes();
        byte[] optional = new Optional(EVENT_Start_Connection, null).getBytes();
        byte[] payload = "{}".getBytes();
        return sendEvent(webSocket, header, optional, payload);
    }

    static boolean finishConnection(WebSocket webSocket) {
        byte[] header = new Header(
                PROTOCOL_VERSION,
                FULL_CLIENT_REQUEST,
                DEFAULT_HEADER_SIZE,
                MsgTypeFlagWithEvent,
                JSON,
                COMPRESSION_NO,
                0).getBytes();
        byte[] optional = new Optional(EVENT_FINISHED_Connection, null).getBytes();
        byte[] payload = "{}".getBytes();
        return sendEvent(webSocket, header, optional, payload);

    }

    static boolean finishSession(WebSocket webSocket, String sessionId) {
        byte[] header = new Header(
                PROTOCOL_VERSION,
                FULL_CLIENT_REQUEST,
                DEFAULT_HEADER_SIZE,
                MsgTypeFlagWithEvent,
                JSON,
                COMPRESSION_NO,
                0).getBytes();
        byte[] optional = new Optional(EVENT_FinishSession, sessionId).getBytes();
        byte[] payload = "{}".getBytes();
        return sendEvent(webSocket, header, optional, payload);
    }

    static boolean startTTSSession(WebSocket webSocket, String sessionId, TtsStreamRequest ttsStreamRequest) {
        byte[] header = new Header(
                PROTOCOL_VERSION,
                FULL_CLIENT_REQUEST,
                DEFAULT_HEADER_SIZE,
                MsgTypeFlagWithEvent,
                JSON,
                COMPRESSION_NO,
                0).getBytes();

        final int event = EVENT_StartSession;
        byte[] optional = new Optional(event, sessionId).getBytes();
        JsonObject payloadJObj = new JsonObject();
        JsonObject user = new JsonObject();
        user.addProperty("uid", "123456");

        payloadJObj.add("user", user);
        payloadJObj.addProperty("event", event);
        payloadJObj.addProperty("namespace", "BidirectionalTTS");

        JsonObject req_params = new JsonObject();
        req_params.addProperty("speaker", ttsStreamRequest.getSpeaker());

        JsonObject audio_params = new JsonObject();
        audio_params.addProperty("format", ttsStreamRequest.getFormat());
        audio_params.addProperty("sample_rate", 16000);
        audio_params.addProperty("enable_timestamp", true);
        audio_params.addProperty("speech_rate", ttsStreamRequest.getSpeechRate());
        audio_params.addProperty("loudness_rate", ttsStreamRequest.getLoudnessRate());

        req_params.add("audio_params", audio_params);
        payloadJObj.add("req_params", req_params);
        byte[] payload = payloadJObj.toString().getBytes();
        return sendEvent(webSocket, header, optional, payload);
    }

    /**
     * 分段合成音频
     *
     * @param webSocket
     * @param ttsStreamRequest
     * @param sessionId
     * @param text
     * @return
     */
    static boolean sendMessage(WebSocket webSocket, TtsStreamRequest ttsStreamRequest, String sessionId, String text) {
        byte[] header = new Header(
                PROTOCOL_VERSION,
                FULL_CLIENT_REQUEST,
                DEFAULT_HEADER_SIZE,
                MsgTypeFlagWithEvent,
                JSON,
                COMPRESSION_NO,
                0).getBytes();

        byte[] optional = new Optional(EVENT_TaskRequest, sessionId).getBytes();

        JsonObject payloadJObj = new JsonObject();
        JsonObject user = new JsonObject();
        user.addProperty("uid", "123456");
        payloadJObj.add("user", user);

        payloadJObj.addProperty("event", EVENT_TaskRequest);
        payloadJObj.addProperty("namespace", "BidirectionalTTS");

        JsonObject req_params = new JsonObject();
        req_params.addProperty("text", text);
        req_params.addProperty("speaker", ttsStreamRequest.getSpeaker());

        JsonObject audio_params = new JsonObject();
        audio_params.addProperty("format", ttsStreamRequest.getFormat());
        audio_params.addProperty("sample_rate", 16000);
        audio_params.addProperty("speech_rate", ttsStreamRequest.getSpeechRate());
        audio_params.addProperty("loudness_rate", ttsStreamRequest.getLoudnessRate());

        req_params.add("audio_params", audio_params);
        payloadJObj.add("req_params", req_params);
        byte[] payload = payloadJObj.toString().getBytes();
        return sendEvent(webSocket, header, optional, payload);
    }

    static boolean sendEvent(WebSocket webSocket, byte[] header, byte[] optional, byte[] payload) {
        assert webSocket != null;
        assert header != null;
        assert payload != null;
        final byte[] payloadSizeBytes = intToBytes(payload.length);
        byte[] requestBytes = new byte[
                header.length
                        + (optional == null ? 0 : optional.length)
                        + payloadSizeBytes.length + payload.length];
        int desPos = 0;
        System.arraycopy(header, 0, requestBytes, desPos, header.length);
        desPos += header.length;
        if (optional != null) {
            System.arraycopy(optional, 0, requestBytes, desPos, optional.length);
            desPos += optional.length;
        }
        System.arraycopy(payloadSizeBytes, 0, requestBytes, desPos, payloadSizeBytes.length);
        desPos += payloadSizeBytes.length;
        System.arraycopy(payload, 0, requestBytes, desPos, payload.length);
        return webSocket.send(ByteString.of(requestBytes));
    }
}
