package CheeseChoices;

public class CheeseChoices {
    private int cheeseChoice;

    private static final String[] cheeseChoices = {"Cheddar", "Mozzarella", "Parmesan", "Gouda", "Swiss",
            "Provolone", "Camembert", "Ricotta", "Feta", "Brie", "Fromage", "Emmental", "Manchego"};

    // No-arg constructor
    public CheeseChoices() {
        this.cheeseChoice = 1;
    }

    // Argument constructor
    public CheeseChoices(int cheeseChoice) {
        this.cheeseChoice = cheeseChoice;
    }

    // Getters and Setters
    public int getCheeseChoice() {
        return cheeseChoice;
    }

    public void setCheeseChoice(int cheeseChoice) {
        this.cheeseChoice = cheeseChoice;
    }

    @Override
    public String toString() {
        return cheeseChoices[cheeseChoice];
    }
}
