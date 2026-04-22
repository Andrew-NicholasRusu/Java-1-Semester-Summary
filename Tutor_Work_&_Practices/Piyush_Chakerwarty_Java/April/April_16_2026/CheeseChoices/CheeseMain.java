package CheeseChoices;

public class CheeseMain {
    public static void main(String[] args) {
        System.out.println("Welcome to our pizza restaurant! " +
                "Which cheese would you like on your pizza?");

        // Loop and set the cheese choices from the CheeseChoices class
        for (int i = 0; i <= 12; i++) {
            // use a try-catch block to catch the InvalidCheeseChoiceException
            try {
                CheeseChoices cheeseChoices = new CheeseChoices(i);
                System.out.println(cheeseChoices);
            } catch (InvalidCheeseChoiceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
