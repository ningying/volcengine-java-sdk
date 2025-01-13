package com.volcengine.speech;

/**
 * 语音常量
 *
 * @author ningy
 */
public class Const {
    public static final String RESOURCE_ID = "Resource-Id";

    public static final byte PROTOCOL_VERSION = 0b0001;
    public static final byte DEFAULT_HEADER_SIZE = 0b0001;

    // Message Type:
    public static final byte FULL_CLIENT_REQUEST = 0b0001;
    public static final byte AUDIO_ONLY_RESPONSE = 0b1011;
    public static final byte FULL_SERVER_RESPONSE = 0b1001;
    public static final byte ERROR_INFORMATION = 0b1111;

    // Message Type Specific Flags
    public static final byte MsgTypeFlagNoSeq = 0b0000; // Non-terminal packet with no sequence
    public static final byte MsgTypeFlagPositiveSeq = 0b1;// Non-terminal packet with sequence > 0
    public static final byte MsgTypeFlagLastNoSeq = 0b10;// last packet with no sequence
    public static final byte MsgTypeFlagNegativeSeq = 0b11; // Payload contains event number (int32)
    public static final byte MsgTypeFlagWithEvent = 0b100;
    // Message Serialization
    public static final byte NO_SERIALIZATION = 0b0000;
    public static final byte JSON = 0b0001;
    // Message Compression
    public static final byte COMPRESSION_NO = 0b0000;
    public static final byte COMPRESSION_GZIP = 0b0001;

    // event


    // 默认事件,对于使用事件的方案，可以通过非0值来校验事件的合法性
    public static final int EVENT_NONE = 0;

    public static final int EVENT_Start_Connection = 1;


    // 上行Connection事件
    public static final int EVENT_FINISHED_Connection = 2;

    // 下行Connection事件
    public static final int EVENT_ConnectionStarted = 50; // 成功建连

    public static final int EVENT_ConnectionFailed = 51; // 建连失败（可能是无法通过权限认证）

    public static final int EVENT_ConnectionFinished = 52; // 连接结束

    // 上行Session事件
    public static final int EVENT_StartSession = 100;

    public static final int EVENT_FinishSession = 102;

    // 下行Session事件
    public static final int EVENT_SessionStarted = 150;

    public static final int EVENT_SessionFinished = 152;

    public static final int EVENT_SessionFailed = 153;

    // 上行通用事件
    public static final int EVENT_TaskRequest = 200;

    // 下行TTS事件
    public static final int EVENT_TTSSentenceStart = 350;

    public static final int EVENT_TTSSentenceEnd = 351;

    public static final int EVENT_TTSResponse = 352;
}
