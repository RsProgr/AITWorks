package homework;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Запрос ввода операции
        System.out.println("Select operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        int operation = scanner.nextInt();

        // Переменная для хранения результата
        double result;

        // Выполнение операции в зависимости от выбора пользователя
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Result of the operation: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result of the operation: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result of the operation: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of the operation: " + result );
                } else {
                    System.out.println("Error: division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");


        }

    }
}