package prototypepattern.p2;

public class Cat implements Cloneable {
    private String name;
    private Age age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat copy = (Cat) super.clone();
        Age copyAge = (Age) copy.getAge().clone();
        copy.setAge(copyAge);
        return copy;
    }
}
