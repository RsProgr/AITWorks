package homework;
/*
Задача 2. Вводится положительное целое число,
найдите сумму его цифр.
Пример: 1725, сумма цифр = 15
 */
import java.util.Scanner;

public class SumOfAnInteger {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitSum = sumOfDigits(number);
        System.out.println("Sum of digits of a number " + number + " --- " + digitSum);
    }
    private static int sumOfDigits(int number) {
        int digitSum = 0;

        while (number > 0) {
            int digit = number % 10;
            digitSum += digit;
            number /= 10;
        }
        return digitSum;
    }
}