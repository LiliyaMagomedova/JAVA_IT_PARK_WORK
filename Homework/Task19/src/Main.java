public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("н543рв");
        Motorcycle motorcycle = new Motorcycle("234");
        Bicycle bike1 = new Bicycle();
        Car stolencar = new Car (null);
        Motorcycle Vladik = new Motorcycle("432");

        ParkingPlace DostoevskyStr = new ParkingPlace();
        DostoevskyStr.parking(car1);
        DostoevskyStr.parking(motorcycle);
        DostoevskyStr.parking(bike1);
        DostoevskyStr.parking(stolencar);
        DostoevskyStr.parking(Vladik);


    }
}

