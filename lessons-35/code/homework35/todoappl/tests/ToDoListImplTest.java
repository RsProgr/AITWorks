package homework35.todoappl.tests;

import homework35.todoappl.dao.ToDoList;
import homework35.todoappl.dao.ToDoListImpl;
import homework35.todoappl.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest {
    ToDoList toDoList;
    Task[] t;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        toDoList = new ToDoListImpl(6);
        t = new Task[5];
        t[0] = new Task(1, "Включить компьютер", 1, now.minusDays(4));
        t[1] = new Task(2, "Сходить в магазин", 2, now.minusDays(1));
        t[2] = new Task(3, "Сходить на работу", 3, now.minusDays(5));
        t[3] = new Task(4, "Выйти гулять", 4, now.minusDays(1));
        t[4] = new Task(5, "Exit", 5, now.minusDays(1));
        for (int i = 0; i < t.length; i++) {
            toDoList.addTask(t[i]);
        }
    }

    @Test
    void addTask() {
        assertFalse(toDoList.addTask(null));
        assertFalse(toDoList.addTask(t[1]));
        Task task = new Task(6, "убраться в комнате", 6, now.minusDays(3));
        assertTrue(toDoList.addTask(task));
        assertEquals(6, toDoList.quantity());
        Task taskOneMore = new Task(7, "пойти спать", 7, now.minusDays(4));
        assertFalse(toDoList.addTask(taskOneMore));
        toDoList.printTask();
    }

    @Test
    void printTask() {
        toDoList.printTask();

    }

    @Test
    void quantity() {
        assertEquals(5, toDoList.quantity());
    }

    @Test
    void removeTask() {
        assertEquals(t[1], toDoList.removeTask(2));
        assertEquals(4, toDoList.quantity());
        System.out.println("=======================");
        toDoList.printTask();
    }

    @Test
    void findTask() {
        assertEquals(t[1], toDoList.findTask(2));
        assertNull(toDoList.findTask(7));
        System.out.println("====================");
    }

    @Test
    void updateTask() {
        assertEquals(t[2], toDoList.removeTask(3));
        assertEquals(4, toDoList.quantity());
        toDoList.printTask();
    }

}