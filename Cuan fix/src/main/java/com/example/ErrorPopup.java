package com.example;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ErrorPopup {

    public static void showError(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}