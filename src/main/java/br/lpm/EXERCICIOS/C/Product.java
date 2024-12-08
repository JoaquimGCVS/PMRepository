package br.lpm.EXERCICIOS.C;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        setName(name);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sellProduct(int quantity) throws InsufficientStockException, NegativeQuantityException{
        if (this.quantity<quantity) {
            throw new InsufficientStockException();
        }
        if (quantity<0) {
            throw new NegativeQuantityException();
        }
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
