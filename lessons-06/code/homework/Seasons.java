package homework;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;

        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println("это январь");
            season = "Winter";
        } else if (month >= 3 && month <= 5) {
            season = "Spring";
        } else if (month >= 6 && month <= 8) {
            season = "Summer";
        } else if (month >= 9 && month < 12) {
            season = "Autumn";
        } else {
            season = "Invalid input";
        }
        System.out.println("The entered month is - " + season);
    }
}