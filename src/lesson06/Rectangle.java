package lesson06;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimetr() {
        double perimetr = (length + width) * 2;
        return perimetr;
    }
}
