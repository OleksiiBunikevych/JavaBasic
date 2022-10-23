package lesson06;

public class Task02 {
    public static void main(String[] args) {
        Circle kolo = new Circle();
        final double Pi = 3.1415926536;
        kolo.radius = 10;
        System.out.println("area: " + kolo.getArea());
        System.out.println("perimetr: " + kolo.getPerimetr());
    }
}