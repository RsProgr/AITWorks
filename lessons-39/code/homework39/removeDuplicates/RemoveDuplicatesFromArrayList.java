package homework39.removeDuplicates;
//Задача 5.(*)
// Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10.
//Удалите из полученного списка дубликаты.

import java.util.ArrayList;
import java.util.Random;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(10) + 1;
            numbers.add(randomNumber);
        }
        System.out.println("Исходный список: ");
        System.out.println(numbers);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        numbers.clear();
        numbers.addAll(uniqueNumbers);

        System.out.println("Список без дубликатов: ");
        System.out.println(numbers);
    }
}
