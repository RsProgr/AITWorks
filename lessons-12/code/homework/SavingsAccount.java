package homework;
/*
Задача 1. В сберкассу на трёхпроцентный вклад положили s рублей. Какой станет сумма вклада через n лет.
 */

import java.util.Scanner;

public class SavingsAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первоначальный взнос ");
        double s = scanner.nextDouble();

        System.out.println("Введите сколько лет: ");
        int age = scanner.nextInt();

        double A = 0.03;
        double result = s * Math.pow((1 + A), age);
        String formatResult = String.format("%.2f", result);
        System.out.println("спустя " + age + " лет " + " вы можете расчитывать на: " + formatResult);
    }
}