package br.lpm.DESIGNPATTERNS.factory.two;

public class DocumentFactory {
    public static Document createDocument(String type) {
        switch(type.toUpperCase()) {
            case "PDF":
                return new PDFDocument();
            case "EXCEL":
                return new ExcelDocument();
            case "WORD":
                return new WordDocument();
            default:
                throw new IllegalArgumentException("Invalid type for document");

        }
    }
}
