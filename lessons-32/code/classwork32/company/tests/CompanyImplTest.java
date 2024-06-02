package classwork32.company.tests;

import classwork32.company.dao.Company;
import classwork32.company.dao.CompanyImpl;
import classwork32.company.model.Employee;
import classwork32.company.model.Manager;
import classwork32.company.model.SalesManager;
import classwork32.company.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160, 5, 5000);
        e[1] = new SalesManager(102, "Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager(103, "Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Hans", "Bauer", 30, 80, 5);

        // необходимо добавить элементы массива в company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
    }

    @Test
    void addEmployee() {
        // нельзя добавить null
        assertFalse(company.addEmployee(null));
        // нельзя добавить второй раз уже имеющегося
        assertFalse(company.addEmployee(e[1]));
        // добавляем сотрудника
        Employee employee = new Manager(105, "Ivan", "Dubinin", 55, 160, 6000, 6);
        assertTrue(company.addEmployee(employee));
        // проверяем кол-во после добавления
        assertEquals(5, company.quantity());
        // нельзя превысить capacity
        Employee employeeOneMore = new Worker(106, "Leon", "Kruger", 45, 80, 5);
        assertFalse(company.addEmployee(employeeOneMore));
        company.printEmployee();
    }

    @Test
    void removeEmployee() {
        assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company.quantity());
        company.printEmployee();
    }

    @Test
    void findEmployee() {
        // find employee with id = 102
        assertEquals(e[1], company.findEmployee(102));
        // find employee with id = 107
        assertNull(company.findEmployee(107));
    }

    @Test
    void quantity() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalary() {
        assertEquals(11700, company.totalSalary());
    }

    @Test
    void avgSalary() {
        assertEquals(11700 / 4, company.avgSalary());
    }

    @Test
    void totalSales() {
        assertEquals(55000, company.totalSales());
    }

    @Test
    void printEmployee() {
        company.printEmployee();
    }

    @Test
    void findEmployeeHoursGreaterThen() {
        Employee[] actual = company.findEmployeeHoursGreaterThen(100);
        Employee[] expected = {e[0], e[1], e[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeeSalaryRange() {
        company.printEmployee();
        Employee[] actual = company.findEmployeeSalaryRange(2900, 6000);
        Employee[] expected = {e[0], e[2]};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);

    }



    @Test
    void updateEmployee() {
        assertEquals(e[1], company.updateEmployee(102, "Britten"));
        assertEquals(4, company.quantity());
        company.printEmployee();

    }
}