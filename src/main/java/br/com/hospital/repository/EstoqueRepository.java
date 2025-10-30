package br.com.hospital.repository;

import br.com.hospital.model.Estoque;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstoqueRepository {
    public void inserir(Estoque obj) throws SQLException {
        String sql = "INSERT INTO Estoque (id_remedio, quantidade, data_entrada, data_validade) VALUES (?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, obj.getIdRemedio()); ps.setInt(2, obj.getQuantidade()); ps.setDate(3, obj.getDataEntrada()); ps.setDate(4, obj.getDataValidade());
            ps.executeUpdate();
        }
    }

    public List<Estoque> listarTodos() throws SQLException {
        List<Estoque> lista = new ArrayList<>();
        String sql = "SELECT * FROM Estoque";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                br.com.hospital.model.Estoque obj = new br.com.hospital.model.Estoque(); obj.setIdEstoque(rs.getInt("id_estoque")); obj.setIdRemedio(rs.getInt("id_remedio")); obj.setQuantidade(rs.getInt("quantidade")); obj.setDataEntrada(rs.getDate("data_entrada")); obj.setDataValidade(rs.getDate("data_validade"));
                lista.add(obj);
            }
        }
        return lista;
    }
}
