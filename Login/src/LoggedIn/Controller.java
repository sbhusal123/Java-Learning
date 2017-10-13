package LoggedIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class Controller {
    
   @FXML 
   public  Label username;
    
   
   @FXML
   protected void Click(ActionEvent event){
       System.out.println(username.getText());
   } 
    
}
