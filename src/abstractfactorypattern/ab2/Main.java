package abstractfactorypattern.ab2;

import abstractfactorypattern.ab2.concrete.FactoryInstance;
import abstractfactorypattern.ab2.linux.LinuxGuiFac;
import abstractfactorypattern.ab2.mac.MacGuiFac;

public class Main {
    public static void main(String[] args) {
//        GuiFac fac = new LinuxGuiFac();
//        GuiFac fac = new MacGuiFac();
        GuiFac fac = FactoryInstance.getGuiFac();
        Button button = fac.createButton();
        TextArea textArea = fac.createTextArea();

        button.click();
        System.out.println(textArea.getText());
    }
}
