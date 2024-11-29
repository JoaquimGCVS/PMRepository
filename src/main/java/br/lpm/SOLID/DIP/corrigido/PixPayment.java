package br.lpm.SOLID.DIP.corrigido;

public class PixPayment implements IPayment {
    @Override
    public double pagar(double amount) {
        return amount+ (amount*0.1);
    }
}
