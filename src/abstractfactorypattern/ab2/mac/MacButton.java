package abstractfactorypattern.ab2.mac;

import abstractfactorypattern.ab2.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("맥 버튼 클릭");
    }
}
