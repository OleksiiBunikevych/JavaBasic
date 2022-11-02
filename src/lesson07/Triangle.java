package lesson07;

public class Triangle extends Figure {
    private double a;
    private double b;

    public Triangle(double width, double height, double a, double b) {
        super(width, height);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public void setB(double b) {
        if (b > 0) {
            this.b = b;
        }
    }

    public double getPerimeter() {
        return width + a + b;
    }

    public double getArea() {
        return (width * height) / 2;
    }

}
