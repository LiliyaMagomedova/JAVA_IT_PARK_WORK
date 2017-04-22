import java.io.FileInputStream;
import  java.io.InputStream;

public class MainInputStream {

    public static String readNextLine(InputStream inputStream) throws Exception{
        byte bytesFromFile[] = new byte[100];
        int byteff = inputStream.read();
        String string = new String(bytesFromFile);
        while (byteff !='\n'){
            string += (char)byteff;
            byteff = inputStream.read();
        }
        return (string);
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("output.txt");

        byte bytesFromFile[] = new byte[100];
   //     inputStream.read(bytesFromFile);

        System.out.println(readNextLine(inputStream));

        for (int i = 0; i < bytesFromFile.length; i++) {
            System.out.print((char)bytesFromFile[i]);
        }
    }
}
