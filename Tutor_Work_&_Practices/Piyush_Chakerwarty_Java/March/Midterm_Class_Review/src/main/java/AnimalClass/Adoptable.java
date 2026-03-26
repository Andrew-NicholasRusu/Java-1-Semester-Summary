package AnimalClass;

public interface Adoptable {
    // Create an interface called AnimalClass.Adoptable with:

    // An abstract method adopt(String ownerName)
    public abstract void adopt (String ownerName);

    // A default method isReadyForAdoption(String name) that prints:
    // [name] is ready for adoption.
    public default void isReadyForAdoption(String name) {
        System.out.println(name + " is ready for adoption.");

    }
}
