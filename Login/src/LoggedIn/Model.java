package LoggedIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;

public class Model {
    
   private Connection conn = null;
   
   
   protected infoObject getUserInfo(){
       
       infoObject obj = new infoObject();
       
       try{
           
           conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           
          String query = "select * from access";
          
          Statement st = conn.createStatement();
          
          
          
          
          ResultSet rs = st.executeQuery(query);
          
          while(rs.next()){
              
              if(rs.getString("username").equals(LoggedIn.SESSION_username)){
                  obj.email = rs.getString("email");
                  obj.accountStatus = rs.getString("accstat");
                  
                  return obj;
              }
          }
           
       }catch(SQLException ex){
           System.out.println(ex);
       }finally{
           try {   
               conn.close();
           } catch (SQLException ex) {
               Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       return null;
   }
   
   protected class  infoObject
   {
       String email;
       String accountStatus;
   }
    
    
   protected void LogoutUser(Stage which){
       which.close();
       LoggedIn.SESSION_username = "";
       
   }
    
}
