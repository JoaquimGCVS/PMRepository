package br.lpm.DESIGNPATTERNS.decorator;

public class SimpleCoffe implements Coffee {

    @Override
    public double getPrice() {
        return 10.0;
    }

    @Override
    public String getComplement() {
        return "Coffee";
    }
}
