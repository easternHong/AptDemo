package hunt.apt;

import org.msgpack.MessagePack;

import java.io.IOException;

/**
 * Created by cylan-hunt on 16-11-29.
 */

public class DpUtils {
    private static MessagePack mp = new MessagePack();

    /**
     * @param data
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T unpackData(byte[] data, Class<T> clazz) throws IOException {
        if (clazz == null || data == null) {
            return null;
        }
        return mp.createBufferUnpacker(data).read(clazz);
    }


    /**
     * 打包msgpack
     *
     * @param o
     * @return
     */
    public static byte[] pack(Object o) {
        try {
            return mp.write(o);
        } catch (IOException e) {
            return null;
        }
    }
}
