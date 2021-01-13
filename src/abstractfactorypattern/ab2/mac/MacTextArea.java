package abstractfactorypattern.ab2.mac;

import abstractfactorypattern.ab2.TextArea;

public class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "맥 텍스트 에어리어";
    }
}
