package br.lpm.DESIGNPATTERNS.factory.two;

public class WordDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Word document");
    }
}
