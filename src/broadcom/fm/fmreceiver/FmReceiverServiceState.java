package com.broadcom.fm.fmreceiver;

public class FmReceiverServiceState {
    static final int AF_MODE_BITMASK = 1;
    static final int AUDIO_MODE_BITMASK = 3;
    static final int AUDIO_PATH_BITMASK = 3;
    static final int BTA_FM_ERR = 5;
    static final int BTA_FM_FLAG_TOUT_ERR = 7;
    static final int BTA_FM_FREQ_ERR = 8;
    static final int BTA_FM_OK = 0;
    static final int BTA_FM_SCAN_ABORT = 3;
    static final int BTA_FM_SCAN_FAIL = 2;
    static final int BTA_FM_SCAN_NO_RES = 4;
    static final int BTA_FM_SCAN_RSSI_LOW = 1;
    static final int BTA_FM_UNSPT_ERR = 6;
    static final int BTA_FM_VCMD_ERR = 9;
    static final String FM_RECEIVER_PERM = "android.permission.ACCESS_FM_RECEIVER";
    static final int FUNC_BITMASK = 115;
    static final int FUNC_RDS_BITMASK = 112;
    static final int FUNC_REGION_BITMASK = 3;
    static final int FUNC_SOFTMUTE_BITMASK = 256;
    static final int MAX_ALLOWED_AF_JUMP_THRESHOLD = 255;
    static final int MAX_ALLOWED_FREQUENCY_CODE = 99999;
    static final int MAX_ALLOWED_RDS_CONDITION_VALUE = 255;
    static final int MAX_ALLOWED_SIGNAL_POLLING_TIME = 100000;
    static final int MAX_ALLOWED_SIGNAL_STRENGTH_NUMBER = 255;
    static final int MAX_ALLOWED_SNR_THRESHOLD = 31;
    static final int MIN_ALLOWED_AF_JUMP_THRESHOLD = 0;
    static final int MIN_ALLOWED_FREQUENCY_CODE = 1;
    static final int MIN_ALLOWED_RDS_CONDITION_VALUE = 0;
    static final int MIN_ALLOWED_SIGNAL_POLLING_TIME = 10;
    static final int MIN_ALLOWED_SIGNAL_STRENGTH_NUMBER = 0;
    static final int MIN_ALLOWED_SNR_THRESHOLD = 0;
    static final int OPERATION_AUDIO_MODE_EVENT_CALLBACK = 6;
    static final int OPERATION_AUDIO_PATH_EVENT_CALLBACK = 7;
    static final int OPERATION_LIVE_AUDIO_EVENT_CALLBACK = 10;
    static final int OPERATION_NFE_EVENT_CALLBACK = 9;
    static final int OPERATION_QUEUE_FM_CMD = 12;
    static final int OPERATION_RDS_DATA_EVENT_CALLBACK = 5;
    static final int OPERATION_RDS_EVENT_CALLBACK = 4;
    static final int OPERATION_REGION_EVENT_CALLBACK = 8;
    static final int OPERATION_SEARCH_EVENT_CALLBACK = 3;
    static final int OPERATION_STATUS_EVENT_CALLBACK = 2;
    static final int OPERATION_TIMEOUT = 1;
    static final int OPERATION_TIMEOUT_GENERIC = 5000;
    static final int OPERATION_TIMEOUT_NFL = 20000;
    static final int OPERATION_TIMEOUT_SEARCH = 20000;
    static final int OPERATION_TIMEOUT_SHUTDOWN = 10000;
    static final int OPERATION_TIMEOUT_STARTUP = 10000;
    static final int OPERATION_VOLUME_EVENT_CALLBACK = 11;
    static final int RADIO_OP_STATE_NONE = 0;
    static final int RADIO_OP_STATE_STAGE_1 = 1;
    static final int RADIO_OP_STATE_STAGE_2 = 2;
    static final int RADIO_OP_STATE_STAGE_3 = 3;
    static final int RADIO_OP_STATE_STAGE_4 = 4;
    static final int RADIO_OP_STATE_STAGE_5 = 5;
    static final int RADIO_STATE_BUSY = 4;
    static final int RADIO_STATE_INIT = 5;
    static final int RADIO_STATE_OFF = 0;
    static final int RADIO_STATE_READY_FOR_COMMAND = 2;
    static final int RADIO_STATE_STARTING = 1;
    static final int RADIO_STATE_STOPPING = 3;
    static final int RBDS_MODE_NATIVE = 1;
    static final int RDS_FEATURES_BITMASK = 124;
    static final int RDS_ID_PS_EVT = 7;
    static final int RDS_ID_PTYN_EVT = 8;
    static final int RDS_ID_PTY_EVT = 2;
    static final int RDS_ID_RT_EVT = 9;
    static final int RDS_MODE_BITMASK = 3;
    static final int RDS_MODE_NATIVE = 0;
    static final int RDS_RBDS_BITMASK = 1;
    static final int SCAN_MODE_BITMASK = 131;
    protected static final boolean f76V = true;
    static boolean mAfOn;
    static int mAlternateFreqHopThreshold;
    static int mAudioMode;
    static int mAudioPath;
    static int mDeemphasisTime;
    static int mEstimatedNoiseFloorLevel;
    static int mFreq;
    static boolean mIsMute;
    static boolean mLiveAudioQuality;
    static boolean mRadioIsOn;
    static boolean mRdsOn;
    static String mRdsProgramService;
    static int mRdsProgramType;
    static String mRdsProgramTypeName;
    static String mRdsRadioText;
    static int mRdsType;
    static int mRssi;
    static boolean mSeekSuccess;
    static int mSignalPollInterval;
    static int mSnr;
    static int mStepSize;
    static int mWorldRegion;
    static int radio_op_state;
    static int radio_state;

    static {
        mFreq = RDS_MODE_NATIVE;
        mRssi = 127;
        mSnr = 127;
        mRadioIsOn = false;
        mRdsProgramType = RDS_MODE_NATIVE;
        mRdsProgramService = "";
        mRdsRadioText = "";
        mRdsProgramTypeName = "";
        mIsMute = false;
        mSeekSuccess = false;
        mRdsOn = false;
        mAfOn = false;
        mRdsType = RDS_MODE_NATIVE;
        mAlternateFreqHopThreshold = RDS_MODE_NATIVE;
        mAudioMode = RDS_MODE_NATIVE;
        mAudioPath = RDS_RBDS_BITMASK;
        mWorldRegion = RDS_MODE_NATIVE;
        mStepSize = RDS_MODE_NATIVE;
        mLiveAudioQuality = false;
        mEstimatedNoiseFloorLevel = RDS_RBDS_BITMASK;
        mSignalPollInterval = 100;
        mDeemphasisTime = 64;
        radio_state = RDS_MODE_NATIVE;
        radio_op_state = RDS_MODE_NATIVE;
    }
}
