package br.lpm.EXERCICIOS.F;

public abstract class ServicoClinica implements Preciavel {
    private double price;

    public ServicoClinica(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ServicoClinica [price=" + price + "]";
    }

}
