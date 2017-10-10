package login;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
    
   static Stage stage;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
     
        
          
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        stage = primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public void Close(){
        stage.close();
    }
    
}
