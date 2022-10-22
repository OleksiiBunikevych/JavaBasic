package lesson03;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        System.out.println(new StringBuilder(n).reverse().toString());

    }
}