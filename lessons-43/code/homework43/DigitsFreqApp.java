package homework43;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqApp {
    public static void main(String[] args) {
        // Map to store frequency of each digit (0-9)
        Map<Integer, Integer> digitFrequency = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            digitFrequency.put(i, 0);
        }

        // Generate one million random numbers in the range [100, 1000)
        Random random = new Random();
        int min = 100;
        int max = 1000;
        int numberOfNumbers = 1_000_000;

        for (int count = 0; count < numberOfNumbers; count++) {
            int randomNumber = random.nextInt(max - min) + min;
            // Extract digits from the number
            int number = randomNumber;
            while (number > 0) {
                int digit = number % 10;
                digitFrequency.put(digit, digitFrequency.get(digit) + 1);
                number /= 10;
            }
        }

        // Print frequencies of each digit
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + ": " + digitFrequency.get(i));
        }
    }
}