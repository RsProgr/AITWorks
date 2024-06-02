package classwork32.company;

import classwork32.company.dao.CompanyImpl;
import classwork32.company.model.Employee;
import classwork32.company.model.Manager;
import classwork32.company.model.SalesManager;
import classwork32.company.model.Worker;

public class CompanyAppl {
    public static void main(String[] args) {

        CompanyImpl company = new CompanyImpl(5); // create object of class CompanyImpl

        Employee[] empl = new Employee[4];
        empl[0] = new Manager(100, "John", "Smith", 45, 160, 5, 5000);
        empl[1] = new SalesManager(101, "“Anna”", "“Black”", 36, 160, 25000, 0.1);
        empl[2] = new SalesManager(102, "“Thomas”", "“White”", 28, 160, 30000, 0.1);
        empl[3] = new Worker(103, "“Gans”", "“Bauer”", 30, 80, 5);

        //add employee
        for (Employee e : empl) {
            company.addEmployee(e);
        }
        //print all employee
        company.printEmployee();
        System.out.println("-----------------------------");

        //find employee with id = 101
        Employee employee = company.findEmployee(101);
        System.out.println(employee);

        //total Salary
        double totalSalary = company.totalSalary();
        System.out.println("Total Salary of company " + totalSalary);


        //add new employee
        Employee newEmployee = new Worker(104, "Robert", "Humbert", 26, 80, 5);
        company.addEmployee(newEmployee);

        System.out.println("----------------------------------------------");
        company.printEmployee();
        totalSalary = company.totalSalary(); //calculate new total  salary
        System.out.println("Total salary of company: " + totalSalary);


        Employee[] goodEmployee = company.findEmployeeHoursGreaterThen(100);
        for (Employee e : goodEmployee) {
            System.out.println(e);
        }
        System.out.println("------------------------------------");
        Employee UpdateEmployee = company.updateEmployee(101, "White");
        System.out.println("Update second name: " + UpdateEmployee);
        System.out.println("------------------------------------------");

        //avg salary
        double avgSalary = company.avgSalary();
        System.out.println("Avg Salary of company " + avgSalary);
        System.out.println("----------------------------------------");

        //total sales
        double totalSales = company.totalSales();
        System.out.println("Total sales: " + totalSales);
    }
}