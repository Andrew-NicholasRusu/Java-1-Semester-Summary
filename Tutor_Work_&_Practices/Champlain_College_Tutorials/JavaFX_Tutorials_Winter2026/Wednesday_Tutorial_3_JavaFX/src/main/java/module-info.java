module com.lab9.wednesday_tutorial_3_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lab9.wednesday_tutorial_3_javafx to javafx.fxml;
    exports com.lab9.wednesday_tutorial_3_javafx;
}