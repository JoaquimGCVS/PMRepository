package br.lpm.EXERCICIOS.B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InvalidUserTest {
    @Test
    void testInvalidUserName() {
        Exception exception = assertThrows(InvalidUserName.class, () ->
                new User("Jo", 20, "joao@gmail.com"));

        assertEquals("O nome deve ter pelo menos 3 caracteres.", exception.getMessage());
    }

    @Test
    void testInvalidUserAge() {
        Exception exception = assertThrows(InvalidUserAge.class, () ->
                new User("João", 17, "joao@gmail.com"));

        assertEquals("A idade deve ser maior ou igual a 18 anos.", exception.getMessage());
    }

    @Test
    void testInvalidUserEmail() {
        Exception exception = assertThrows(InvalidUserEmail.class, () -> new User("Joao",18,"Joaogmail.com"));

        assertEquals("O e-mail deve conter o símbolo `@`", exception.getMessage());
    }

    @Test
    void testValidUser() {
        assertDoesNotThrow(() -> new User("João", 20, "joao@gmail.com"));
    }
}
