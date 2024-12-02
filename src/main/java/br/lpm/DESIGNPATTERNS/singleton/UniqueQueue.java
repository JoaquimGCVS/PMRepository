package br.lpm.DESIGNPATTERNS.singleton;

import java.util.ArrayList;
import java.util.List;

public class UniqueQueue {
    private static final UniqueQueue instance = new UniqueQueue();
    private final List<Person> persons;
    private UniqueQueue() {
        persons = new ArrayList<>();
    }
    public static UniqueQueue getInstance() {
        return instance;
    }
    public void addToList(Person person) throws InvalidPerson{
        if (!person.getName().isEmpty()) {
            persons.add(person);
        } else {
            throw new InvalidPerson("Invalid person");
        }
    }
    public void removeFromList(Person person) throws InvalidPerson{
        if (!person.getName().isEmpty()) {
            persons.remove(person);
        } else {
            throw new InvalidPerson("Invalid person");
        }
    }

    public List<Person> getAll() {
        return persons;
    }
}
