public class Square implements Figure {
    private double a;
    private String name;


    public Square(String name, double a) {
        this.name = name;
        if (a != 0) {
            this.a = a;
        } else {
            this.a = 1;
            }
        }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double area () {
        return a*a;
    }

    public double perimeter() {
        return 4*a;
    }

    public boolean equals (Object x) {
        if (x instanceof Square) {
            if (((Square) x).getA()== this.a){
                return true;
            } else return false;
        } else return false;
    }
    public String toString () {
        return (getName() + "  a = " + a);
    }
}


