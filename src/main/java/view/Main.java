
package view;

import dao.LoginDao;
import model.Login;

/**
 *
 * @author Lucas
 */
public class Main {
    
    public static void main(String[] args){
        LoginDao dao = new LoginDao();
        
        for(Login l : dao.listar()){
            System.out.println(l.toString());
        }
        
    }
    
}
