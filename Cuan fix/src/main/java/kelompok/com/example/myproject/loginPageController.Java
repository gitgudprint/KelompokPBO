package kelompok.com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class loginPageController {
    @FXML
    private Label cuanLabel;

    @FXML
    private Label quoteLabel;

    @FXML
    private Button logButton;

    @FXML
    private Button forgotButton;

    @FXML
    protected void loginIdButtonOnAction(ActionEvent event) {
        cuanLabel.setText("berhasil");
    }
}