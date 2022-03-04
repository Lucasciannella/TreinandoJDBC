
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Lucas
 */
public class ConnectionFactory {
    
    public String Urldb = "jdbc:sqlserver://LUCAS;instanceName=LUCAS;integratedSecurity=true;";
    
   public Connection getConnection(){
        try {
            return  DriverManager.getConnection(Urldb);
        } catch (SQLException e) {
          throw new RuntimeException(e); 
        }
   }
}
