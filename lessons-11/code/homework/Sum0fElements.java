package homework;
//Задача 3. Написать метод, принимающий массив целых чисел,
//и возвращающий сумму всех его нечетных элементов.

import classwork.ArraysMethods;

import java.util.Random;

public class Sum0fElements {

    public static void main(String[] args) {

        int[] array = generateRandomArray(10, -10, 10);
        ArraysMethods.printArray(array);
        int sumOfOdd = calculateSumOfOdd(array);
        System.out.println("Sum of odd elements: " + sumOfOdd);
    }

    public static int[] generateRandomArray(int length, int minVal, int maxVal) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int num = random.nextInt(maxVal - minVal) + minVal;
            arr[i] = num;
        }
        return arr;
    }

    public static int calculateSumOfOdd(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}