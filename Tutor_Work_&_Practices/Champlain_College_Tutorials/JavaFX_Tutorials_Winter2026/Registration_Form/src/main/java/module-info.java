module tutorials.com.registration_form {
    requires javafx.controls;
    requires javafx.fxml;


    opens tutorials.com.registration_form to javafx.fxml;
    exports tutorials.com.registration_form;
}