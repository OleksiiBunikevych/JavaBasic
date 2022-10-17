package lesson02;

import java.util.Scanner;

public class Task05 {
    //programma perovodu inches to centimeters;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches;
        System.out.print("Vvedit znachennya inches: inches=");
        inches = scanner.nextDouble();
        double centimeters = convertToCentimeters(inches);
        System.out.print("centimeters=: " + centimeters);
    }

    public static double convertToCentimeters(double inches) {
        double centimeters = 0;
        centimeters = inches * 2.54;
        return centimeters;
    }
}

