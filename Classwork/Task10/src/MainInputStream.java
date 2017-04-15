import java.io.FileInputStream;
import  java.io.InputStream;

public class MainInputStream {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("output.txt");

        byte bytesFromFile[] = new byte[100];
        inputStream.read(bytesFromFile);

        for (int i = 0; i < bytesFromFile.length; i++) {
            System.out.print((char)bytesFromFile[i]);
        }
    }
}
