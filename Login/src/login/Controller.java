package login;
import LoggedIn.LoggedIn;
import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Register.Register;

public class Controller {

    private boolean loginStatus = false;
    
    private String usrname;
    private String passwd;
    
    @FXML
    private Button register;

    @FXML
    private Label msg;

    @FXML
    private TextField username;

    @FXML
    private TextField password;
    

    @FXML
    private void login(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {

        usrname = username.getText();
        passwd = password.getText();
        
        Model md = new Model();
        
        loginStatus = md.checkLogin(usrname, passwd);
        
        if (loginStatus) {
         
            
        // ClosePreviousWindow
        Login closePrevWindow = new Login();
        closePrevWindow.Close();
        
        LoggedIn login = new LoggedIn(usrname);
        
        login.OnCreate();
        
        }else{
            
             msg.setText("Invalid username and password.");
        }

    }
    
    @FXML
    private void Register() throws IOException{
        
        Register Register = new Register();
        
        Register.OnCreate();
        
    } 
       
}
