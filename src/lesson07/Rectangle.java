package lesson07;

public class Rectangle extends Figure {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }
}
