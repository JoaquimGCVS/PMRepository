package br.lpm.EXERCICIOS.C;

public class InsufficientStockException extends Exception{

    private static final long serialVersionUID = 1L;

    public InsufficientStockException() {
        super("The quantity requested is greater than the available stock");
    }
}
