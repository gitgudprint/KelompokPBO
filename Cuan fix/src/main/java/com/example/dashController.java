package com.example;

import java.io.IOException;

import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class dashController {
    
    @FXML
    private ImageView CALENDAR;

    @FXML
    private Button HAH;

    @FXML
    private ImageView MONEY;

    @FXML
    private ImageView PROFILE;

    @FXML
    private Label SALDO;

    @FXML
    private Button accountbutton;

    @FXML
    private TreeTableColumn<?, ?> buyingTable;

    @FXML
    private Button depobutton;

    @FXML
    private TreeTableColumn<?, ?> nominalTable;

    @FXML
    private Button planningbutton;

    @FXML
    private TreeTableView<?> transaksiTable;
    @FXML
    void accountmenu(ActionEvent event) {
        try {
            Stage accountStage = new Stage();
            FXMLLoader loader = new FXMLLoader(App.class.getResource("account.fxml"));
            
            Parent root = loader.load();
            Scene scene = new Scene(root);
            accountStage.setScene(scene);
            accountStage.show();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
    }   catch (IOException e) {
            e.printStackTrace();
    }
}
    


    @FXML
    void helpmenu(ActionEvent event) { //TBD

    }

    @FXML
    void spendmenu(ActionEvent event) { //TBD

    }
    
    
    
    @FXML
    private void depomenu() throws IOException {
        App.setRoot("landingPage");
    }

}
