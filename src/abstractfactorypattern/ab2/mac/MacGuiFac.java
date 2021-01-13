package abstractfactorypattern.ab2.mac;

import abstractfactorypattern.ab2.Button;
import abstractfactorypattern.ab2.GuiFac;
import abstractfactorypattern.ab2.TextArea;

public class MacGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
