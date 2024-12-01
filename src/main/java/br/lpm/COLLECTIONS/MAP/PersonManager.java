package br.lpm.COLLECTIONS.MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonManager {
    private final Map<Integer,Person> persons;
    public PersonManager() {
        persons = new HashMap<>();
    }
    public void addPerson(Integer key, Person person) {
        persons.put(key,person);
    }
    public void removePerson(Integer identifier) {
        persons.remove(identifier);
    }
    public Map<Integer,Person> getPersons() {
        return persons;
    }
    public Collection<Person> getPersonsData() {
        return persons.values();
    }
    public Set<Integer> getPersonsKey() {
        return persons.keySet();
    }
}
