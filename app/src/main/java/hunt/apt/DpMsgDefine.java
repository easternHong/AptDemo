package hunt.apt;

import com.cylan.annotation.DeviceBase;
import com.cylan.annotation.DpBase;

import java.util.List;

/**
 * Created by cylan-hunt on 16-11-9.
 */


public class DpMsgDefine {

    public static final class MsgNet {
        public int net;
        public String ssid;

        @Override
        public String toString() {
            return "MsgNet{" +
                    "net=" + net +
                    ", ssid='" + ssid + '\'' +
                    '}';
        }
    }

    public static final class MsgTimeZone {
        public String timezone;
        public int offset;

        @Override
        public String toString() {
            return "MsgTimeZone{" +
                    "timezone='" + timezone + '\'' +
                    ", offset=" + offset +
                    '}';
        }
    }

    public static final class BindLog {
        public boolean isBind;
        public String account;
        public String oldAccount;

        @Override
        public String toString() {
            return "BindLog{" +
                    "isBind=" + isBind +
                    ", accout='" + account + '\'' +
                    ", oldAccount='" + oldAccount + '\'' +
                    '}';
        }
    }

    public static final class SdStatus {
        public long total;
        public long used;
        public int err;

        @Override
        public String toString() {
            return "SdStatus{" +
                    "total=" + total +
                    ", used=" + used +
                    ", err=" + err +
                    '}';
        }
    }

    public static final class AlarmInfo {
        public int timeStart;
        public int timeEnd;
        /**
         * 每周的星期*， 从低位到高位代表周一到周日。如0b00000001代表周一，0b01000000代表周日
         */
        public int duration;
    }

    public static final class AlarmMsg {//505 报警消息
        public int time;
        public int isRecording;
        public int fileIndex;
        public int type;
    }

    public static final class NotificationInfo {
        public int notificatoin;
        public int duration;
    }

    public static final class TimeLapse {
        public int timeStart;
        public int timePeriod;
        public int timeDuration;
        public int status;
    }

    public static final class CamCoord {
        public int x;
        public int y;
        public int r;
    }

    public static final class BellCallState {
        public int state;
        public int time;
        public int duration;
        public int type;
    }

    @DpBase
    public static class DpMsg {
        public int msgId;
        public long version;
        public Object o;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DpMsg dpMsg = (DpMsg) o;

            return msgId == dpMsg.msgId;

        }

        @Override
        public int hashCode() {
            return msgId;
        }

        @Override
        public String toString() {
            return "DpMsg{" +
                    "msgId=" + msgId +
                    ", version=" + version +
                    '}';
        }
    }

    @DeviceBase
    public static class BaseBean {
        public int pid;
        public String uuid;
        public String sn;
        public String alias;
        public String shareAccount;

        @Override
        public String toString() {
            return "BaseBean{" +
                    "pid=" + pid +
                    ", uuid='" + uuid + '\'' +
                    ", sn='" + sn + '\'' +
                    ", alias='" + alias + '\'' +
                    ", shareAccount='" + shareAccount + '\'' +
                    '}';
        }
    }


    public static class DpWrap {
        public BaseBean baseDpDevice;
        public List<DpMsg> baseDpMsgList;

        @Override
        public String toString() {
            return "DpWrap{" +
                    "baseDpDevice=" + baseDpDevice +
                    ", baseDpMsgList=" + baseDpMsgList +
                    '}';
        }
    }
}
