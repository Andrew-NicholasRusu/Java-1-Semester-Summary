package AnimalClass;// AnimalClass.Cat class

public class Cat extends Animal implements Adoptable {
    private boolean isIndoor;

    // Constructor takes ame, age, and boolean isIndoor
    public Cat (String name, int age, boolean isIndoor) {
        super (name, age);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    // Methods

    // makeSound() prints "Meow!"
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    // getType() returns "AnimalClass.Cat"
    @Override
    public String getType() {
        return "AnimalClass.Cat";
    }

    // adopt (String ownerName) prints:
    // "[name] has been adopted by [ownerName]!"
    // then if the pet should be indoor, print: "Remember to keep them indoors!"
    @Override
    public void adopt(String ownerName) {
        System.out.println(this.getName() + " has been adopted by " + ownerName);
        if (!this.isIndoor) {
            System.out.println("Remember to keep them indoors!");
        }
    }

    // Override getInfo() to also print the text shown in the sample output.
    @Override
    public void getInfo() {
        System.out.println("Type " + this.getType());
        this.makeSound();
    }
}
