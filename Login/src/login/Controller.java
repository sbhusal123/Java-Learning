package login;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    private String usrname;
    private String passwd;

    @FXML
    private Label status;

    @FXML
    private Label msg;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    public void login(ActionEvent event) throws IOException {

        usrname = username.getText();

        passwd = password.getText();
        if (usrname.isEmpty() || passwd.isEmpty()) {
            msg.setText("Invalid username and password.");
        } else if (usrname.equals("bhusal1") && passwd.equals("bhusal1")) {
         
            
        // ClosePreviousWindow
        Login closePrevWindow = new Login();
        closePrevWindow.Close();
        
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("bhusal1");
        primaryStage.setScene(scene);
        primaryStage.show();
        status.setText("Logged In.");
        }else{
            status.setText("Failed.");
        }

    }
}
