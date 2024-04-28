package homework;
/*
Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
Выведите массив на печать. Поменяйте местами первый и последний элементы массива
и снова выведите массив на печать.
 */

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrayOfNumbers = new int[20];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(11) + 10;

        }
        System.out.println(Arrays.toString(arrayOfNumbers));
        int change = arrayOfNumbers[0];
        arrayOfNumbers[0] = arrayOfNumbers[arrayOfNumbers.length - 1];

        arrayOfNumbers[arrayOfNumbers.length - 1] = change;
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}