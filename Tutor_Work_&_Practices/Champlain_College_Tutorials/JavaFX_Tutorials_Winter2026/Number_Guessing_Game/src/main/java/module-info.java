module tutorials.com.number_guessing_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens tutorials.com.number_guessing_game to javafx.fxml;
    exports tutorials.com.number_guessing_game;
}