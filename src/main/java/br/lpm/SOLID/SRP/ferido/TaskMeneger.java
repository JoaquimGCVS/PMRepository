package br.lpm.SOLID.SRP.ferido;

import java.util.ArrayList;
import java.util.List;

public class TaskMeneger {
    private final List<Task> tasks;
    public TaskMeneger() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
    public void removeTask(Task task) {
        tasks.add(task);
    }
    public List<Task> getTaks(Task task) {
        return tasks;
    }

    public void addDocs() {
        //
    }

    public void removeDocs() {
        //
    }

    public void getDocs() {
        //
    }

}
