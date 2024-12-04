package br.lpm.DESIGNPATTERNS.factory.two;

public class ExcelDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Excel document");
    }
}
