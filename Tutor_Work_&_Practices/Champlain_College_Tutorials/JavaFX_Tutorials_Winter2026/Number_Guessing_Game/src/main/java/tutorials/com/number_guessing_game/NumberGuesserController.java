package tutorials.com.number_guessing_game;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NumberGuesserController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}