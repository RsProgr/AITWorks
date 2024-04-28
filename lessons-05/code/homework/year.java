package homework;

public class year {
    public static boolean leapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        else {
            return false;
        }
      }
      public static void main(String[] args) {

        int year1 = 1700;
        int year2 = 1800;
        int year3 = 1900;
        int year4 = 2000;
        System.out.println(year1 + " - " + (leapYear(year1) ? " LeapYear " : " не високосный "));
        System.out.println(year2 + " - " + (leapYear(year2) ? " LeapYear " : " не високосный "));
        System.out.println(year3 + " - " + (leapYear(year3) ? " LeapYear " : " не високосный "));
        System.out.println(year4 + " - " + (leapYear(year4) ? " LeapYear " : " не високосный "));
    }
}
