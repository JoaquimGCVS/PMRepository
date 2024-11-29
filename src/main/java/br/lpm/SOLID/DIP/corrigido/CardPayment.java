package br.lpm.SOLID.DIP.corrigido;

public class CardPayment implements IPayment {
    @Override
    public double pagar(double amount) {
        double tax = 0.03;
        return amount+ (amount*0.1) + (amount*tax);
    }
}
