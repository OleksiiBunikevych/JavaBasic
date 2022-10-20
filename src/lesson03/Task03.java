package lesson03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        System.out.print("number1=");
        number1 = scanner.nextDouble();
        System.out.print("number2=");
        number2 = scanner.nextDouble();
        if (number1 == number2) {
            System.out.println("number 1  is equal to number2");
        } else if (number1 > number2) {
            System.out.println("number 1 more number2");
        } else {
            System.out.println("number 1 less number2");
        }
    }
}
