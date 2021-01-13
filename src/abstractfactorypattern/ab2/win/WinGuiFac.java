package abstractfactorypattern.ab2.win;

import abstractfactorypattern.ab2.Button;
import abstractfactorypattern.ab2.GuiFac;
import abstractfactorypattern.ab2.TextArea;

public class WinGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
