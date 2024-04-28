package homework;
/*
Вводится шестизначное число (номер автобусного билета).
Определите, является ли этот билет "счастливым"
(сумма первых трех цифр равна сумме трех последних цифр).
 */
import java.util.Scanner;

public class busTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a six-digit number: ");
        int ticketNumber = scanner.nextInt();
        boolean isLucky = checkLuckyTicket(ticketNumber);
        if (isLucky) {
            System.out.println("Lucky ticket ");
        } else {
            System.out.println("The ticket is not lucky");
        }
    }
    private static boolean checkLuckyTicket(int number) {
        int digit1 = number / 100000;
        int digit2 = (number / 10000) % 10;
        int digit3 = (number / 1000) % 10;
        int digit4 = (number / 100) % 10;
        int digit5 = (number / 10) % 10;
        int digit6 = number % 10;
        return (digit1 + digit2 + digit3) == (digit4 + digit5 + digit6);
    }
}