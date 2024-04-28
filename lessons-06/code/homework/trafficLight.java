package homework;

import java.util.Scanner;

public class trafficLight {


    public static void main(String[] args) {
        String trafficLightColor = "red";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter traffic light color (red, yellow, green): ");
        String inputColor = scanner.nextLine();

        if (inputColor.equals("red") || inputColor.equals("yellow") || inputColor.equals("green")) {
            trafficLightColor = inputColor;
        } else {
            System.out.println("Incorrect color. The current traffic light color will be used: " + trafficLightColor);
        }

        switch (trafficLightColor) {
            case "red":
                System.out.println("Stop! The traffic light is red.");
                break;
            case "yellow":
                System.out.println("Get ready to stop! The traffic light is yellow.");
                break;
            case "green":
                System.out.println("Keep moving! The traffic light is green.");
                break;
        }
    }
}