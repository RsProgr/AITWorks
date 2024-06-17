package homework36.birthday_TimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BirthDay {
    public static void main(String[] args) {
        LocalDate Birthday = LocalDate.of(1989, 05, 11);
        System.out.println(Birthday);
        System.out.println("------------------------");

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(Birthday.format(df));
        System.out.println("--------------------------------");

        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH);
        System.out.println(Birthday.format(df));
        System.out.println("---------------------------");

        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(Birthday.format(df));
        System.out.println("-------------------------");

        df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(Birthday.format(df));
        System.out.println("--------------------------");

        System.out.println("=============parsing date from string===============");
        String str = "11 05 1989";
        System.out.println(str);

        System.out.println("=====================================================");
        LocalDate date = dateParse(str);
        System.out.println(date + " " + date.getDayOfWeek());

    }

    // извлекает из строки дату в формате ISO по формату текстовому
    private static LocalDate dateParse(String date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd MM yyyy][yyyy-MM-dd][dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyyy]");
        return LocalDate.parse(date, df);
    }
}