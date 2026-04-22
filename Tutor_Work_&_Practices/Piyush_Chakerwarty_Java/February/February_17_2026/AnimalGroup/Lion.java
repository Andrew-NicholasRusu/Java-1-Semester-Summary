package February.February_17_2026.AnimalGroup;

public class Lion extends Animal {
    // Attribute
    private String symbol;

    // Constructor
    public Lion(String animal, String gender, String color, int population, boolean extinct, String symbol) {
        super(animal, gender, color, population, extinct);
        this.symbol = symbol;
    }

    // Getter and Setter
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    // toString
    @Override
    public String toString() {
        return "Animal: " + getAnimal() +"\nGender: " + getGender() + "\nColor: " + getColor() +
        "\nPopulation: " + getPopulation() + "\nAre they Extinct? " + isExtinct() + 
        "\nThese creatures are well known for their " + symbol;
    }

    @Override
    public void FunFact() {
        System.out.println("Lions are known for resting up to 20 hours a day.");
    }

    @Override
    public void OtherSpecies() {
        System.out.println("Other lion species include the Asiatic lion, the Cape lion, and the extinct Barbary lion");
    }
}
