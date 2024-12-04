package br.lpm.DESIGNPATTERNS.decorator;

public class WithChocolate extends CoffeeDecorator{
    public WithChocolate(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public double getPrice() {
        return super.getPrice()+0.7;
    }
    @Override
    public String getComplement() {
        return super.getComplement() + ", with chocolate";
    }
}
