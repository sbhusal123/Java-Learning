
package calculator;

import javafx.fxml.FXML;

public class Model {
    
    @FXML
    public long calculate(long num1, long num2, String Operator){
        
        switch(Operator){
            
            case "+":
                return num1+num2;
                
            case "-":
                return num1-num2;
                
            default:
                return 0;
        }
    }
}
