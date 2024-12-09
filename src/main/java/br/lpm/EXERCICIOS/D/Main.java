package br.lpm.EXERCICIOS.D;

public class Main {
    public static void main (String[] args) {
        BankAccount contaDoPedrinho = new BankAccount("Roberta",100.0);

        System.out.println("Error messages:");
        System.out.println();
        try {
            contaDoPedrinho.withdraw(-20);
        } catch (NegativeValueException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        try {
            contaDoPedrinho.withdraw(200.0);
        } catch (InsufficientBalanceException | NegativeValueException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        try {
            contaDoPedrinho.deposit(-100000.0);
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }


    }
}
