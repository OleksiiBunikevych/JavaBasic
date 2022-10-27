package lesson06;

public class Circle {
    final double PI;
    public double radius;

    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimetr() {
        double perimetr = 2 * PI * radius;
        return perimetr;
    }
}