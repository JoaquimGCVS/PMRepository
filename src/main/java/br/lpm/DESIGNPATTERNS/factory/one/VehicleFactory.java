package br.lpm.DESIGNPATTERNS.factory.one;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch(type.toUpperCase()) {
            case "CAR":
                return new Car("RandomName", "Car");
            case "MOTORCYCLE":
                return new Motorcycle("RandomName", "Motorcycle");
            default:
                throw new RuntimeException("Invalid type for vehicle");
        }
    }
}
