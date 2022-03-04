
package model;

/**
 *
 * @author Lucas
 */
public class Login {
    private int id;
    private String usuarios;
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return '['+ "id=" + id + ", usuarios=" + usuarios + ", senha=" + senha + ']';
    }
    
    
    
}
