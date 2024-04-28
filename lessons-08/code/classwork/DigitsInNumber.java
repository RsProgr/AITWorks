package classwork;
/*
Пользователь вводит натуральное число (целое, положительное).
Выясните, сколько цифр в числе.
(//356712 - это ввёл пользователь, программа должна выдать: 6 цифр
// 3243654764552354360 - 19 цифр)
 */

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Алгоритм :
        // числа записываются в 10-тичной системе счисления,
        // каждый знак отвечает за разряд числа
        //будем на каждом шагу делить число на 10 с остатком.

        // Взаимодействие с пользователем
        // запросить у него число
        // напечатать число = кол-во цифр

        System.out.println("Input integer and positive number: ");
        long number = scanner.nextLong();
        int count = 0;
        while (number > 0) {
            number = number / 10;// деление даёт нам сколько цифр
            count++; // увеличиваем счетчик
        }
        System.out.println("Number of digits are: " + count);
    }
}
