public class Motorcycle extends Transport implements ParkingObject {
    private String number;

    public Motorcycle(String number) {
        this.number = number;
    }

    public void goToTheParking() {
        System.out.println("Hello! I am cool biker and I am going to park here");
    }

    public void goFromTheParking() {
        System.out.println("Thank you, bro! I am leaving parking place");
    }
}
