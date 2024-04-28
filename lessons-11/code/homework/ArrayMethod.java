package homework;
/*
Задача 2. Написать метод, принимающий массив целых чисел,
и возвращающий среднее арифметическое всех его элементов.
*/
public class ArrayMethod {

    public static void main(String[] args) {
        int[] array = {25, 40, 60, 34, 15, 45, 19, 20, 34, 1};

        double average = calculateAverage(array);
        System.out.println("Average: " + average);
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            sum += num;
        }
        return (double) sum / array.length;
    }
}