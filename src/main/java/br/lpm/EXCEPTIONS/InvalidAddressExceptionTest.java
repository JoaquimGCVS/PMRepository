package br.lpm.EXCEPTIONS;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class InvalidAddressExceptionTest {

    @Test
    public void testInvalidRoad() {
        assertThrows(InvalidAdressException.class, () -> {
            new Address("",123,"DownTown",12345678);
        });
    }
    @Test
    public void testInvalidNumber() {
        assertThrows(InvalidAdressException.class, () -> {
            new Address("place", -123, "Downtown", 12345678);
        });
    }
    @Test
    public void testInvalidCEP() {
        assertThrows(InvalidAdressException.class, () -> {
            new Address("place", 123, "Downtown", 1234);
        });
    }

    @Test
    public void testInvalidNeighborhood() {
        assertThrows(InvalidAdressException.class, () -> {
            new Address("", 123, null, 12345678);
        });
    }
}
