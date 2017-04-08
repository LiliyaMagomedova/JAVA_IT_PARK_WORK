public class Main {
    public static void main (String[] args) {
        Rectangle R1 = new Rectangle( "R1", 2,3 );
        Rectangle R2 = new Rectangle( "R2",2,3 );
        Rectangle R3 = new Rectangle("R3", 4,3 );
        Triangle T1 = new Triangle("T1", 1,2,3);
        Triangle T2 = new Triangle("T2", 1,2,3);
        Triangle T3 = new Triangle("T3", 2,2,2);
        Square S1 = new Square("S1",4);
        Square S2 = new Square("S2",4);
        Figure arr[] = {T2,T3,R3,R1,T1,S1,R2,S2};
        for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    arr[i] = null;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
