package Register;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Register {
    
    
        public void OnCreate() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Stage primaryStage = new Stage();
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("Resources/loginIcon.png"));
        primaryStage.setTitle("Register New User");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
}
