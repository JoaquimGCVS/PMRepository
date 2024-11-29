package br.lpm.SOLID.SRP.corrigido;

import br.lpm.SOLID.SRP.ferido.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;
    public TaskManager() {
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

}
