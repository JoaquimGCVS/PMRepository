package br.lpm.DESIGNPATTERNS.decorator;

public class WithMilk extends CoffeeDecorator{
    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public double getPrice() {
        return super.getPrice()+0.5;
    }
    @Override
    public String getComplement() {
        return super.getComplement() + ", with milk";
    }
}
