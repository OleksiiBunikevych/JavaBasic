package lesson07;

public class Figure{

    double width;
    double height;

    public Figure(double width, double height) {
        this.width = this.width;
        this.height = this.height;
    }

    public Figure() {
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

}
