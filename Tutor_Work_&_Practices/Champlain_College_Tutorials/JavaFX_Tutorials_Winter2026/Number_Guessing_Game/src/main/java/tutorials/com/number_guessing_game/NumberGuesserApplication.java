package tutorials.com.number_guessing_game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;

public class NumberGuesserApplication extends Application {

    int numberOfTries;
    int magicNumber;
    Random random = new Random();

    @Override
    public void start(Stage stage) throws IOException {
       var promptLabel = new Label("Guess a number between 1 and 10!");
       var inputField = new TextField();
       var guessButton = new Button("Guess!");
       var feedbackLabel = new Label();

       var layout = new VBox(10, promptLabel, inputField, guessButton, feedbackLabel);

       var scene = new Scene(layout, 300, 400);
       stage.setTitle("Number Guessing Game!");
       stage.setScene(scene);
       stage.show();

       // Initialize magic number
       magicNumber = random.nextInt(10) + 1;
       System.out.println("Magic number: " + magicNumber); // For debugging

       // Lambda expression
       guessButton.setOnAction(e -> {
           try {
               String input = inputField.getText();
               if (input.isEmpty()) {
                   feedbackLabel.setText("Please enter a number!");
                   return;
               }
               int guess = Integer.parseInt(input);
               numberOfTries++;

               if (guess < magicNumber) {
                   feedbackLabel.setText("Guess Higher! (Try #" + numberOfTries + ")");
                   guessButton.setText("Guess Again!");
               } else if (guess > magicNumber) {
                   feedbackLabel.setText("Guess Lower! (Try #" + numberOfTries + ")");
                   guessButton.setText("Guess Again!");
               } else {
                   feedbackLabel.setText("You guess it right in " + numberOfTries + " tries!");
                   guessButton.setText("Play Again?");
                   // Generate new number for next game
                   magicNumber = random.nextInt(10) + 1;
                   numberOfTries = 0;
                   System.out.println("New magic number: " + magicNumber); // Debug
               }
               inputField.clear();
           } catch (NumberFormatException ex) {
               feedbackLabel.setText("Please enter a valid number!");
           }
       });
    }

    public static void main(String[] args) {
        launch(args);
    }
}