package homework35.todoappl.dao;

// 2) ToDoList - писать приложение

import homework35.todoappl.model.Task;

import java.time.LocalDateTime;

public interface ToDoList {

    boolean addTask(Task task);

    void printTask();

    int quantity();

    Task removeTask(int id);

    Task findTask(int id);

    Task updateTask(int id, String task);

    Task[] getTaskDate(LocalDateTime localDateTime);

}