package homework;
/*
Задача 2. Написать метод copyOfArray.
Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
Метод должен создать новый массив длиной newLength.
В новый массив должны быть скопированы элементы из входящего массива:

Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
 */

import classwork.ArraysMethods;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        int[] inputArray = {0, 1, 2, 3, 4, 5, 6};
        int newLength = 3;
        int[] newArray = ArraysMethods.copyOfArray(inputArray, newLength);
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}