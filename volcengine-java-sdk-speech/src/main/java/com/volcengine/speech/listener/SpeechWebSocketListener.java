package com.volcengine.speech.listener;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
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
 * SpeechWebSocketListener is a subclass of WebSocketListener.
 *
 * @author ningy
 */
public class SpeechWebSocketListener extends WebSocketListener {
    private static final Logger logger = Logger.getLogger(SpeechWebSocketListener.class.getName());

    boolean hasFinishedSession = false;
    final String sessionId = UUID.randomUUID().toString().replace("-", "");

    private String speaker;

    private Flowable<String> inputStream;

    private FlowableEmitter<byte[]> emitter;

    public SpeechWebSocketListener(String speaker, Flowable<String> inputStream, FlowableEmitter<byte[]>  emitter) {
        this.speaker = speaker;
        this.inputStream = inputStream;
        this.emitter = emitter;
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        logger.info("WebSocket opened: X-Tt-Logid: " + response.header("X-Tt-Logid"));
        startConnection(webSocket);
        this.inputStream.subscribe(
                item -> {
                    logger.info("===>sendTTSMessage item:" + item);
                    sendMessageWithSeq(webSocket, speaker, sessionId, item, -1);
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
        logger.info("WebSocket received message: " + bytes.hex());
        TTSResponse response = parserResponse(bytes.toByteArray());

        switch (response.optional.event) {
            case EVENT_ConnectionFailed:
            case EVENT_SessionFailed: {
                logger.info("===>response error:" + response.optional.event);
            }
            case EVENT_ConnectionStarted:
                startTTSSession(webSocket, sessionId, speaker);
                break;
            case EVENT_SessionStarted:
//                sendTTSMessage(webSocket, speaker, sessionId);
                break;
            case EVENT_TTSSentenceStart:
                logger.info("===>response TTSSentenceStart:" + response.optional.event);
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
            case EVENT_TTSSentenceEnd:
                logger.info("===>response TTSSentenceEnd:" + response.optional.event);
                break;
            case EVENT_ConnectionFinished:
                logger.info("===>response ConnectionFinished:" + response.optional.event);
                emitter.onComplete();
                break;
            case EVENT_SessionFinished:
                logger.info("===>response SessionFinished:" + response.optional.event);
                finishConnection(webSocket);
                break;
            default:
                logger.info("===>response default:" + response.optional.event);
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
    
    private boolean startConnection(WebSocket webSocket) {
        byte[] header = getHeader(FULL_CLIENT_REQUEST, MsgTypeFlagWithEvent, JSON,
                COMPRESSION_NO, (byte) 0);
        return sendEvent(webSocket, header, EVENT_Start_Connection, null, null, "{}".getBytes());
    }

    private boolean finishConnection(WebSocket webSocket) {
        byte[] header = getHeader(FULL_CLIENT_REQUEST, MsgTypeFlagWithEvent, JSON,
                COMPRESSION_NO, (byte) 0);
        return sendEvent(webSocket, header, EVENT_FINISHED_Connection, null, null, "{}".getBytes());
    }

    private boolean finishSession(WebSocket webSocket, String sessionId) {
        byte[] header = getHeader(FULL_CLIENT_REQUEST, MsgTypeFlagWithEvent, JSON,
                COMPRESSION_NO, (byte) 0);
        return sendEvent(webSocket, header, EVENT_FinishSession, sessionId, null, "{}".getBytes());
    }

    private boolean startTTSSession(WebSocket webSocket, String sessionId, String speaker) {
        int event = EVENT_StartSession;
        JsonObject payloadJObj = new JsonObject();
        JsonObject user = new JsonObject();
        user.addProperty("uid", "123456");
        payloadJObj.add("user", user);
        payloadJObj.addProperty("event", event);
        payloadJObj.addProperty("namespace", "BidirectionalTTS");

        JsonObject req_params = new JsonObject();
        JsonObject audio_params = new JsonObject();
        audio_params.addProperty("format", "mp3");
        audio_params.addProperty("sample_rate", 16000);
        req_params.addProperty("speaker", speaker);
        req_params.add("audio_params", audio_params);
        payloadJObj.add("req_params", req_params);
        byte[] header = getHeader(FULL_CLIENT_REQUEST, MsgTypeFlagWithEvent, JSON,
                COMPRESSION_NO, (byte) 0);
        return sendEvent(webSocket, header, event, sessionId, null, payloadJObj.toString().getBytes());
    }

    private void sendTTSMessage(WebSocket webSocket, String speaker, String sessionId) {
        this.inputStream.subscribe(
                item -> {
                    logger.info("===>sendTTSMessage item:" + item);
                    sendMessageWithSeq(webSocket, speaker, sessionId, item, -1);
                }
        );
    }

    private boolean sendMessageWithSeq(WebSocket webSocket, String speaker, String sessionId, String text, int seq) {
        JsonObject payloadJObj = new JsonObject();
        JsonObject user = new JsonObject();
        user.addProperty("uid", "123456");
        payloadJObj.add("user", user);

        payloadJObj.addProperty("event", EVENT_TaskRequest);
        payloadJObj.addProperty("namespace", "BidirectionalTTS");

        JsonObject req_params = new JsonObject();
        req_params.addProperty("text", text);
        req_params.addProperty("speaker", speaker);
        JsonObject audio_params = new JsonObject();
        audio_params.addProperty("format", "mp3");
        audio_params.addProperty("sample_rate", 24000);
        req_params.add("audio_params", audio_params);
        payloadJObj.add("req_params", req_params);
        byte[] sequence = null;
        if (seq >= 0) {
            sequence = intToBytes(seq);
        }
        byte[] header = getHeader(FULL_CLIENT_REQUEST, MsgTypeFlagWithEvent, JSON,
                COMPRESSION_NO, (byte) 0);
        return sendEvent(webSocket, header, EVENT_TaskRequest, sessionId, sequence,
                payloadJObj.toString().getBytes());
    }

    private TTSResponse parserResponse(byte[] res) {
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
        Optional optional = new Optional();
        response.optional = optional;
        logger.info("===>parserResponse:header:" + new Gson().toJson(header));
        // 正常Response
        if (header.message_type == FULL_SERVER_RESPONSE || header.message_type == AUDIO_ONLY_RESPONSE) {
            // 如果有event
            offset += readEvent(res, header.message_type_specific_flags, response);
            final int event = response.optional.event;
            // 根据 event 类型解析
            switch (event) {
                case EVENT_NONE:
                    break;
                case EVENT_ConnectionStarted:
                    readConnectStarted(res, response, offset);
                    break;
                case EVENT_ConnectionFailed:
                    readConnectFailed(res, response, offset);
                    break;
                case EVENT_SessionStarted:
                case EVENT_SessionFailed:
                case EVENT_SessionFinished:
                    offset += readSessionId(res, response, offset);
                    readMetaJson(res, response, offset);
                    break;
                default:
                    offset += readSessionId(res, response, offset);
                    offset += readSequence(res, response, offset);
                    readPayload(res, response, offset);
                    break;
            }
        }
        // 错误
        else if (header.message_type == ERROR_INFORMATION) {
            offset += readErrorCode(res, response, offset);
            readPayload(res, response, offset);
        }
        return response;
    }

    private byte[] getHeader(byte messageType, byte messageTypeSpecificFlags, byte serialMethod, byte compressionType,
                            byte reservedData) {
        return new byte[]{
                // Protocol version | Header size (4x)
                (PROTOCOL_VERSION << 4) | DEFAULT_HEADER_SIZE,
                // Message type | Message type specific flags
                (byte) (messageType << 4 | messageTypeSpecificFlags),
                // Serialization method | Compression method
                (byte) ((serialMethod << 4) | compressionType),
                reservedData
        };
    }

    private boolean sendEvent(WebSocket webSocket, byte[] header, int event, String sessionId, byte[] sequence,
                             byte[] payload) {
        assert webSocket != null;
        assert header != null;
        assert payload != null;
        int full_client_request_size = header.length;
        byte[] eventBytes = null;
        if (event != EVENT_NONE) {
            eventBytes = intToBytes(event);
            full_client_request_size += eventBytes.length;
        }
        byte[] sessionIdBytes = null;
        byte[] sessionIdSize = null;
        if (sessionId != null) {
            sessionIdBytes = sessionId.getBytes();
            sessionIdSize = intToBytes(sessionIdBytes.length);
            full_client_request_size += sessionIdBytes.length;
            full_client_request_size += sessionIdSize.length;
        }
        if (sequence != null) {
            full_client_request_size += sequence.length;
        }

        full_client_request_size += payload.length;
        byte[] payloadSize = intToBytes(payload.length);
        full_client_request_size += payloadSize.length;

        byte[] full_client_request = new byte[full_client_request_size];

        int destPos = 0;
        System.arraycopy(header, 0, full_client_request, destPos, header.length);
        destPos += header.length;
        if (eventBytes != null) {
            System.arraycopy(eventBytes, 0, full_client_request, destPos, eventBytes.length);
            destPos += eventBytes.length;
        }
        if (sessionIdBytes != null) {
            System.arraycopy(sessionIdSize, 0, full_client_request, destPos, sessionIdSize.length);
            destPos += sessionIdSize.length;
            System.arraycopy(sessionIdBytes, 0, full_client_request, destPos, sessionIdBytes.length);
            destPos += sessionIdBytes.length;
        }
        // 序列号
        if (sequence != null) {
            System.arraycopy(sequence, 0, full_client_request, destPos, sequence.length);
            destPos += sequence.length;
        }
        System.arraycopy(payloadSize, 0, full_client_request, destPos, payloadSize.length);
        destPos += payloadSize.length;
        System.arraycopy(payload, 0, full_client_request, destPos, payload.length);
        return webSocket.send(ByteString.of(full_client_request));
    }

    private void readConnectStarted(byte[] res, TTSResponse response, int start) {
        // 8--11: connection id size
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        start += b.length;
        response.optional.size += b.length;
        response.optional.connectionSize = bytesToInt(b);
        logger.info("===>readConnectStarted connectionSize:" + response.optional.connectionSize);
        b = new byte[response.optional.connectionSize];
        System.arraycopy(res, start, b, 0, b.length);
        start += b.length;
        response.optional.size += b.length;
        // 12--18: connection id size
        response.optional.connectionId = new String(b);
        logger.info("===>readConnectStarted connectionId:" + response.optional.connectionId);
        readPayload(res, response, start);
    }

    private void readConnectFailed(byte[] res, TTSResponse response, int start) {
        // 8--11: connection id size
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        response.optional.size += b.length;
        start += b.length;
        response.optional.connectionSize = bytesToInt(b);
        logger.info("===>connectionSize:" + response.optional.connectionSize);
        readMetaJson(res, response, start);
    }


    private int readSequence(byte[] res, TTSResponse response, int start) {
        final Header header = response.header;
        final Optional optional = response.optional;
        if (header.message_type_specific_flags == MsgTypeFlagNegativeSeq
                || header.message_type_specific_flags == MsgTypeFlagPositiveSeq) {
            byte[] temp = new byte[4];
            System.arraycopy(res, start, temp, 0, temp.length);
            optional.sequence = bytesToInt(temp);
            optional.size += temp.length;
            logger.info("===>sequence:" + optional.sequence);
            return temp.length;
        }
        return 0;
    }

    private void readMetaJson(byte[] res, TTSResponse response, int start) {
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        start += b.length;
        response.optional.size += b.length;
        int size = bytesToInt(b);
        b = new byte[size];
        System.arraycopy(res, start, b, 0, b.length);
        response.optional.size += b.length;
        response.optional.response_meta_json = new String(b);
        logger.info("===> response_meta_json:" + response.optional.response_meta_json);
    }

    private int readPayload(byte[] res, TTSResponse response, int start) {
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        start += b.length;
        int size = bytesToInt(b);
        response.payloadSize += size;
        b = new byte[size];
        System.arraycopy(res, start, b, 0, b.length);
        response.payload = b;
        if (response.optional.event == FULL_SERVER_RESPONSE) {
            logger.info("===> payload:" + new String(b));
        }
        return 4 + size;
    }

    private int readErrorCode(byte[] res, TTSResponse response, int start) {
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        response.optional.errorCode = bytesToInt(b);
        response.optional.size += b.length;
        return b.length;
    }


    private int readEvent(byte[] res, int masTypeFlag, TTSResponse response) {
        if (masTypeFlag == MsgTypeFlagWithEvent) {
            byte[] temp = new byte[4];
            System.arraycopy(res, 4, temp, 0, temp.length);
            int event = bytesToInt(temp);
            response.optional.event = event;
            response.optional.size += 4;
            logger.info("===>event:" + event);
            return temp.length;
        }
        return 0;
    }


    private int readSessionId(byte[] res, TTSResponse response, int start) {
        byte[] b = new byte[4];
        System.arraycopy(res, start, b, 0, b.length);
        start += b.length;
        final int size = bytesToInt(b);
        byte[] sessionIdBytes = new byte[size];
        System.arraycopy(res, start, sessionIdBytes, 0, sessionIdBytes.length);
        response.optional.sessionId = new String(sessionIdBytes);
        logger.info("===>sessionId:" + response.optional.sessionId);
        return b.length + size;
    }

    private byte[] intToBytes(int a) {
        return new byte[]{
                (byte) ((a >> 24) & 0xFF),
                (byte) ((a >> 16) & 0xFF),
                (byte) ((a >> 8) & 0xFF),
                (byte) (a & 0xFF)

        };
    }

    private int bytesToInt(byte[] src) {
        if (src == null || (src.length != 4)) {
            throw new IllegalArgumentException("");
        }
        return ((src[0] & 0xFF) << 24)
                | ((src[1] & 0xff) << 16)
                | ((src[2] & 0xff) << 8)
                | ((src[3] & 0xff));
    }

    public static class Header {

        public int protocol_version;
        public int header_size;
        public int message_type;
        public int message_type_specific_flags;
        public int serialization_method;
        public int message_compression;
        public int reserved;
    }

    public static class Optional {

        public int size;
        public int event = EVENT_NONE;
        public String sessionId;

        public int errorCode;
        public int connectionSize;
        public String connectionId;

        public String response_meta_json;
        public int sequence;

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static class TTSResponse {

        public Header header;
        public Optional optional;
        public int payloadSize;
        transient public byte[] payload;


    }
}
