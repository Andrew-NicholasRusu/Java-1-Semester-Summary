package February.February_17_2026.AnimalGroup;

public class WoollyMammoth extends Animal {
    // Attribute
    private int size;

    public WoollyMammoth (String animal, String gender, String color, int population, boolean extinct, int size) {
        super(animal, gender, color, population, extinct);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // toString
    @Override
    public String toString() {
        return "Animal: " + getAnimal() +"\nGender: " + getGender() + "\nColor: " + getColor() +
        "\nPopulation: " + getPopulation() + "\nAre they Extinct? " + isExtinct() + 
        "\nThese creates were at least " + size + "ft tall, weighing 4 to 8 tons";
    }

    // Funfact Overriding
    @Override
    public void FunFact() {
        System.out.println("Woolly Mammoths had small ears and a short tail to minimize frostbites and heat loss.");
    }

    // Overiding Other Species
    @Override
    public void OtherSpecies() {
        System.out.println("Other woolly mammoth species include the M.rumanus and the M. meridionalis.");
    }
}