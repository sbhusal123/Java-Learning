package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
    
    private static final Connection conn = null;
    
  
    
    
    public boolean checkLogin(String username, String password) throws ClassNotFoundException{
        
        try{
             
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
             
            String query = "select * from access";
            
            Statement st = conn.createStatement();
            
            st.executeQuery(query);
            
            ResultSet rs = st.executeQuery(query);
            
            
            while(rs.next()){
                
                
               String DBusername =  rs.getString("username");
               String DBpassword =  rs.getString("password");
               
               if(DBusername.equals(username) && DBpassword.equals(password)){
                   System.out.println("Hello");
                   return true;
               }
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return false;
        
    }
    
    
}
