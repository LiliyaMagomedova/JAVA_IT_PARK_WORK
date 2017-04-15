import java.util.Scanner;
import java.io.InputStream;
public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int result;
       // int n;
       // n = scanner.nextInt();
        char a[] = {'2','3','5'};
        Chartoint chtoint = new Chartoint(a);
        result = chtoint.transform();
        System.out.println(result);
    }

}
