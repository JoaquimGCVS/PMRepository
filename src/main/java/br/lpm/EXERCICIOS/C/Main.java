package br.lpm.EXERCICIOS.C;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Cellphone", 10, 2000.0);

        try {
            Product product2 = new Product("Mulher cara",6,3.0);
            product2.sellProduct(-1);
        } catch (InsufficientStockException | NegativeQuantityException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End of process");
        }


    }
}



