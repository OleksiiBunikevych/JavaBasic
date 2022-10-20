package lesson03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Data:");
        System.out.print("number=");
        int number = scanner.nextInt();
        System.out.print("notacion=");
        int notacion = scanner.nextInt();
        System.out.println("Expected Output:");
        System.out.println(numberSystem(number, notacion));
    }

    public static String numberSystem(int number, int notation) {
        List<Character> numbers = getLimitation();
        if (notation < 2 || notation >= numbers.size() || number < 0)
            throw new IllegalArgumentException();
        StringBuilder valueStr = new StringBuilder();
        while (number > 0) {
            valueStr.insert(0, numbers.get(number % notation));
            number = number / notation;
        }
        return valueStr.toString();
    }

    private static List<Character> getLimitation() {
        ArrayList<Character> numbers = new ArrayList<>();
        for (char i = '0'; i <= '9'; i++) {
            numbers.add(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}