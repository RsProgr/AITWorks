package homework40.bank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CurrencyApp {

    Set<String> curr = new HashSet<>();

    public boolean addCurrency(String currency) {

        if (curr.contains(currency)) {
            return false;
        } else {
            curr.add(currency);
            return true;
        }
    }


    public static void main(String[] args) {
        CurrencyApp app = new CurrencyApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите наименование валюты (или 'exit' для выхода):");

        while (true) {
            System.out.print("Введите валюту: ");
            String currency = scanner.nextLine();

            if (currency.equalsIgnoreCase("exit")) {
                break; // Завершаем программу, если введено 'exit'
            }

            boolean added = app.addCurrency(currency);
            if (added) {
                System.out.println("Валюта " + currency + " успешно добавлена.");
            } else {
                System.out.println("Валюта " + currency + " уже существует.");
            }
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }
}