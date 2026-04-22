package com.rocoomusic.april_17_2026;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label outputLabel;

    @FXML
    private TextField nameField;

    @FXML
    protected void handleGreetButton(ActionEvent event) {
        String name = nameField.getText();
        outputLabel.setText("Hello " + name + "!");
    }
}