package homework25;
// задание: сумма чисел.

import java.util.Scanner;

public class countingTheAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день рождения: ");
        int dayOfBirth = scanner.nextInt();

        System.out.print("Введите год рождения: ");
        int yearOfBirth = scanner.nextInt();

        int x = dayOfBirth * yearOfBirth;
        int sumResult = calculateSum(x);

        System.out.println("Сумма чисел от 1 до " + x + " равна " + sumResult);
    }

    public static int calculateSum(int x) {

        int totalSum = 0;

        for (int num = 1; num <= x; num++) {
            totalSum += num;
        }

        return totalSum;
    }

}