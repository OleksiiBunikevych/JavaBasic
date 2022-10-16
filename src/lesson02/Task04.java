package lesson02;
import java.util.Scanner;
public class Task04 {
    //programma perovodu Fahrenheit to Celsius;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreeFahrenheit;
        System.out.print("Vvedit znachennya po Fahrenheit: " + "degreeFahrenheit=");
        degreeFahrenheit = scanner.nextFloat();
        double degreeCelsius = convertToCelsius(degreeFahrenheit);
        System.out.print("degreeCelsius=: " + degreeCelsius + "°C");
    }
    public static double convertToCelsius(double degreeFahrenheit){
        double degreeCelsius=0;
        degreeCelsius=(degreeFahrenheit-32)*5/9;
        return degreeCelsius;
    }
}

