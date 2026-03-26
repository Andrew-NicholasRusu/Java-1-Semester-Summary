package AnimalClass;

// Write a class AnimalClass.AnimalDemo with a main method that:
public class AnimalDemo {
    public static void main(String[] args) {
        // Creates a AnimalClass.Dog named "Buddy", age 3
        Dog dog = new Dog("Buddy", 3);
        // Creates a AnimalClass.Cat named "Whiskers", age 5, and it should be kept indoor
        Cat cat = new Cat("Whiskers", 5, true);

        // Declare an array called animals and store the AnimalClass.Dog and AnimalClass.Cat objects in it.
        Animal[] animals = new Animal[2];
        animals[0] = dog; animals[1] = cat;

        // Creates a String[] array of adopter names "Alex" and "Alice"
        String[] owners = {"Alex", "Alice"};
        // Loops through the array and for each animal, print the sample output:
        // use getInfo(), makeSound() isReadyForAdoption(), and adopt() methods
        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            a.getInfo();
            a.isReadyForAdoption(a.getName());
            a.adopt(owners[i]);
            a.makeSound();
        }
    }
}
