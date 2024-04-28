package homework;
/*
Задача 3. ()* Найти в Интернете алгоритм selection sort.
https://www.geeksforgeeks.org/selection-sort/
Задать массив из случайных целых чисел.
Реализовать метод, получающий на вход массив и сортирующий его по алгоритму selection sort.
 */
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10);

        System.out.println("Source array: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    int temp = array[minIndex];
                    array[minIndex] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}