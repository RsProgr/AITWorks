package homework;
/*
Задача 3. Определение времени суток. Напишите программу,
которая принимает на ход текущий час (от 0 до 23) и выводит приветствие
в зависимости от времени суток
(утро, день, вечер, ночь).
 */

import java.util.Scanner;

public class TimesOfDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int currentTime;
        while (true) {
            boolean repeat;

            do {
                repeat = false;
                System.out.println("Enter the current hour from 0 to 23: ");
                currentTime = scanner.nextInt();
                if (currentTime < 0 || currentTime > 23) {
                    System.out.println("Incorrect value! Please enter the hour from 0 to 23. ");
                    repeat = true;
                }
            }
            while (repeat);

            if (currentTime >= 0 && currentTime < 6) {
                System.out.println("Good night");
            } else if (currentTime >= 6 && currentTime < 12) {
                System.out.println("Good morning");
            } else if (currentTime >= 12 && currentTime < 18) {
                System.out.println("Good afternoon");
            } else {
                System.out.println("Good evening");
            }
        }
    }
}
