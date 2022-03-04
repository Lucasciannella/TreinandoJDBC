
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Login;

/**
 *
 * @author Lucas
 */
public class LoginDao extends Login {
    public List<Login> listar(){
        List<Login> logins = new ArrayList<Login>();
            
        try {
            
            Connection con = new ConnectionFactory().getConnection();
            
            PreparedStatement smt = con.prepareStatement("SELECT * FROM usuarios");
            
            ResultSet rs = smt.executeQuery();
            
            while(rs.next()){
                Login p = new Login();
                p.setId(rs.getInt("usuario_id"));
                p.setSenha(rs.getString("senha"));
                p.setUsuarios(rs.getString("usuario"));
                
                logins.add(p);
            }
            rs.close();
            smt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return logins;
    }
    
    
    
}
