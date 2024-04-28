package homework;
/*
 *Задача 5.() Написать метод, принимающий массив целых чисел,
 *и разворачивающий его. Последний элемент становится нулевым,
 *предпоследний, первым, и т. д.
 *Подсказка: этот метод должен изменить полученный массив.
 */

import classwork.ArraysMethods;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] array = {15, 25, 300, 40, 55};
        System.out.println("Source array: ");
        ArraysMethods.printArray(array);

        reverseArray(array);

        System.out.println("Array after reversal: ");
        ArraysMethods.printArray(array);
    }

    public static void reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}