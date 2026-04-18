package service;

import model.Task;
import java.util.*;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    private int idCounter = 1;

    public void addTask(String title) {
        tasks.add(new Task(idCounter++, title));
        System.out.println("Task added!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void markTask(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.markComplete();
                System.out.println("Task marked complete");
                return;
            }
        }
        System.out.println("Task not found");
    }

    public void deleteTask(int id) {
        Iterator<Task> it = tasks.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                System.out.println("Task deleted");
                return;
            }
        }
        System.out.println("Task not found");
    }
}
