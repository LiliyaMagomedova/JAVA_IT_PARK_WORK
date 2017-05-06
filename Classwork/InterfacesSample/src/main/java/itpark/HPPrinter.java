package itpark;

/**
 * Created by Student20 on 26.04.2017.
 */
public class HPPrinter implements Printer {
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public HPPrinter(boolean available) {
        this.available = available;
    }

    private boolean available;


    public boolean isAvailable() {
        return false;
    }

    public void print(String data) {

    }
}
