package br.lpm.EXCEPTIONS;

public class Main {
    public static void main(String[] args) {
        try {
            Address address1 = new Address("Lavras", 234, "Savassi", 1234);
        } catch (InvalidAdressException e) {
            System.out.println("Error in address1: " + e.getMessage());
        }

        try {
            Address address2 = new Address(null, 234, "Savassi", 12345678);
        } catch (InvalidAdressException e) {
            System.out.println("Error in address2: " + e.getMessage());
        }

        try {
            Address address3 = new Address("Lavras", -1, "Savassi", 12345678);
        } catch (InvalidAdressException e) {
            System.out.println("Error in address3: " + e.getMessage());
        }

        try {
            Address address4 = new Address("Lavras", 234, null, 12345678);
        } catch (InvalidAdressException e) {
            System.out.println("Error in address4: " + e.getMessage());
        }
    }
}
