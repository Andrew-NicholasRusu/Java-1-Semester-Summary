package Exception_Handling.Seasons;

public class SeasonMain  {
    public static void main(String[] args) {
        Season season1 = new Season();
        System.out.println("Using No-argument constructor: " + season1);
        System.out.println();

        for (int i = 0; i <= 5; i++) {
            try {
                Season season = new Season(i);
                System.out.println(season);
            } catch (InvalidSeasonNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
