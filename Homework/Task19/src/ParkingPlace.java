public class ParkingPlace {
    private Transport alltheparkingplaces[];
    private int count=0;

    public ParkingPlace() {
    }

    public void parking(Transport transport) {
        if (transport instanceof ParkingObject) {
            while (alltheparkingplaces[count]!=null){
                count++;
            }
            alltheparkingplaces[count] = transport;
            count++;
            transport.goToTheParking();
        }
    }

    public void unparking(String number) {
        int i = 0;
        while (alltheparkingplaces[i].getNumber()!= number) {
            i++;
        }
        alltheparkingplaces[i].goFromTheParking();
        alltheparkingplaces[i] = null;
    }
}
