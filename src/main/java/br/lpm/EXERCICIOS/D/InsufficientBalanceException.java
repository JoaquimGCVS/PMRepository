package br.lpm.EXERCICIOS.D;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException() {
        super("The balance is insufficient");
    }
}
