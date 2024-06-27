package homework33.todoappl.dao;


import homework33.todoappl.model.Task;

public class ToDoListImpl implements ToDoList {
    private Task[] tasks;
    private int size;
    private int nextId;


    public ToDoListImpl(int capacity) {
        tasks = new Task[capacity];
        size = 0;
        nextId = 1;
    }

    @Override
    public boolean addTask(Task task) {
        if (size < tasks.length) {
            task.setId(nextId++);
            tasks[size++] = task;
            return true;
        } else {
            System.out.println("Task list is full!");
            return false;
        }
    }

    @Override
    public boolean removeTask(int taskId) {
        int index = findTaskIndexById(taskId);
        if (index != -1) {
            Task removedTask = tasks[index];
            for (int i = index; i < size - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[--size] = null;
            renumberTasks();
            System.out.println(removedTask + " is removed.");
            return true;
        } else {
            System.out.println("Invalid task number!");
            return false;
        }
    }

    private int findTaskIndexById(int taskId) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getId() == taskId) {
                return i;
            }
        }
        return -1;
    }

    private void renumberTasks() {
        for (int i = 0; i < size; i++) {
            tasks[i].setId(i + 1);
        }
    }

    @Override
    public void viewTasks() {
        if (size == 0) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }
    }

    @Override
    public Task editTask(int taskNumber, String newDescription) {
        if (taskNumber > 0 && taskNumber <= size) {
            tasks[taskNumber - 1].setTask(newDescription);
            return tasks[taskNumber - 1];
        } else {
            System.out.println("Invalid task number!");
            return null;
        }
    }
}
