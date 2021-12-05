package com.example.loginapplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    /**
     * This creates the basic application format with scene, scene size and title
     * @author Daniel
     * @param stage creates basic container in the javafx application
     * @throws IOException if it fails to load
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Sign-Up Page");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * This is just a function to run the application by calling all files
     * @author Daniel
     * @param args these are the files required to run the application
     */
    public static void main(String[] args) {
        launch();
    }
}