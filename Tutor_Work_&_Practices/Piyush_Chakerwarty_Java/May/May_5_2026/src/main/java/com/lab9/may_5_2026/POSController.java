package com.lab9.may_5_2026;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class POSController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}