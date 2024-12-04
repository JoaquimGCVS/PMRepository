package br.lpm.DESIGNPATTERNS.singleton.one;

public class Main {
    public static void main (String[] args) {
        Person person = new Person("Joaquim");
        Person person2 = new Person("");

        UniqueQueue uniqueQueue = UniqueQueue.getInstance();
        try{
        uniqueQueue.addToList(person);
        } catch (InvalidPerson e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(uniqueQueue.getAll());
        }
        try{
        uniqueQueue.addToList(person2);
        } catch (InvalidPerson e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(uniqueQueue.getAll());
        }
        try{
        uniqueQueue.removeFromList(person);
        } catch (InvalidPerson e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(uniqueQueue.getAll());
        }
    }
}
