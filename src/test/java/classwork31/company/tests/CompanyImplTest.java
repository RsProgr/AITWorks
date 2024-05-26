package classwork31.company.tests;

import classwork31.company.dao.Company;
import classwork31.company.dao.CompanyImpl;
import classwork31.company.model.Employee;
import classwork31.company.model.Manager;
import classwork31.company.model.SalesManager;
import classwork31.company.model.Worker;
import homework23.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyImplTest extends Calculator {
    Company company;
    Employee[] e;


    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160, 5, 5000);
        e[1] = new SalesManager(102, "Anna", "Black", 35, 160, 25000, 0.1);
        e[2] = new SalesManager(103, "Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Hans", "Bauer", 30, 80, 5);

        // необходимо добавить элементы массива в объект company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }

    }

    @Test
    void addEmployee() {

        // нельзя добавить null
        Assertions.assertFalse(company.addEmployee(null));

        // нельзя добавить второй раз уже имеющегося
        Assertions.assertFalse(company.addEmployee(e[1]));

        // добавляем сотрудника
        Employee employee = new Manager(105, "Ivan", "Dubinin", 55, 160, 6, 6000);
        Assertions.assertTrue(company.addEmployee(employee));
        Assertions.assertEquals(5, company.quantity());

        // нельзя превысить capacity
        Employee employeeOneMore = new Worker(106, "Leon", "Kruger", 45, 80, 5);
        Assertions.assertFalse(company.addEmployee(employeeOneMore));
        company.printEmployee();


        // проверяем количество после добавления

    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void avgSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void findEmployeeHoursGreaterThen() {
    }

    @Test
    void findEmployeeSalaryRange() {
    }
}