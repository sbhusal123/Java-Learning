package LoggedIn;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoggedIn {
    
    public static String SESSION_username;
    
    public LoggedIn(String username){
        LoggedIn.SESSION_username = username;
    }
    
    public  void OnCreate() throws IOException{
        Parent root =  FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage primaryStage = new Stage();
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("Resources/loginIcon.png"));
        primaryStage.setTitle(SESSION_username);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        Controller.stage = primaryStage;
    }
}
