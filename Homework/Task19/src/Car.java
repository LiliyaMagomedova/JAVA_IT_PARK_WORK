public class Car extends Transport implements ParkingObject {

    private String number;

    public Car(String number) {
        this.number = number;
    }

    public void goToTheParking() {
        System.out.println("Hello! I am going to park here");
    }

    public void goFromTheParking() {
        System.out.println("Thank you! I am leaving parking place");
    }
}
