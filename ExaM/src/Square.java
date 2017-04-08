public class Square implements Figure {
    private double a;
    private double S;
    private double P;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getS() {
        return S;
    }

    public double getP() {
        return P;
    }

    public double area () {
        return a*a;
    }

    public double perimeter() {
        return 4*a;
    }



    public boolean equal (Figure x) {
        if (x instanceof Square) {
            if (((Square) x).getA()== this.a){
               // System.out.println ("Figures are equal");
                return true;
            } else return false;
        } else return false;
    }
}


