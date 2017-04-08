import java.lang.*;

public class Triangle implements Figure {
    private double a,b,c;
    private double S;
    private double P;

    public Triangle(double a, double b, double c) {
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

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getS() {
        return S;
    }

    public double getP() {
        return P;
    }

    public double area () {
        double p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double perimeter() {
        return a+b+c;
    }
    public boolean equal (Figure x) {
        if (x instanceof Triangle) {
            if ((((Triangle) x).getA()== this.a)&&(((Triangle) x).getB()==this.b)&&(((Triangle) x).getC()==this.c)){
                // System.out.println ("Figures are equal");
                return true;
            } else return false;
        } else return false;
    }
}

