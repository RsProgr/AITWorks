package homework35.todoappl.dao;

// 2) ToDoList - писать приложение

import homework35.todoappl.model.Task;

public interface ToDoList {
    // add task
    boolean addTask(Task task);

    // Remove Task
    Task removeTask(int tasknumber);

    // print list of Tasks
    void viewTasks();
    //TODO - задачи из списка
    // подумать над Task[] viewTasks();
    Task[] getTasks();

    //quantity of tasks
    int quantity();

   // boolean addTask(Task task);

    //TODO - нужен ли интерфейс метод для выхода из меню?
    void exit();


}
