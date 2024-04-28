package homework;
/*
Задача 1. Задайте массив из 10 случайных целых чисел
в интервале от -20 до 20. Запросите у пользователя какое-то целое число.
Определите, есть ли это число в массиве.
Создайте и используйте метод searchInArray, который получает на вход массив
и искомое число, а возвращает ответ - нашлось ли это число в массиве.
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Array0fRandomNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        int[] randomArray = generateRandomArray(10, -20, 20);
        System.out.println("Array: " + Arrays.toString(randomArray));

        boolean found = false;
        for (int i = 0; i < randomArray.length; i++) {
            int num = randomArray[i];
            if (num == userInput) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found in array.");
        } else {
            System.out.println("Number not found in array.");
        }
    }

    public static int[] generateRandomArray(int length, int minVal, int maxVal) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(maxVal - minVal + 1) + minVal;
        }
        return arr;
    }
}