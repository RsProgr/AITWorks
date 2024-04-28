package homework;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseSalary = 500;
        System.out.println("Enter number of years of work: ");
        int yearsWorked = scanner.nextInt();
        double bonus = 0;

        if (yearsWorked >= 3) {
            bonus = 0.1;
        } else if (yearsWorked >= 5) {
            bonus = 0.5;
        } else if (yearsWorked >= 10) {
            bonus = 1;
        } else if (yearsWorked >= 15) {
            bonus = 1.5;
        }
        double totalSalary = baseSalary * (1 + bonus);
        System.out.println("Giving money to an employee: " + totalSalary);
    }
}