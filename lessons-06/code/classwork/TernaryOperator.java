package classwork;

import java.util.Scanner;

/*- Задание 1.
В программе задаются два целых числа.
Найдите минимальное из них с помощью тернарного оператора.
Дополните программу возможностью ввода чисел пользователем.
*/
public class TernaryOperator {


    public static void main(String[] args) {

        int a = -0;
        int b = -35;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        a = scanner.nextInt();
        System.out.println("Input 2st number: ");
        b = scanner.nextInt();

        int min = (a < b ) ? a : b; // тернарный оператор
        System.out.println("минимум "  + min);


    }




}
