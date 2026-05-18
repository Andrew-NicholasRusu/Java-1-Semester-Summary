package Exception_Handling.Seasons;

public class InvalidSeasonNumberException extends RuntimeException {
    public InvalidSeasonNumberException(String message) {
        super(message);
    }

    // Creates a custom message
    public InvalidSeasonNumberException(int season) {
        super("ERROR - Invalid number given for a season! There are a total of 4 seasons!");
    }
}
