package lesson03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result, ostatok;
        System.out.print("number1=");
        number1 = scanner.nextDouble();
        System.out.print("number2=");
        number2 = scanner.nextDouble();
        System.out.print("Action:");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        switch (action) {
            case ("+"):
                result = number1 + number2;
                System.out.print("Resultat=" + result);
                break;
            case ("-"):
                result = number1 - number2;
                System.out.print("Resultat=" + result);
                break;
            case ("*"):
                result = number1 * number2;
                System.out.print("Resultat=" + result);
                break;
            case ("/"):
                if (number2 == 0)
                    System.out.print("Error");
                else {
                    result = number1 / number2;
                    ostatok = number1 % number2;
                    System.out.println("Resultat=" + result);
                    System.out.println("Ostatok=" + ostatok);
                    break;
                }
        }
    }
}