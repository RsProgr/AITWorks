package homework35.todoappl.tests;

import homework35.todoappl.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;

import static classwork.computers.ComputerCompareAppl.printArray;
import static org.junit.jupiter.api.Assertions.*;

class ToDoListApplTest {
    Task[] tasks;

    @BeforeEach
    void setUp() {

        tasks = new Task[5];
        tasks[0] = new Task(1, "Включить компьютер", 4, LocalDateTime.now());
        tasks[1] = new Task(2, "Сходить в магазин", 2, LocalDateTime.now());
        tasks[2] = new Task(3, "Сходить на работу", 1, LocalDateTime.now());
        tasks[3] = new Task(4, "Выйти гулять", 5, LocalDateTime.now());
        tasks[4] = new Task(5, "Exit", 3, LocalDateTime.now());

    }

    @Test
    void testTaskSor() {
        System.out.println("============Test task sorting===============");
        printArray(tasks);
        Arrays.sort(tasks);
        System.out.println("========After sorting by task number====================");
        printArray(tasks);
    }
}