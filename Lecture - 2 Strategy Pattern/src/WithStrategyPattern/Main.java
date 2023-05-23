package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();
        Vehicle vehicle2 = new SportVehicle();
        vehicle2.drive();
    }
}
