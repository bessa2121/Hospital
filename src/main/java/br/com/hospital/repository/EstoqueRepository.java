package br.com.hospital.repository;

import br.com.hospital.model.Estoque;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstoqueRepository {
    public void inserir(Estoque obj) throws SQLException {
        String sql = "INSERT INTO Estoque (DataEntrada, DataValidade, IdEstoque, Quantidade) VALUES (?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setDate(1, obj.getDataEntrada()); ps.setDate(2, obj.getDataValidade()); ps.setInt(3, obj.getIdEstoqueRemedio()); ps.setInt(4, obj.getQuantidade()); 
        }
    }

    public List<Estoque> listarTodos() throws SQLException {
        List<Estoque> lista = new ArrayList<>();
        String sql = "SELECT * FROM Estoque";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                br.com.hospital.model.Estoque obj = new br.com.hospital.model.Estoque(); obj.setIdEstoque(rs.getInt("id_Estoque")); obj.setQuantidade(rs.getInt("Quantidade")); obj.setDataValidade(rs.getDate("DataValidade")); obj.setDataEntrada(rs.getDate("DataEntrada")); 
                lista.add(obj);
            }
        }
        return lista;
    }
}