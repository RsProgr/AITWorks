package homework35.todoappl.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task> {
    // fields
    private int id; // идентификатор
    private String task; // содержание задачи
    private int taskNumber;
    private LocalDateTime dateTime;

    // constructor


    public Task(int id, String task, int taskNumber, LocalDateTime dateTime) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // метод toString
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                ", dateTime=" + dateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return taskNumber == task.taskNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(taskNumber);
    }

    @Override
    public int compareTo(Task o) {
        // return this.taskNumber - o.getTaskNumber(); // естественная сортировка по taskNumber, от меньшего к большему
        return Integer.compare(this.taskNumber, o.taskNumber); // лучший вариант
    }
}