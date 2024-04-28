package homework;
/*
Задача 4. Написать метод, принимающий массив целых чисел,
и возвращающий произведение всех его элементов с четными индексами.
 */

import java.util.Random;

//import static classwork.ArrayApplication.printArray;

public class ArrayProduct {

    public static void main(String[] args) {
        int[] array = generateRandomArray(10, -10, 10);
        System.out.println("Random Array: ");
       // printArray(array);

        // Тестирование задачи №4
        int productOfEvenIndexedElements = calculateProductOfEvenIndexedElements(array);
        System.out.println("Product of elements with even indices: " + productOfEvenIndexedElements);
    }

    public static int[] generateRandomArray(int length, int minVal, int maxVal) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(maxVal - minVal + 1) + minVal;
        }
        return arr;
    }

    public static int calculateProductOfEvenIndexedElements(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i += 2) {
            product *= array[i];
        }
        return product;
    }
}