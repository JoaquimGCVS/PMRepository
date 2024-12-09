package br.lpm.EXERCICIOS.D;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class ExceptionsTest {
    BankAccount bk;
    @BeforeEach
    public void setUp() {
        bk = new BankAccount("Roberto Carlos (jogador)",10.0);
    }

    @Test
    public void testInsufficientBalanceException() {
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> bk.withdraw(20.0));
    }

    @Test
    public void testNegativeValueException() {
        Exception exception = assertThrows(NegativeValueException.class, () -> bk.deposit(-20));
    }
}
