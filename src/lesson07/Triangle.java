package lesson07;

public class Triangle extends Figure {
    private double AB;
    private double BC;
    private double CA;

    public Triangle(double AB, double BC, double a, double CA) {
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;

    }

    public double getAB() {
        return AB;
    }

    public double getBC() {
        return BC;
    }

    public double getCA() {
        return CA;
    }

    public void setAB(double AB) {
        if (AB > 0) {
            this.AB = AB;
        }
    }

    public void setBC(double BC) {
        if (BC > 0) {
            this.BC = BC;
        }
    }

    public void setCA(double CA) {
        if (CA > 0) {

            this.CA = CA;
        }
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

    @Override
    public double getPerimeter() {
        return AB + BC + CA;
    }

    @Override
    public double getArea() {
        double P = AB + BC + CA;
        return Math.sqrt(P * (P - AB) * (P - BC) * (P - CA));
    }

}
