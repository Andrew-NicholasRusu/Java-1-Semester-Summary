package tutorials.com.registration_form;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class RegistrationController {
    @FXML
    private Label messageLabel;

    @FXML
    private TextField courseInput;

    @FXML
    private TextField idInput;

    @FXML
    protected void handleRegisterClick() {
        String courseCode = courseInput.getText().trim();
        String studentId = idInput.getText().trim();

        if (courseCode.equalsIgnoreCase("COMP248") && studentId.equals("2026")) {
            messageLabel.setText("Registration Sucessful!");
            messageLabel.setTextFill(Color.BLUE);
        } else {
            messageLabel.setText("Invalid Information!");
            messageLabel.setTextFill(Color.ORANGE);
        }
    }
}