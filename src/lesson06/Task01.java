package lesson06;

public class Task01 {
    public static void main(String[] args) {
        Rectangle ABCD = new Rectangle();
        ABCD.length = 10;
        ABCD.width = 15;
        System.out.println("area: " + ABCD.getArea());
        System.out.println("perimetr: " + ABCD.getPerimetr());
    }
}

