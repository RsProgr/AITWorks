package homework;
/*Задача 5. Напишите программу, которая запрашивает у пользователя его доход и вычисляет сумму налога
согласно прогрессивной шкале налогообложения (например, 10% на доход до 10 000, 20% на доход от 10 001 до 20 000 и т.д.).
 */

import java.util.Scanner;

public class TernaryOperations3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);
        System.out.printf("Tax amount:" + tax);
    }
    public static double calculateTax(double income) {

        double tax = income <= 10000 ? income * 0.1 :
                income <= 20000 ? 10000 * 0.1 + (income - 10000) * 0.2 :
                        10000 * 0.1 + 10000 * 0.2 + (income - 20000) * 0.3;
        return tax;
    }
}

