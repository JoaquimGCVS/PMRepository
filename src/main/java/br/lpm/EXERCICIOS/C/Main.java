package br.lpm.EXERCICIOS.C;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Cellphone", 10, 2000.0);

        try {
            product.sellProduct(5); // Nao lanca nenhuma excecao
        } catch (InsufficientStockException | NegativeQuantityException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of process");
        }

        try {
            product.sellProduct(12); // Deve lançar InsufficientStockException
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        } catch (NegativeQuantityException e) {
            System.out.println(e.getMessage());
        }

        try {
            product.sellProduct(-1); // Deve lançar NegativeQuantityException
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        } catch (NegativeQuantityException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of process");
    }
}



