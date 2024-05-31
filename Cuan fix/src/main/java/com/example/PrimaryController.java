package com.example;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private Label cuan;

    @FXML
    private Button forgot;

    @FXML
    private Button login;
    
    @FXML
    private Button toregister;

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
    private void switchToSecondary(ActionEvent event) throws IOException {
        Database database = new Database("jdbc:mysql://localhost:3306/db", "root", "");
        if (database.checkLogin(getUsername(), getPassword())) {
            // Create a new stage for the dashboard window
            Stage dashboardStage = new Stage();
        
            // Load the dashboard FXML file
            FXMLLoader loader = new FXMLLoader(App.class.getResource("dashboard.fxml"));
            Parent root = loader.load();
        
            // Set the scene and show the dashboard window
            Scene scene = new Scene(root);
            dashboardStage.setScene(scene);
            dashboardStage.show();
        
            // Close the current login window
            Stage stage = (Stage) login.getScene().getWindow();
            stage.close();
        } else {
            ErrorPopup.showError("Invalid username or password");
        }
    }

    @FXML
    void toreg(ActionEvent event) throws IOException {
        // Create a new stage for the registration window
        Stage registerStage = new Stage();
    
        // Load the Register FXML file
        FXMLLoader loader = new FXMLLoader(App.class.getResource("Register.fxml"));
        Parent root = loader.load();
    
        // Set the scene and show the registration window
        Scene scene = new Scene(root);
        registerStage.setScene(scene);
        registerStage.show();
    
        // Close the current login window
        Stage stage = (Stage) toregister.getScene().getWindow();
        stage.close();
    }

}