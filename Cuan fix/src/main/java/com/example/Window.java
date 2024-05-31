package com.example;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Window {
    public void showWindow(String fxmlResource, Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource(fxmlResource));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeWindow(Stage stage) {
        stage.close();
    }
}