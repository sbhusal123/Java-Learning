package LoggedIn;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoggedIn {
    
    private static String username;
    
    public LoggedIn(String username){
        LoggedIn.username = username;
    }
    
    public  void OnCreate() throws IOException{
        
        Parent root =  FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage primaryStage = new Stage();
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("Resources/loginIcon.png"));
        primaryStage.setTitle(username);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    
}
