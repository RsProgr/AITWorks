package homework40.bank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CurrencyApp {

    Set<String> currencies = new HashSet<>();

    public boolean addCurrency(String currency) {

        if (currencies.contains(currency)) {
            return false;
        } else {
            currencies.add(currency);
            return true;
        }
    }

    public static void main(String[] args) {
        CurrencyApp app = new CurrencyApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the currency (or 'exit' to quit):");

        while (true) {
            System.out.print("Enter currency: ");
            String currency = scanner.nextLine();

            if (currency.equalsIgnoreCase("exit")) {
                break;
            }

            boolean added = app.addCurrency(currency);
            if (added) {
                System.out.println("Currency " + currency + " successfully added.");
            } else {
                System.out.println("Currency " + currency + " already exists.");
            }
        }

        scanner.close();
        System.out.println("Program terminated.");
    }
}