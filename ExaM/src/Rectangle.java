public class Rectangle implements Figure {
    private double a, b;
    private double S;
    private double P;

    public Rectangle(double a, double b) {
        if (a != 0) {
            this.a = a;
        } else this.a = 1;
        if (b != 0) {
            this.b = b;
        } else this.b = 1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getS() {
        return S;
    }

    public double getP() {
        return P;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * a + 2 * b;
    }

    public boolean equal(Figure x) {
        if (x instanceof Rectangle) {
            if ((((Rectangle) x).getP() == this.P) && (((Rectangle) x).getS() == this.S)) {
                // System.out.println ("Figures are equal");
                return true;
            } else return false;
        } else return false;
    }
}
