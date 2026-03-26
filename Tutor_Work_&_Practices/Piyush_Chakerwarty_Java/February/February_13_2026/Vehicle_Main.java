package February.February_13_2026;

public class Vehicle_Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020, "White", 4);
        Truck truck1 = new Truck("Honda", 2024, "Red", 2, 60);
        
        System.out.println("Brand: " + car1.getBrand()); // Gets only the brand of the car, which is "Toyota"
        System.out.println(car1); // Number of Doors: 4, Brand: Toyota, Year: 2020, Color: White

        // As the car Class already inherited from the vehicle class, which contains
        // the start and stop engine methods which can be used using the Car class object.
        System.out.println();
        car1.startEngine();
        car1.stopEngine();
        car1.honk();

        System.out.println(truck1.getEnginePower());
        System.out.println(truck1); // Truck's Engine Power: 60, Brand: Honda, Year: 2024, Color: Red

        System.out.println();
        // Instantiate a Motorcycle (e.g., a "Harley-Davidson", 2023, "Black") with no sidecar. 
        Motorcycle cycle1 = new Motorcycle("Harley-Davidson", 2023, "Black", false);
        System.out.println(cycle1);

        // Call startEngine(). 
        cycle1.startEngine(); // "The motorcycle engine roars!"

        // Attempt to call the wheelie() method. 
        cycle1.wheelie(); // "The motorcycle pops a wheelie!"
        System.out.println();

        // Change the hasSidecar status to true and try to wheelie() again to see if your logic works. 
        Motorcycle cycle2 = new Motorcycle("Yamaha MT-07", 2025, "Red", true);
        // It has a side car, so it should not pop a wheelie.
        System.out.println(cycle2);
        // Added a new one to differ and make the code more easier to understand. 
        cycle2.startEngine(); // "The motorcycle engine roars!"
        cycle2.stopEngine(); // "The motorcycle engine shuts off with a click."
        cycle2.wheelie(); // Does not print anything.


    }
    
}
