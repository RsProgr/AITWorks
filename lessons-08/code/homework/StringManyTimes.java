package homework;
/*
Задача 1. Программа получает на вход строку и число повторений этой строки.
Программа должна вывести эту строку нужное количество раз.
 */
import java.util.Scanner;

public class StringManyTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scanner.nextLine();
        System.out.println("Enter the number of repetitions ");
        int quantity = scanner.nextInt();
        while (quantity > 0) {
            System.out.println(str);
            quantity--;
        }
    }
}