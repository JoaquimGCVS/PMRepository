package br.lpm.SOLID.DIP.ferido;

public class PaymentManager {
    private PixPayment payment;
    private CardPayment payment2;

    public PaymentManager() {
        this.payment= new PixPayment();
        this.payment2 = new CardPayment();
    }

    public void processPixPayment(double amount) {
        payment.pagar(amount);
    }
    public void processCardPayment(double amount) {
        payment2.pagar(amount);
    }
}
