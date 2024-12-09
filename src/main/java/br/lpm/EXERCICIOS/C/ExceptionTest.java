package br.lpm.EXERCICIOS.C;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class ExceptionTest {

    private Product product;
    @BeforeEach
    public void setUp() {
        product = new Product("Cellphone",10,2000.0);
    }

    @Test
    public void testInsufficientStockException() {
        Exception exception = assertThrows(InsufficientStockException.class,() -> product.sellProduct(12) );
        Assertions.assertEquals("The quantity requested is greater than the available stock",exception.getMessage());
    }

    @Test
    public void testNegativeStockEException() {
        Product product2 = new Product("Mulher cara",6,3.0);
        Exception exception = assertThrows(NegativeQuantityException.class, () -> product2.sellProduct(-1));
        Assertions.assertEquals("The quantity passed cannot be negative",exception.getMessage());
    }

    @Test
    public void testSuccessSale() throws Exception {
        product.sellProduct(5);
        Assertions.assertEquals(5,product.getQuantity());
    }
}
