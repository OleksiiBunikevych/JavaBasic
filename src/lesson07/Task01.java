package lesson07;

public class Task01 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(30, 10);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Circle circle = new Circle(31);
        System.out.println(circle.toString());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle(25, 30, 17, 21);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}