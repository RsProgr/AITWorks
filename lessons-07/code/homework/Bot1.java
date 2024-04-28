package homework;
/*
Задача 1. Написать бот, который задает не менее 3-х вопросов (последовательно),
принимает ответы от пользователя и реагирует на эти ответы по-разному, в зависимости от полученного ответа.

Пример: Как вас зовут? Очень приятно, меня зовут Бот1. Какой у вас вес? 106 кг. А какой рост? 187
А какой возраст? 60 Для вашего возраста и роста такой вес избыточен, я вам рекомендую похудеть на 5-10 кг.
 */

import java.util.Scanner;

public class Bot1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Very nice, " + name + ", my name is Bot1.");


        System.out.println("And what height?");
        int height = scanner.nextInt();

        System.out.println("How much do you weigh?");
        double weight = scanner.nextDouble();

        System.out.println("What age?");
        int age = scanner.nextInt();

        if (age > 18 && height > 170 && weight > 100) {
            System.out.println("This weight is excessive for your age and height, I recommend you lose 5-10 kg.");
        } else {
            System.out.println("Your weight is within normal limits.");
        }

        scanner.close();
    }
}