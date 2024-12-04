package br.lpm.DESIGNPATTERNS.singleton.one;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InvalidPersonTest {
    @Test
    public void testInvalidAddToList() {
        Person person = new Person("");
        assertThrows(InvalidPerson.class, () -> {
            UniqueQueue.getInstance().addToList(person);
        });
    }
}
