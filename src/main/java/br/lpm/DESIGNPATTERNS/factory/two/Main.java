package br.lpm.DESIGNPATTERNS.factory.two;

public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();

        Document pdf = documentFactory.createDocument("PDF");
        pdf.open();

        Document word = documentFactory.createDocument("Word");
        word.open();

        Document excel = documentFactory.createDocument("Excel");
        excel.open();

    }
}
