import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k;
        System.out.println("Введите n, k");
        n = scanner.nextInt();
        k = scanner.nextInt();
        ThisArray arr = new ThisArray(n);

        Summator s[] = new Summator[k];
        for (int i = 0; i<k; i++) {
            s[i] = new Summator();
        }

    }


}
