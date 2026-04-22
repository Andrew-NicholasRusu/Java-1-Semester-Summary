package com.rocoomusic.april_21_2026;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class POSController {
    @FXML private Label orderStatusLabel;
    @FXML private TextField customerNameField;
    @FXML private Button startOrderButton;
    @FXML private VBox receiptBox;

    @FXML private ComboBox<String> coffeeComboBox;
    @FXML private RadioButton smallRadio;
    @FXML private RadioButton mediumRadio;
    @FXML private RadioButton largeRadio;
    @FXML private Slider sweetnessSlider;
    @FXML private Label sweetnessLabel;
    @FXML private Label livePriceLabel;

    private double currentPrice = 0.0;


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

        coffeeComboBox.getItems().addAll("Espresso ($3.00", "Latte($4.50", "Mocha ($5.00");
        // when a slider's value changes, a change event occurs.
        sweetnessSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            // convert the precise double value to a whole integer percentage.
            int percent = newValue.intValue();
            sweetnessLabel.setText("3. Sweetness: " + percent + "%");
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

    @FXML
    private void updateLivePrice() {
        currentPrice = 0.0;

        String selectedCoffee = coffeeComboBox.getValue();
        if(selectedCoffee != null) {
            if (selectedCoffee.contains("Espresso")) currentPrice += 3.00;
            else if (selectedCoffee.contains("Latte")) currentPrice += 4.50;
            else if (selectedCoffee.contains("Mocha")) currentPrice += 5.00;
        }
        // Add size upcharge based on radio button selected.
        if (mediumRadio.isSelected()) currentPrice += 1.00;
        else if (largeRadio.isSelected()) currentPrice += 2.00;
        // update the label immediately
        livePriceLabel.setText(String.format("Price: $%.2f", currentPrice));
    }
    @FXML
    private void handleAddDrink() {
    // Ensure a drink is actually selected before adding:
        if (coffeeComboBox.getValue() == null) {
            return;
        }
        // Build the receipt string
        String size;
        if (smallRadio.isSelected()) {
            size = "Small";
        } else if (mediumRadio.isSelected()) {
            size = "Medium";
        } else {
            size = "Large";
        }
        int sweet = (int) sweetnessSlider.getValue();
        String selectedCoffee = coffeeComboBox.getValue(); // gets the name with price
        String coffeeName = selectedCoffee.split(" ")[0]; // gets the name
        String fullItemDetails = String.format("%s %s (Sweetness: %d%%) - $%.2f", size, coffeeName, sweet, currentPrice);

        // Add it to the screen
        Label itemLabel = new Label(fullItemDetails);
        itemLabel.setOnMouseClicked(e -> receiptBox.getChildren().remove(itemLabel));
        receiptBox.getChildren().add(itemLabel);

        // Reset the controls for the next drink
        coffeeComboBox.getSelectionModel().clearSelection();
        smallRadio.setSelected(true);
        sweetnessSlider.setValue(50);
        updateLivePrice();
    }
}