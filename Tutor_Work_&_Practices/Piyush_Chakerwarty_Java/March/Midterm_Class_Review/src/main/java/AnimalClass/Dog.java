package AnimalClass;// AnimalClass.Dog Class

public class Dog extends Animal implements Adoptable {

    // Constructor takes name and age
    public Dog (String name, int age) {
        super (name, age);
    }

    // Methods

    // makeSound() prints "Woof!"
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    // getType() returns "AnimalClass.Dog"
    @Override
    public String getType() {
        return "AnimalClass.Dog";
    }

    // adopt (String ownerName) prints:
    // "[name] has been adopted by [ownerName]!" then, "Enjoy your new furry friend!"
    @Override
    public void adopt(String ownerName) {
        System.out.println(this.getName() + " has been adopted by " + ownerName);
        System.out.println("Enjoy your new furry friend!");
    }

    @Override
    public void getInfo() {
        System.out.println("Type " + this.getType());
        this.makeSound();
    }
} // closes the clam
