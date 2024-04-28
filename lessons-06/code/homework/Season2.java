package homework;

import java.util.Scanner;

public class Season2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        String monthName ;
        String season;

        switch (monthNumber){
            case 1: monthName = "январь , февраль , март , апрель , май , июнь , июль , август , сентябрь , октябрь" +
                    "ноябрь , декабрь";
            case 2: season = "зима , зима , весна , весна , весна , лето , лето , лето , осень , осень , осень , зима ";
                System.out.println("The entered month is - " + season);
        }

    }

}
