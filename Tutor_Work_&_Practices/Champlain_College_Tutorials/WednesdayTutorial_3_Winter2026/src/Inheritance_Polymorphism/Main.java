package Inheritance_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Generic");
        Animal a2 = new Dog("Rocky");

        // Call sound on both objects
        a1.sound();
        a2.sound();

        /**
         * What concept is demonstrated by a2?
         * Answer:
         */
    }
}
