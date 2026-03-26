package February.February_17_2026.AnimalGroup;

public class Animal {

    // Attributes
    private String animal;
    private String gender;
    private String color;
    private int population;
    private boolean extinct;

    // Constructor
    public Animal(String animal, String gender, String color, int population, boolean extinct) {
        this.animal = animal;
        this.gender = gender;
        this.color = color;
        this.population = population;
        this.extinct = extinct;
    }

    // Getters and setters
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isExtinct() {
        return extinct;
    }

    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }

    // Methods
    public void FunFact() {
        System.out.println("Here are some fun facts about these animals!");
    }    

    public void OtherSpecies() {
        System.out.println("There are other species related to these animals!");
    }
}
