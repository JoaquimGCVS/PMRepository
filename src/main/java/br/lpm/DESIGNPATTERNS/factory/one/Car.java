package br.lpm.DESIGNPATTERNS.factory.one;

public class Car implements Vehicle {
    private String name;
    private String type;

    public Car(String name, String type) {
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
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
