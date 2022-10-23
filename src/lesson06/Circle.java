package lesson06;

public class Circle {
    final double Pi = 3.1415926536;
    public double radius;

    public double getArea() {
        double area = Pi * Math.pow(radius, 2);
        return area;
    }

    public double getPerimetr() {
        double perimetr = 2 * Pi * radius;
        return perimetr;
    }
}