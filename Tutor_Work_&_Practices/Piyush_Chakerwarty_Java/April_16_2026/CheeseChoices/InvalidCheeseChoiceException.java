package CheeseChoices;

public class InvalidCheeseChoiceException extends RuntimeException {
    // No-arg constructor
    public InvalidCheeseChoiceException() {
        super();
    }

    // Constructor with a message
    public InvalidCheeseChoiceException(String name) {
        super("Invalid Cheese Choice: " + name + "please choose from the following selection");
    }
}
