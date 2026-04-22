public class Car extends Vehicle implements VehicleInfo {

    public Car (String brand, int speed) {
        super (brand, speed);
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel Type: Petrol/Diesel");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Car.");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}
