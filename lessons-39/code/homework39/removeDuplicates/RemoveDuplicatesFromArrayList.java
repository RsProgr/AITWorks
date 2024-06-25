package homework39.removeDuplicates;

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
