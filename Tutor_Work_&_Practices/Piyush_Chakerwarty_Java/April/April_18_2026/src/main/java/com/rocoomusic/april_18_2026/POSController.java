package com.rocoomusic.april_18_2026;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class POSController {
    @FXML
    private Label orderStatusLabel;

    @FXML
    private TextField customerNameField;

    @FXML
    private Button startOrderButton;

    @FXML
    private VBox receiptBox;

    @FXML
    public void initialize() {
        startOrderButton.setOnAction(event -> {
            String customerName = customerNameField.getText();

            if (customerName.trim().isEmpty()) {
                orderStatusLabel.setText("Please order a customer name to begin.");
                orderStatusLabel.setStyle("-fx-text-fill: red;");
            } else {
                orderStatusLabel.setText("Current Order: " + customerName);
                orderStatusLabel.setStyle("-fx-text-fill: green; -fx-font-weight: bold;");

                customerNameField.clear();
            }
        });
    }

    @FXML
    private void handleAddEspresso() {
        addReceiptItem("Espresso - $3.00");
    }

    @FXML
    private void handleAddLatte() {
        addReceiptItem("Latte - $4.50");
    }

    private void addReceiptItem(String itemText) {
        // Creating a new node (Label)
        Label itemLabel = new Label(itemText);

        // Add a click event to the label so ti removes itself!
        itemLabel.setOnMouseClicked(event -> {
            // Used for removing item to take it out of the Observable List
            receiptBox.getChildren().remove(itemLabel);
        });

        // Add the node to the VBox ObservableList
        receiptBox.getChildren().add(itemLabel);
    }

    @FXML
    private void handleClearOrder(){
        // it removes all items from ObervableList
        receiptBox.getChildren().clear();
    }
}