package abstractfactorypattern.ab2.win;

import abstractfactorypattern.ab2.TextArea;

public class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "윈도우 텍스트 에어리어";
    }
}
