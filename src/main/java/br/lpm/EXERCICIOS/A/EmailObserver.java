package br.lpm.EXERCICIOS.A;

public class EmailObserver implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Sending email to client with new order: " + order);
    }
}
