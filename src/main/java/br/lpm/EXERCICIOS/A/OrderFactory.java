package br.lpm.EXERCICIOS.A;

public class OrderFactory {
    public static Order createOrder(String type,String name,String desc) {
        switch (type.toUpperCase()) {
            case "DIGITAL PRODUCT":
                return new DigitalProductOrder(name,desc);
            case "PHYSIC PRODUCT":
                return new PhysicProductOrder(name,desc);
            case "SERVICE":
                return new ServiceOrder(name,desc);
            default:
                throw new IllegalArgumentException("Invalid type for order");
        }
    }
}
