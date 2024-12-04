package br.lpm.DESIGNPATTERNS.singleton.one;

import java.util.ArrayList;
import java.util.List;

public class UniqueQueue {
    private static UniqueQueue instance;
    private final List<Person> persons;
    private UniqueQueue() {
        persons = new ArrayList<>();
    }
    public static UniqueQueue getInstance() {
        if(instance==null) {
            instance = new UniqueQueue();
        }
        return instance;
    }
    public void addToList(Person person) throws InvalidPerson {
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
