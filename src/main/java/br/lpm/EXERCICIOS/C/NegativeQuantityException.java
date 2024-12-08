package br.lpm.EXERCICIOS.C;

public class NegativeQuantityException extends Exception{
    private static final long serialVersionUID = 2L;

    public NegativeQuantityException() {
        super("The quantity passed cannot be negative");
    }
}
