package February.February_12_2026.Homework;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Black", 40);
        Car car2 = new Car("Honda Civic", "Red", 35);
        Car car3 = new Car("Hybrid", "Blue", 30);
        Car car4 = new Car("Mercedes", "White", 50);
        Car car5 = new Car("Tesla", "White", 40);

        System.out.println(car1.getModel() + ", " + car1.getColor() + ", " + car1.getGasLimit());
        System.out.println(car2.getModel() + ", " + car2.getColor() + ", " + car2.getGasLimit());
        System.out.println(car3.getModel() + ", " + car3.getColor() + ", " + car3.getGasLimit());

        // toString in main
        System.out.println(car4);
        System.out.println(car5);

    }
}
