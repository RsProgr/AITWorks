package homework.student.model;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль не возможно");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция");
                return;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}