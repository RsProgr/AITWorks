package homework;

public class year1 {

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int[] years = {1700, 1800, 1900, 2000};

        for (int year : years) {
            System.out.println(year + (leapYear(year) ? " - Leap year" : " - Not leap year"));
        }
    }
}

