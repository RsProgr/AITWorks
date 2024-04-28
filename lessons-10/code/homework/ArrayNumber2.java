package homework;
/*
Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
Найдите максимальный элемент массива и его индекс.
 */
public class ArrayNumber2 {
    public static void main(String[] args) {

        int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("Maximum array element: " + max);
        System.out.print("Index of maximum array element: " + indexMax);
    }
}