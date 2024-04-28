package homework;

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        int[] counts = new int[6];
        int totalRolls = 20;
        Random random = new Random();

        System.out.println("Rolling a 6-sided die " + totalRolls + " times: ");

        for (int i = 0; i < totalRolls; i++) {
            int roll = random.nextInt(6) + 1;
            counts[roll - 1]++;
        }

        System.out.println("Rolls results:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Side " + (i + 1) + ": " + counts[i] + " times");
        }

        System.out.println("Probability of each side:");
        for (int i = 0; i < 6; i++) {
            double probability = (double) counts[i] / totalRolls * 100;
            System.out.printf("Грань %d: %.2f%%\n", i + 1, probability);
        }
    }
}