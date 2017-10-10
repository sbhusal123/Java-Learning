package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
   
    public String sign="";
    public Long num1 = null;
    public Long num2 = null;
    
    Model model = new Model();
    
    @FXML
    private TextField number1;
    
    @FXML
    private TextField number2;
    
    @FXML
    private Label result;
    
    @FXML
    public void Operator(ActionEvent event){
        
         sign = ((Button)event.getSource()).getText();
        
    }
    
    @FXML
    public void Equals(ActionEvent event){ 
        
        try{
        num1 = Long.parseLong(number1.getText());
        num2 = Long.parseLong(number2.getText());
        
        } catch(NumberFormatException ex){
            
            result.setText("Error occured");
        }
        
         System.out.println(sign);
        
        long output = model.calculate(num1, num2,sign);
        
        result.setText(String.valueOf(output));
        
        
    }
    
}
