package hunt.apt;

import android.os.Parcel;
import android.os.Parcelable;

import com.cylan.annotation.DeviceBase;
import com.cylan.annotation.DpBase;

import java.util.List;

/**
 * Created by cylan-hunt on 16-11-9.
 */


public class DpMsgDefine {

    public static final class MsgNet implements Parcelable{
        public int net;
        public String ssid;

        @Override
        public String toString() {
            return "MsgNet{" +
                    "net=" + net +
                    ", ssid='" + ssid + '\'' +
                    '}';
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.net);
            dest.writeString(this.ssid);
        }

        public MsgNet() {
        }

        protected MsgNet(Parcel in) {
            this.net = in.readInt();
            this.ssid = in.readString();
        }

        public static final Creator<MsgNet> CREATOR = new Creator<MsgNet>() {
            @Override
            public MsgNet createFromParcel(Parcel source) {
                return new MsgNet(source);
            }

            @Override
            public MsgNet[] newArray(int size) {
                return new MsgNet[size];
            }
        };
    }

    public static final class MsgTimeZone implements Parcelable{
        public String timezone;
        public int offset;

        @Override
        public String toString() {
            return "MsgTimeZone{" +
                    "timezone='" + timezone + '\'' +
                    ", offset=" + offset +
                    '}';
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.timezone);
            dest.writeInt(this.offset);
        }

        public MsgTimeZone() {
        }

        protected MsgTimeZone(Parcel in) {
            this.timezone = in.readString();
            this.offset = in.readInt();
        }

        public static final Creator<MsgTimeZone> CREATOR = new Creator<MsgTimeZone>() {
            @Override
            public MsgTimeZone createFromParcel(Parcel source) {
                return new MsgTimeZone(source);
            }

            @Override
            public MsgTimeZone[] newArray(int size) {
                return new MsgTimeZone[size];
            }
        };
    }

    public static final class BindLog implements Parcelable{
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeByte(this.isBind ? (byte) 1 : (byte) 0);
            dest.writeString(this.account);
            dest.writeString(this.oldAccount);
        }

        public BindLog() {
        }

        protected BindLog(Parcel in) {
            this.isBind = in.readByte() != 0;
            this.account = in.readString();
            this.oldAccount = in.readString();
        }

        public static final Creator<BindLog> CREATOR = new Creator<BindLog>() {
            @Override
            public BindLog createFromParcel(Parcel source) {
                return new BindLog(source);
            }

            @Override
            public BindLog[] newArray(int size) {
                return new BindLog[size];
            }
        };
    }

    public static final class SdStatus implements Parcelable{
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeLong(this.total);
            dest.writeLong(this.used);
            dest.writeInt(this.err);
        }

        public SdStatus() {
        }

        protected SdStatus(Parcel in) {
            this.total = in.readLong();
            this.used = in.readLong();
            this.err = in.readInt();
        }

        public static final Creator<SdStatus> CREATOR = new Creator<SdStatus>() {
            @Override
            public SdStatus createFromParcel(Parcel source) {
                return new SdStatus(source);
            }

            @Override
            public SdStatus[] newArray(int size) {
                return new SdStatus[size];
            }
        };
    }

    public static final class AlarmInfo implements Parcelable{
        public int timeStart;
        public int timeEnd;
        /**
         * 每周的星期*， 从低位到高位代表周一到周日。如0b00000001代表周一，0b01000000代表周日
         */
        public int duration;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.timeStart);
            dest.writeInt(this.timeEnd);
            dest.writeInt(this.duration);
        }

        public AlarmInfo() {
        }

        protected AlarmInfo(Parcel in) {
            this.timeStart = in.readInt();
            this.timeEnd = in.readInt();
            this.duration = in.readInt();
        }

        public static final Creator<AlarmInfo> CREATOR = new Creator<AlarmInfo>() {
            @Override
            public AlarmInfo createFromParcel(Parcel source) {
                return new AlarmInfo(source);
            }

            @Override
            public AlarmInfo[] newArray(int size) {
                return new AlarmInfo[size];
            }
        };
    }

    public static final class AlarmMsg implements Parcelable{//505 报警消息
        public int time;
        public int isRecording;
        public int fileIndex;
        public int type;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.time);
            dest.writeInt(this.isRecording);
            dest.writeInt(this.fileIndex);
            dest.writeInt(this.type);
        }

        public AlarmMsg() {
        }

        protected AlarmMsg(Parcel in) {
            this.time = in.readInt();
            this.isRecording = in.readInt();
            this.fileIndex = in.readInt();
            this.type = in.readInt();
        }

        public static final Creator<AlarmMsg> CREATOR = new Creator<AlarmMsg>() {
            @Override
            public AlarmMsg createFromParcel(Parcel source) {
                return new AlarmMsg(source);
            }

            @Override
            public AlarmMsg[] newArray(int size) {
                return new AlarmMsg[size];
            }
        };
    }

    public static final class NotificationInfo implements Parcelable{
        public int notificatoin;
        public int duration;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.notificatoin);
            dest.writeInt(this.duration);
        }

        public NotificationInfo() {
        }

        protected NotificationInfo(Parcel in) {
            this.notificatoin = in.readInt();
            this.duration = in.readInt();
        }

        public static final Creator<NotificationInfo> CREATOR = new Creator<NotificationInfo>() {
            @Override
            public NotificationInfo createFromParcel(Parcel source) {
                return new NotificationInfo(source);
            }

            @Override
            public NotificationInfo[] newArray(int size) {
                return new NotificationInfo[size];
            }
        };
    }

    public static final class TimeLapse implements Parcelable{
        public int timeStart;
        public int timePeriod;
        public int timeDuration;
        public int status;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.timeStart);
            dest.writeInt(this.timePeriod);
            dest.writeInt(this.timeDuration);
            dest.writeInt(this.status);
        }

        public TimeLapse() {
        }

        protected TimeLapse(Parcel in) {
            this.timeStart = in.readInt();
            this.timePeriod = in.readInt();
            this.timeDuration = in.readInt();
            this.status = in.readInt();
        }

        public static final Creator<TimeLapse> CREATOR = new Creator<TimeLapse>() {
            @Override
            public TimeLapse createFromParcel(Parcel source) {
                return new TimeLapse(source);
            }

            @Override
            public TimeLapse[] newArray(int size) {
                return new TimeLapse[size];
            }
        };
    }

    public static final class CamCoord {
        public int x;
        public int y;
        public int r;
    }

    public static final class BellCallState implements Parcelable{
        public int state;
        public int time;
        public int duration;
        public int type;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.state);
            dest.writeInt(this.time);
            dest.writeInt(this.duration);
            dest.writeInt(this.type);
        }

        public BellCallState() {
        }

        protected BellCallState(Parcel in) {
            this.state = in.readInt();
            this.time = in.readInt();
            this.duration = in.readInt();
            this.type = in.readInt();
        }

        public static final Creator<BellCallState> CREATOR = new Creator<BellCallState>() {
            @Override
            public BellCallState createFromParcel(Parcel source) {
                return new BellCallState(source);
            }

            @Override
            public BellCallState[] newArray(int size) {
                return new BellCallState[size];
            }
        };
    }

    @DpBase
    public static class DpMsg implements Parcelable{
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.msgId);
            dest.writeLong(this.version);
