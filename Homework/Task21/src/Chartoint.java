public class Chartoint {
    private char a[];

    public Chartoint(char[] a) {
        this.a = a;
    }

    public char[] getA() {
        return a;
    }

    public int transform () {
        int result = 0;
        int i = 0;
        for (i=0; i< this.a.length; i++) {
            if (this.a[i]>='0'&&this.a[i]<='9') {
                result = result * 10 + this.a[i]-'0';
            } else {
                System.err.println("Transformation is impossible, "+ this.a[i]+" is not a digit");
                break;
                }
            }
            if (i==this.a.length) {
                return result;
            }
            else {
            return 0;
        }
    }
}
