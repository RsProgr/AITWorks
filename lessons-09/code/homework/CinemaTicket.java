package homework;
/*
Задача 4. В кинотеатре есть разные типы билетов:
стандартный, студенческий (-10%) и для пенсионеров(-25%).
Каждый тип билета имеет свою стоимость.
Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
Создайте метод calculateTicketPrice, который принимает возраст клиента,
статус студента и флаг VIP-места, а возвращает итоговую стоимость билета.
Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.
 */

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean process = true;
        do {
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Are you a student ?"  + "enter either True or False");
            boolean isStudent = scanner.nextBoolean();
            System.out.println("you want to use VIP?" + "enter True or False ");
            boolean isVip = scanner.nextBoolean();

            double ticketPrice = calculateTicketPrice(age, isStudent, isVip);
            System.out.println("Total ticket price: " + ticketPrice + "$");

        }
        while (process);
    }
    private static double calculateTicketPrice(int age, boolean isStudent, boolean isVip) {
        double standardPrice = 10.0;
        double discount = isStudent ? 0.1 : (age >= 60 ? 0.25 : 0);
        double surcharge = isVip ? 0.25 : 0;

        return standardPrice * (1 - discount) * (1 + surcharge);
    }
}
