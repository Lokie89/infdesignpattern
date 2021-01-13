package abstractfactorypattern.ab2.linux;

import abstractfactorypattern.ab2.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼 클릭");
    }
}
