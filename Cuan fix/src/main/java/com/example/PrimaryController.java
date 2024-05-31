package com.example;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PrimaryController extends Authenticate {
    public PrimaryController(String url, String user, String pass) {
        super(url, user, pass);
    }

    public PrimaryController() {
        this("jdbc:mysql://localhost:3306/db", "root", "");
    }

    @FXML
    private ImageView Imagelogin;
   
    @FXML
    private Button forgot;

    @FXML
    private Button login;

    @FXML
    private PasswordField PASS;

    @FXML
    private Label quote;

    @FXML
    private Button toregister;

    @FXML
    private TextField USER;

    @Override
    public boolean checkLogin(String username, String password) {
        return executeQuery("SELECT * FROM data WHERE username =? AND password =?", username, password);
    }
    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
        String username = USER.getText();
        String password = PASS.getText();
        if (checkLogin(username, password)){
            Window show = new Window();
            show.closeWindow((Stage) login.getScene().getWindow());
            show.showWindow("dashboard1.fxml", new Stage());
            
        } else {
            ErrorPopup.showError("Invalid username or password");
        }
    }

    @FXML
    void toreg(ActionEvent event) throws IOException {
        Window show = new Window();
        show.closeWindow((Stage) toregister.getScene().getWindow());
        show.showWindow("Register.fxml", new Stage());
    }

}