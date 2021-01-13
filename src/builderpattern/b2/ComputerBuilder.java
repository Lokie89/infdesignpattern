package builderpattern.b2;

public class ComputerBuilder {
    private Computer computer;

    private ComputerBuilder() {
        computer = new Computer("default", "default", "default");
    }

    static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    Computer build() {
        return computer;
    }


}
