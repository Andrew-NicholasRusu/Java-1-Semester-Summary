public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180);
        Bike bike = new Bike("Yamaha", 120);

        System.out.println("----- Car Info -----");
        car.displayInfo();
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Speed: " + car.getSpeed() + " km/h");
        car.startEngine();
        car.fuelType();

        System.out.println(); // Space
        System.out.println("----- Bike Info -----");
        bike.displayInfo();
        System.out.println("Brand: " + bike.getBrand());
        System.out.println("Speed: " + bike.getSpeed() + " km/h");
        bike.startEngine();
        bike.fuelType();
    }
}
