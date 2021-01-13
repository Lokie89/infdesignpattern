package abstractfactorypattern.ab2.win;

import abstractfactorypattern.ab2.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("윈도우 버튼 클릭");
    }
}
