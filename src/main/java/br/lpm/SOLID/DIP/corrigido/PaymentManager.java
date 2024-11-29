package br.lpm.SOLID.DIP.corrigido;

public class PaymentManager {
    private IPayment iPayment;
    public PaymentManager(IPayment iPayment) {
        this.iPayment = iPayment;
    }
    public void processPayment(double amount) {
        iPayment.pagar(amount);
    }
}
