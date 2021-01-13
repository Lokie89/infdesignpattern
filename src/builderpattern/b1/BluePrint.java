package builderpattern.b1;

public abstract class BluePrint {
    abstract void setCpu();
    abstract void setRam();
    abstract void setStorage();

    abstract Computer getComputer();
}
