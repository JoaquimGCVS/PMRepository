package br.lpm.DESIGNPATTERNS.factory.two;

public class PDFDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening PDF document");
    }

}