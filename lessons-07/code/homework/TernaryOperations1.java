package homework;
/*
Задача 3. Напишите программу, которая запрашивает у пользователя номер месяца и выводит номер квартала,
 к которому этот месяц относится.
 */

import java.util.Scanner;

public class TernaryOperations1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ведите число которое принадлежит месяцу ");
        int month = scanner.nextInt();

        switch (month){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");

        }
        switch (month){
            case 1 , 2 , 3:
                System.out.println("1 quarter");
                break;
            case 4 , 5 , 6:
                System.out.println("2 quarter");
                break;
            case 7 , 8 , 9:
                System.out.println("3 quarter");
                break;
            case 10  , 11 , 12:
                System.out.println("4 quarter");
                break;
        }
    }
}