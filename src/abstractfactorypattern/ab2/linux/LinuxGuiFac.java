package abstractfactorypattern.ab2.linux;

import abstractfactorypattern.ab2.Button;
import abstractfactorypattern.ab2.GuiFac;
import abstractfactorypattern.ab2.TextArea;

public class LinuxGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
