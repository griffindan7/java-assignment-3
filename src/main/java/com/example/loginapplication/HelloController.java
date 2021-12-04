package com.example.loginapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label passwordText;

    @FXML
    private PasswordField passwordBox;

    @FXML
    protected void signupButtonClick() {
//      Checked if password is less than or equal to 7 characters
        if (passwordBox.getText().length() <= 7) {
            passwordText.setTextFill(Color.RED);
            passwordText.setText("Password must be at least 7 characters long");
        }
//      If we pass all if statements, email and password are correct
        else {
            passwordText.setTextFill(Color.GREEN);
            passwordText.setText("Successfully signed up");
        }
    }
}