//            dest.writeParcelable(this.o, flags);
        }

        public DpMsg() {
        }

        protected DpMsg(Parcel in) {
            this.msgId = in.readInt();
            this.version = in.readLong();
            this.o = in.readParcelable(Object.class.getClassLoader());
        }

        public static final Creator<DpMsg> CREATOR = new Creator<DpMsg>() {
            @Override
            public DpMsg createFromParcel(Parcel source) {
                return new DpMsg(source);
            }

            @Override
            public DpMsg[] newArray(int size) {
                return new DpMsg[size];
            }
        };
    }

    @DeviceBase
    public static class BaseBean implements Parcelable{
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.pid);
            dest.writeString(this.uuid);
            dest.writeString(this.sn);
            dest.writeString(this.alias);
            dest.writeString(this.shareAccount);
        }

        public BaseBean() {
        }

        protected BaseBean(Parcel in) {
            this.pid = in.readInt();
            this.uuid = in.readString();
            this.sn = in.readString();
            this.alias = in.readString();
            this.shareAccount = in.readString();
        }

        public static final Creator<BaseBean> CREATOR = new Creator<BaseBean>() {
            @Override
            public BaseBean createFromParcel(Parcel source) {
                return new BaseBean(source);
            }

            @Override
            public BaseBean[] newArray(int size) {
                return new BaseBean[size];
            }
        };
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
