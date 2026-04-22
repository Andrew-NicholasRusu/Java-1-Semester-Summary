package JavaFX_Example;

import javafx.fxml.FXML;
import java.security.SecureRandom;

public class PasswordController {
    private TextField passwordOutput;
    private static final String ALPHANUMERIC_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private final SecureRandom random = new SecureRandom();

    @FXML
    protected void generatedPassword() {
        int passwordLength = 16;
        StringBuilder newPassword = new StringBuilder(passwordLength);

        for(int i=0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(ALPHANUMERIC_CHARS.length());
            char randomChar = ALPHANUMERIC_CHARS.charAt(randomIndex);
            newPassword.append(randomChar);
        }
        passwordOutput.setText(newPassword.toString());
    }
    @FMXL
    protected void resetOutput() {
        passwordOutput
    }
}
