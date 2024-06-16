package homework36.birthday_TimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BirthDay {
    public static void main(String[] args) {
        LocalDate birthDayStart = LocalDate.of(1989, 05, 11);
        System.out.println(birthDayStart);
        System.out.println("--------------------------");

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(birthDayStart.format(df));

        System.out.println("--------------------------");
        df = DateTimeFormatter.ofPattern("dd MMMM YYYY", Locale.FRANCE);
        System.out.println(birthDayStart.format(df));

        System.out.println("==============parsing date from string=================");
        String str = "11 05 1989";
        System.out.println(str);
    }
}