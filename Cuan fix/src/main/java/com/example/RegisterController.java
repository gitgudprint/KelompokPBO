package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private TextField Password;

    @FXML
    private Button RegisterButton;

    @FXML
    private TextField Username;

    @FXML
    void reg(ActionEvent event) {
        String username = Username.getText();
        String password = Password.getText();

        Database database = new Database("jdbc:mysql://localhost:3306/db", "root", "");
        if (database.registerUser(username, password)) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Registration failed!");
        }
}

}
