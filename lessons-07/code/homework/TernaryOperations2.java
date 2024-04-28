package homework;
/*
Задача 4. Напишите программу, которая запрашивает у пользователя два числа и выводит наибольшее из них.
 */

import java.util.Scanner;

/*
Задача 4. Напишите программу, которая запрашивает у пользователя два числа и выводит наибольшее из них.
 */
public class TernaryOperations2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int  number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();
        int max = (number1 > number2) ?  number1 : number2;
        System.out.println("maximum " + max);



    }
}
