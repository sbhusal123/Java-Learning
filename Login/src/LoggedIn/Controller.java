package LoggedIn;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class Controller {
    
    protected static String Username;
    

    
//    Controller(String Username){
//        Controller.Username = Username;
//    }
    
    
    @FXML
    public Label username;

    @FXML
    public Label email;

    @FXML
    public Label validStatus;

    @FXML
    public void initialize() {
        username.setText("bhusal1");
        email.setText("suryabhusal11@gmail.com");
        validStatus.setText("Invalid Email");
    }

}
