package lesson06;

public class Rectangle {
    public double length;
    public double width;

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimetr() {
        double perimetr = (length + width) * 2;
        return perimetr;
    }
}
