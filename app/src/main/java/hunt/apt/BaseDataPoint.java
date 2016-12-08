package hunt.apt;

import org.msgpack.MessagePack;
import org.msgpack.annotation.Ignore;
import org.msgpack.annotation.Message;

import java.io.IOException;

/**
 * Created by cylan-hunt on 16-12-2.
 */


@Message
public class BaseDataPoint {
    /**
     * To bytes byte [ ].
     *
     * @return the byte [ ]
     */
    @Ignore
    public byte[] toBytes() {
        try {
            MessagePack msgpack = new MessagePack();
            return msgpack.write(this);
        } catch (IOException ex) {
            return null;
        }
    }
}
