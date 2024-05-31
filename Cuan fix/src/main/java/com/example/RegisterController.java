package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegisterController extends Insert {

    public RegisterController(String url, String user, String pass) {
        super(url, user, pass);
    }

    public RegisterController() {
        this("jdbc:mysql://localhost:3306/db", "root", "");
    }

    @FXML
    private TextField Password;

    @FXML
    private Button RegisterButton;

    @FXML
    private TextField Username;

    @Override
    public boolean registerUser(String username, String password) {
        return executeQuery("INSERT INTO data (username, password) VALUES (?,?)", username, password);
    }

    @FXML
    void reg(ActionEvent event) {
        String username = Username.getText();
        String password = Password.getText();
        
        if (registerUser(username, password)) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Registration failed!");
        }
    }



}
