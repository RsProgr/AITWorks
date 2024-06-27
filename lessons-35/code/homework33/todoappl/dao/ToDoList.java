package homework33.todoappl.dao;

import homework33.todoappl.model.Task;

public interface ToDoList {
    boolean addTask(Task task);
    boolean removeTask(int taskNumber);
    void viewTasks();
    Task editTask(int taskNumber, String newDescription);

}
