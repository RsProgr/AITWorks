package homework39.athletesResults;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RaceResultsAppl {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the results of the race for 10 athletes: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter athlete information " + i);

            System.out.println("Lastname: ");
            String lastName = scanner.nextLine();

            System.out.println("Firstname: ");
            String firstName = scanner.nextLine();

            System.out.println("regnumber: ");
            String regNumber = scanner.nextLine();

            System.out.println("Club: ");
            String club = scanner.nextLine();

            System.out.println("result in [seconds]: ");
            double result = scanner.nextDouble();
            scanner.nextLine();

            Runner runner = new Runner(lastName, firstName, regNumber, club, result);
            runners.add(runner);
        }
        System.out.println("Final competition protocol: ");

        for (Runner runner : runners) {
            System.out.println(runner);
        }
        scanner.close();
    }
}