package homework;

import java.util.Scanner;

public class summa {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        char choice;
        do {

            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println("сумма двух чисел ровна  " + sum);
            System.out.println("хотите ли вы продолжить (y/n)");
            choice = scanner.next().charAt(0);

        }
        while (choice == 'y' || choice == 'Y');
            System.out.println("Цикл завершен ");

    }
}