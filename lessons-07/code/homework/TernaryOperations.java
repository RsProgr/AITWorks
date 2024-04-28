package homework;
/*
Задача 2. Напишите программу, которая запрашивает у пользователя число и проверяет,
принадлежит ли оно заданному интервалу [a, b].
 */
import java.util.Scanner;

public class TernaryOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the beginning of the trip(а): ");
        double a = scanner.nextDouble();
        System.out.println("Enter the end of the interval(b): ");
        double b = scanner.nextDouble();
        System.out.println("Enter a number to check: ");
        double number = scanner.nextDouble();

        String result = (number >= a && number <= b) ? "belongs" : "don't belong";

        System.out.println("Number " + result + " interval [" + a + ", " + b + "].");
    }
}
