package LoggedIn;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import login.Login;

public class Controller {

    protected static String Username;

    protected static Stage stage = null;

    @FXML
    protected Label btnLogout;

    @FXML
    protected Label username;

    @FXML
    protected Label email;

    @FXML
    protected Label validStatus;

    @FXML
    public void initialize() {

        Model md = new Model();
        Model.infoObject user = md.getUserInfo();

        username.setText(LoggedIn.SESSION_username);
        email.setText(user.email);
        if (user.accountStatus.equals("0")) {
            validStatus.setText("Invalid Email");
            JOptionPane.showMessageDialog(null, "Please Validated Your Email.");
        } else {
            validStatus.setText("Validated");
        }
    }

    @FXML
    protected void buttonAction(ActionEvent event) {
        try {

            Model md = new Model();
            String buttonText;
            buttonText = ((Button) event.getSource()).getText();

            switch (buttonText) {

                case "Logout":
                    md.LogoutUser(stage);
                    Login lg = new Login();
                    lg.start(stage);
                break;
                
                case "Settings":
                    System.out.println("Settings clicked");
                break;
                default:
                    System.out.println("Error");
            }
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
