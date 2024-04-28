package homework;
/*
Задача 1. Заполните массив целыми числами от 1 до 100.
Добавьте случайное целое число в интервале от 1 до 100
на случайное место в исходный массив.
Найдите наиболее коротким способом,
какое число было добавлено в массив.
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayAddedNumbers {

    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("array from 1-100: ");
        System.out.println(Arrays.toString(array));

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int randomIndex = random.nextInt(array.length + 1);

        int[] newArray = new int[array.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == randomIndex) {
                newArray[i] = randomNumber;
            } else {
                newArray[i] = array[j++];
            }
        }
        System.out.println("new array with added numbers: ");
        System.out.println(Arrays.toString(newArray));
        System.out.println("Added number: " + randomNumber);
    }
}