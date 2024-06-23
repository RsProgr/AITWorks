package homework35.todoappl;

import homework35.todoappl.model.Menu;

import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + " - " + menu[i].getTask());

        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input you choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("First recording: " + menu[choice - 1].getTask());
                case 2 -> System.out.println("next task: " + menu[choice - 1].getTask());
                case 3 -> System.out.println("third task: " + menu[choice - 1].getTask());
                case 4 -> System.out.println("fourth task: " + menu[choice - 1].getTask());
                case 5 -> {
                    System.out.println("Exit: " + menu[choice - 1].getTask());
                    return;
                }
                default -> System.out.println("Wrong choice!");
            }
        }
    }
}