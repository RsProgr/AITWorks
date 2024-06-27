package homework33.todoappl;

import homework33.todoappl.dao.ToDoList;
import homework33.todoappl.dao.ToDoListImpl;
import homework33.todoappl.model.Menu;
import homework33.todoappl.model.Task;

import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to ToDo Application!");
        ToDoList toDoList = new ToDoListImpl(10);
        int size = 0;// Первый идентификатор задачи

        // начало цикла
        while (true) {
            // Печать меню
            Menu.printMenu(); // статический метод вызывается по имени класса
            // Ввод выбора
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // Выполнение
            switch (choice) {
                case 1: {
                    scanner.nextLine(); // Поглощение символа новой строки
                    System.out.println("Input task: ");
                    String taskDescription = scanner.nextLine();
                    Task newTask = new Task(size++, taskDescription); // Увеличение id после создания задачи
                    if (toDoList.addTask(newTask)) {
                        System.out.println("Task added successfully.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    if (toDoList.removeTask(taskNumber)) {
                        System.out.println("Task removed successfully.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Input task number to edit: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Поглощение символа новой строки
                    System.out.println("Input new task description: ");
                    String newDescription = scanner.nextLine();
                    Task updatedTask = toDoList.editTask(taskNumber, newDescription);
                    if (updatedTask != null) {
                        System.out.println("Task updated: " + updatedTask);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Exiting the application. Goodbye!");
                    return; // Завершение программы
                }
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}