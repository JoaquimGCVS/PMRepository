package br.lpm.SOLID.DIP.ferido;

public class CardPayment {
    public double pagar(double amount) {
        double tax = 0.03;
        return amount+ (amount*0.1) + (amount*tax);
    }
}
