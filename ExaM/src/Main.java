import java.lang.Math;
public class Main {
    public static void main (String[] args) {
        Rectangle R1 = new Rectangle( 2,3 );
        Rectangle R2 = new Rectangle( 2,3 );
        Rectangle R3 = new Rectangle( 4,3 );
        Triangle T1 = new Triangle(1,2,3);
        Square S1 = new Square(4);
        Square S2 = new Square(4);
        Figure arr[] = {R1,R2,R3,T1,S1,S2};
        for (int i = 0; i<arr.length; i++) {
            for (int j = i; j <arr.length; j++) {
                if (arr[i].equal(arr[j])){
                    arr[i]=null;
                }
            }

        }
    }
}
