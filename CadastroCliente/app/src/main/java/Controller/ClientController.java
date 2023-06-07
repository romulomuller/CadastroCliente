
package Controller;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionFactory;

public class ClientController {
    
    public void save (Cliente cliente) {
        
        String sql = "INSERT INTO cliente (nome,  telefone, dataNascimento) VALUES (?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement stmt = null;
    
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getDataNascimento());
            stmt.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa " + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
}
