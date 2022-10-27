package lesson06;

import static java.lang.Math.PI;

public class Task02 {
    public static void main(String[] args) {
        Circle kolo = new Circle(PI, 10);
        System.out.println("area: " + kolo.getArea());
        System.out.println("perimetr: " + kolo.getPerimetr());
    }
}