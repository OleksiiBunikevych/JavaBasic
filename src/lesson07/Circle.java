package lesson07;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private double radius;

    public Circle(double PI, double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

}
