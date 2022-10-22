package lesson03;

import java.io.IOException;

public class Task09 {
    public static void main(String[] args) throws IOException {
        for (int num = 1; num <= 500; num++) {
            int number, digit, sum = 0;
            number = num;
            while (number != 0) {
                digit = number % 10;
                sum = sum + digit * digit * digit;
                number /= 10;
            }
            if (sum == num)
                System.out.println(num + " is an Armstrong number");
        }
    }
}