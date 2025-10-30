package br.com.hospital.repository;

import br.com.hospital.model.Receita;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReceitaRepository {
    public void inserir(Receita obj) throws SQLException {
        String sql = "INSERT INTO Receita (id_paciente, id_funcionario, data_emissao, observacoes) VALUES (?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, obj.getIdPaciente()); ps.setInt(2, obj.getIdFuncionario()); ps.setDate(3, obj.getDataEmissao()); ps.setString(4, obj.getObservacoes());
            ps.executeUpdate();
        }
    }

    public List<Receita> listarTodos() throws SQLException {
        List<Receita> lista = new ArrayList<>();
        String sql = "SELECT * FROM Receita";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                br.com.hospital.model.Receita obj = new br.com.hospital.model.Receita(); obj.setIdReceita(rs.getInt("id_receita")); obj.setIdPaciente(rs.getInt("id_paciente")); obj.setIdFuncionario(rs.getInt("id_funcionario")); obj.setDataEmissao(rs.getDate("data_emissao")); obj.setObservacoes(rs.getString("observacoes"));
                lista.add(obj);
            }
        }
        return lista;
    }
}
