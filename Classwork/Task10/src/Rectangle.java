public class Rectangle implements Figure {
    private double a, b;
    private String name;

    public Rectangle(String name, double a, double b) {
        this.name = name;
        if (a != 0) {
            this.a = a;
        } else this.a = 1;
        if (b != 0) {
            this.b = b;
        } else this.b = 1;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * a + 2 * b;
    }

    public boolean equals(Object x) {
        if (x instanceof Rectangle) {
            if ((((Rectangle) x).area() == this.area()) && (((Rectangle) x).perimeter() == this.perimeter())) {
                return true;
            } else return false;
        } else return false;
    }
    public String toString () {
        return (getName() + "  a = " + a + "  b = " + b);
    }
}
