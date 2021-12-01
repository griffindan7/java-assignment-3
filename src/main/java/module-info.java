module com.example.loginapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginapplication to javafx.fxml;
    exports com.example.loginapplication;
}