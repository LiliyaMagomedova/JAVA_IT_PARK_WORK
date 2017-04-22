import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainOutputStream {
    public static void main(String[] args) throws Exception  {
        OutputStream outputStream = new FileOutputStream("output.txt");
        Rectangle rec1 = new Rectangle("Rectangle1", 2,4);
        Triangle tri1 = new Triangle("Triangle1",3,5,6);
        byte figuresList1[] = (rec1.toString() + "\n").getBytes();
        outputStream.write(figuresList1);
        byte figuresList2[] = (tri1.toString() + "\n").getBytes();
        outputStream.write(figuresList2);
    }
}
