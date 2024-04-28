package homework;
/*
Задача 3. Бросьте кубик с 6-ю гранями 20 раз.
Подсчитайте, сколько раз выпала каждая цифра.
Посчитайте вероятность выпадения каждой грани.
 */

import java.util.Random;

class DiceRoll1 {
    public static void main(String[] args) {
        int[] counts = new int[6];
        int totalRolls = 20;
        Random random = new Random();

        System.out.println("Rolling a 6-sided die " + totalRolls + " times:");

        for (int i = 0; i < totalRolls; i++) {
            int roll = random.nextInt(6) + 1;
            counts[roll - 1]++;
        }

        System.out.println("Rolls results:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Side " + getDiceSymbol(i + 1) + " - " + counts[i] + " times");
        }

        System.out.println("Probability of each side:");
        for (int i = 0; i < 6; i++) {
            double probability = (double) counts[i] / totalRolls * 100;
            System.out.printf("Side %s - %.2f%%\n", getDiceSymbol(i + 1), probability);
        }
    }

    public static String getDiceSymbol(int side) {
        switch (side) {
            case 1:
                return "\u2680"; // ⚀
            case 2:
                return "\u2681"; // ⚁
            case 3:
                return "\u2682"; // ⚂
            case 4:
                return "\u2683"; // ⚃
            case 5:
                return "\u2684"; // ⚄
            case 6:
                return "\u2685"; // ⚅
            default:
                return "";
        }
    }
}