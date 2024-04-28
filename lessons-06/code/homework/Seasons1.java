package homework;

import java.util.Scanner;

public class Seasons1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        String monthName ;
        String season;

        switch (monthNumber){
            case 1: {
                monthName = "январь";
                season = "зима";
                break;
                }
            case 2:{
                monthName = "февраль";
                season = "зима";
                break;
            }

            case 3:{
                monthName = "март";
                season = "весна";
                break;
            }
            case 4:{
                monthName = "апрель";
                season = "весна";
                break;
            }
            case 5:{
                monthName = "май";
                season = "весна";
                break;
            }
            case 6:{
                monthName = "июнь";
                season = "лето";
                break;
            }
            case 7:{
                monthName = "июль";
                season = "лето";
                break;
            }
            case 8:{
                monthName = "август";
                season = "лето";
                break;
            }
            case 9:{
                monthName = "сентябрь";
                season = "осень";
                break;
            }
            case 10:{
                monthName = "октябрь";
                season = "осень";
                break;
            }
            case 11:{
                monthName = "ноябрь";
                season = "осень";
                break;
            }
            case 12:{
                monthName = "декабрь";
                season = "зима";
                break;

            }
            default:
                monthName = "такого месяца не существует";
                season = "такого времени года нет";
                break;
        }
        System.out.println("Месяц: " + monthName);
        System.out.println("Время года: " + season);
    }
}
