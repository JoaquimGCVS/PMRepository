package br.lpm.EXERCICIOS.A;

public class StockObserver implements Observer{
    @Override
    public void update(Order order) {
        if (checkInstance(order)) {
            System.out.println("Updating stock with new order: " + order);
        }
    }

    private boolean checkInstance(Order order) {
        return order instanceof PhysicProductOrder;
    }
}
