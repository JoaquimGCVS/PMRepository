package br.lpm.EXERCICIOS.D;

public class BankAccount {
    private String accountOwner;
    private double balance;

    public BankAccount(String accountOwner, double balance) {
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) throws NegativeValueException {
        if(value<0) {
            throw new NegativeValueException();
        }
        balance +=value;
    }

    public void withdraw(double value) throws NegativeValueException, InsufficientBalanceException{
        if(value>balance) {
            throw new InsufficientBalanceException();
        }
        if (value<0) {
            throw new NegativeValueException();
        }
        balance-=value;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountOwner='" + accountOwner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
