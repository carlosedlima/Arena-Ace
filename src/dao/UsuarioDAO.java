
package dao;

import entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.ConnectionFactory;


public class UsuarioDAO {
     private Connection conn;
    
    public UsuarioDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public boolean autenticar(String login, String senha) {
        Usuario usuario = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from usuario where login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
