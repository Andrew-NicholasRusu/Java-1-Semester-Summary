package February.February_17_2026.AnimalGroup;

public class Panda extends Animal {
    private String favoriteFood;

    public Panda (String animal, String gender, String color, int population, boolean extinct, String favoriteFood) {
        super (animal, gender, color, population, extinct);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }



    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    // toString
    @Override
    public String toString() {
        return "Animal: " + getAnimal() +"\nGender: " + getGender() + "\nColor: " + getColor() +
        "\nPopulation: " + getPopulation() + "\nAre they Extinct? " + isExtinct() + 
        "\nThese creatures consume up to 12-38kg of " + favoriteFood + "every day.";

    }
    @Override
    public void FunFact() {
        System.out.println("Pandas have excellent camouflage for their habitat.");
    }

    @Override
    public void OtherSpecies() {
        System.out.println("Other panda species include the red panda and the rare Qinling panda");
    }
}
