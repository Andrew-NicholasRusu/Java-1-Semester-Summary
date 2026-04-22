package com.rocoomusic.april_17_2026;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


public class GreetingController {
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
