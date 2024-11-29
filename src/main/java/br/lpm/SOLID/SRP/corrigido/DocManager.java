package br.lpm.SOLID.SRP.corrigido;

import java.util.ArrayList;
import java.util.List;

public class DocManager {
    private final List<Doc> docs;
    public DocManager() {
        docs = new ArrayList<>();
    }

    public void addTask(Doc doc) {
        docs.add(doc);
    }
    public void removeTask(Doc doc) {
        docs.add(doc);
    }
    public List<Doc> getDocs(Doc doc) {
        return docs;
    }
}
