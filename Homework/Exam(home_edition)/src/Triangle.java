import java.lang.*;

public class Triangle implements Figure {
    private double a,b,c;
    private String name;

    public Triangle(String name, double a, double b, double c) {
        this.name = name;
        if (a!=0) {
            this.a = a;
        } else this.a = 1;
        if (b!=0) {
            this.b = b;
        } else this.b = 1;
        if (c!=0) {
            this.c = c;
        } else this.c = 1;

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

    public double getC() {
        return c;
    }

    public double area () {
        double p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double perimeter() {
        return a+b+c;
    }
    public boolean equals (Object x) {
        if (x instanceof Triangle) {
            if ((((Triangle) x).getA()== this.a)&&(((Triangle) x).getB()==this.b)&&(((Triangle) x).getC()==this.c)){
                return true;
            } else return false;
        } else return false;
    }
    public String toString () {
        return (getName() + "  a = " + a + "  b = " + b + "  c = " + c);
    }
}

