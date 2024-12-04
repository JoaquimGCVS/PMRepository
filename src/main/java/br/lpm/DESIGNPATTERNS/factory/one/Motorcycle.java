package br.lpm.DESIGNPATTERNS.factory.one;

public class Motorcycle implements Vehicle {
    private String name;
    private String type;

    public Motorcycle(String name, String type) {
        setName(name);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type=type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                '}';
    }
}
