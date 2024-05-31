package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Label cuan;

    @FXML
    private Button forgot;

    @FXML
    private Button login;

    @FXML
    private PasswordField password;

    @FXML
    private Label quote;

    @FXML
    private TextField username;

    private Database database;

    public PrimaryController() {
        // No-argument constructor
    }

    public void setDatabase(String url, String user, String pass) {
        this.database = new Database(url, user, pass);
    }

    public String getUsername() {
        return username.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        // Initialize the database field
        database = new Database("jdbc:mysql://localhost:3306/db", "root", "");
    
        // Check if the username and password match a record in the database
        if (database.checkLogin(getUsername(), getPassword())) {
            App.setRoot("dashboard");
        } else {
            ErrorPopup.showError(
                "Invalid username or password");
        }
    }
}