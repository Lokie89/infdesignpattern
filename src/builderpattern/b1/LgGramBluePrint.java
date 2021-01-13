package builderpattern.b1;

public class LgGramBluePrint extends BluePrint {
    private Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    void setCpu() {
        this.computer.setCpu("i7");
    }

    @Override
    void setRam() {
        this.computer.setRam("8g");
    }

    @Override
    void setStorage() {
        this.computer.setStorage("256g ssd");
    }

    @Override
    Computer getComputer() {
        return this.computer;
    }
}
