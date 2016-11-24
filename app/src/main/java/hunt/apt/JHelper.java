package hunt.apt;

/**
 * Created by cylan-hunt on 16-11-16.
 */

public class JHelper {

    public static void main(String[] args) {
        JDevice jDevice = new JDevice();
        fillData(jDevice, 0, 1);
        System.out.println(jDevice.state);
    }

    public static void fillData(JDevice device, final int keyId, Object o) {
        if (keyId == 200) {
            device.name = ((Jmsg) o).name;
        }
    }
}
