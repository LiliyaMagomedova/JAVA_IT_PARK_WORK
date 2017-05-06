package itpark;

/**
 * Created by Student20 on 26.04.2017.
 */
public class VirtualPrinter implements Printer {

    private boolean available;

    public VirtualPrinter(boolean available) {
        this.available = available;
    }


    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return false;
    }

    public void print(String data) {
        System.out.println("Print data to PDF file");
    }
}
