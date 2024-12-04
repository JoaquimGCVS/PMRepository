package br.lpm.DESIGNPATTERNS.decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffe;
    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffe = decoratedCoffee;
    }
    @Override
    public double getPrice() {
        return decoratedCoffe.getPrice();
    }
    @Override
    public String getComplement() {
        return decoratedCoffe.getComplement();
    }
}
