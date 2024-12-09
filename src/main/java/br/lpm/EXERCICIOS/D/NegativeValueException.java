package br.lpm.EXERCICIOS.D;

public class NegativeValueException extends Exception{
    public NegativeValueException () {
        super("The value cannot be negative");
    }
}
