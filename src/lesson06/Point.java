package lesson06;

public class Point {
    private int X;
    private int Y;

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    public double getDistanse(Point point) {
       return Math.sqrt(Math.pow(this.X-point.X, 2) + Math.pow(this.Y - point.Y, 2));
    }}
