package builderpattern.b1;

public class ComputerFactory {
    BluePrint bluePrint;

    public void setBluePrint(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public BluePrint getBluePrint() {
        return bluePrint;
    }

    void make(){
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();
    }

    Computer getComputer(){
        return bluePrint.getComputer();
    }
}
