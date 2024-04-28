package homework;
/*
Задача 2. Распечатайте все натуральные числа меньшие 200 и кратные 13.
 */

public class Integers {

    public static void main(String[] args) {
        int number = 0;

        while (number < 200) {
            System.out.println("number: " + number);
           number += 13;
        }
    }
}

