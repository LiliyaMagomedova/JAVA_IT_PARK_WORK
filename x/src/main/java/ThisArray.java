import java.util.Random;

/**
 * Created by Student20 on 10.06.2017.
 */
public class ThisArray {
    private int n;
    int a[] = new int[n];

    public ThisArray(int n) {
        this.n = n;
    }


    private void arrayBuilder (){
        Random random = new Random();
        for (int i = 0; i<n; i++) {
            a[i] = random.nextInt()%10;
            System.out.println(a[i]+  ' ');
        }
    }
}
