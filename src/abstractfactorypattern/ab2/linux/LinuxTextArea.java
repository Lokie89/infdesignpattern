package abstractfactorypattern.ab2.linux;

import abstractfactorypattern.ab2.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "리눅스 텍스트 에어리어";
    }
}
