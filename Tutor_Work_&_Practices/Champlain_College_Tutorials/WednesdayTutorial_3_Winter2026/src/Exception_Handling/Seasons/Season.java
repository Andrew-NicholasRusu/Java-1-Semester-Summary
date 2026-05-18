package Exception_Handling.Seasons;

public class Season {
    private int season; // field

    private static final String[] SEASON_NAMES = {
            "Summer", "Spring", "Fall", "Winter"
    };

    // No-arg constructor
    public Season() {
        this.season = 1; // First season
    }

    // Constructor
    public Season(int season) {
        if (season < 1 || season > 4) {
            throw new InvalidSeasonNumberException(season); // uses a custom exception
        }
        this.season = season;
    }

    // Getter and Setter
    public int getSeason() {
        return season;
    }

    // Custom getter
    public String getSeasonName() {
        return SEASON_NAMES[season - 1];
    }

    public void setSeason(int season) {
        this.season = season;
    }

    //toString
    @Override
    public String toString() {
        return "Season " + this.getSeason() + " is " + this.getSeasonName();
    }
}
