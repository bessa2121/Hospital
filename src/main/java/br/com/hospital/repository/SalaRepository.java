package br.com.hospital.repository;

import br.com.hospital.model.Sala;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalaRepository {
    public void inserir(Sala obj) throws SQLException {
        String sql = "INSERT INTO Sala (idSala, idFuncionario) VALUES (?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, obj.getIdSala()); ps.setString(2, obj.IdFuncionario());
            ps.executeUpdate();
        }
    }

    public List<Sala> listarTodos() throws SQLException {
        List<Sala> lista = new ArrayList<>();
        String sql = "SELECT * FROM Sala";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                br.com.hospital.model.Sala obj = new br.com.hospital.model.Sala(); obj.setIdSala(rs.getInt("id_sala")); obj.setIdFuncionario(rs.getString("id_funcionario"));
                lista.add(obj);
            }
        }
        return lista;
    }
}