package kelompok.com.example.myproject;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private Button KembaliButton;

    @FXML
    private PasswordField PasswordFieldRegister;

    @FXML
    private Button RegisterButton;

    @FXML
    private TextField TextFieldRegister;

    @FXML
    protected void KembaliButtonPressed(ActionEvent event) {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        Stage primaryStage = new Stage();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
