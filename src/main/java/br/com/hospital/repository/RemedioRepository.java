package br.com.hospital.repository;
import br.com.hospital.model.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RemedioRepository {
    public void inserir(Remedio obj) throws SQLException{
        String sql = "INSERT INTO Remedio (id_remedio,nome,descricao) VALUES (?,?,?)";
        try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
            ps.setInt(1,obj.getIdRemedio());ps.setString(2,obj.getNome());ps.setString(3,obj.getDescricao());
            ps.executeUpdate();
        }
    }
    public list<Remedio> listarTodos() throws SQLException{
        List<Remedio> lista = new ArrayList<>();
        String sql = "SELECT * FROM Remedio";
        try(Connection conn = DatabaseConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql)){
            while(rs.next()){
                br.com.hospital.model.Remedio obj = new br.com.hospital.model.Remedio();obj.setIdRemedio(rs.getInt("id_remedio"));obj.setNome(rs.getString("nome"));obj.setDescricao(rs.getString("descricao"));
                lista.add(obj);
            }
        }
        return lista;
    }
}
