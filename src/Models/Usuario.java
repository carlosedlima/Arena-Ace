
package Models;

public class Usuario {
    //---------> Objeto usuario <----------
    
    private String login;
    private String senha;
    private String email;
    private boolean nivelPermissao;

    
    // ----> CONSTRUTORES <----
    public Usuario(String login, String senha, String email, boolean nivelPermissao) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nivelPermissao = nivelPermissao;
    }

    public Usuario() {
    }

    
    
    
    
    
    
    
    
    // ----> GETTERS E SETTERS <----
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(boolean nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }
    
    
    
    
    
}
