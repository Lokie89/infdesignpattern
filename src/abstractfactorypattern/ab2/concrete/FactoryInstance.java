package abstractfactorypattern.ab2.concrete;

import abstractfactorypattern.ab2.GuiFac;
import abstractfactorypattern.ab2.linux.LinuxGuiFac;
import abstractfactorypattern.ab2.mac.MacGuiFac;
import abstractfactorypattern.ab2.win.WinGuiFac;

public class FactoryInstance {
    public static GuiFac getGuiFac() {
        switch (getOs()) {
            case 0:
                return new MacGuiFac();
            case 1:
                return new LinuxGuiFac();
            case 2:
                return new WinGuiFac();
        }
        return null;
    }

    private static int getOs() {
        String osName = System.getProperty("os.name");
        if ("Windows 10".equals(osName)) {
            return 2;
        } else if ("Mac OS X".equals(osName)) {
            return 0;
        } else {
            return 1;
        }
    }
}
