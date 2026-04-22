public class Bike extends Vehicle implements VehicleInfo {

    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel Type: Petrol");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Bike.");
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine with self-start.");
    }
}
