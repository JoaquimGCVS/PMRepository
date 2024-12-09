package br.lpm.DESIGNPATTERNS.factory.three;

public class CelularFactory {
    public static Celular criadorDeCelular(String type) {
        switch (type.toUpperCase()) {
            case "ANDROID":
                return new Android();
            case "IPHONE":
                return new Iphone();
            default:
                throw new IllegalArgumentException("Opcao invalida para celular");
        }
    }
}
