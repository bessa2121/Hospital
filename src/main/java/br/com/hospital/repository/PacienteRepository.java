package br.com.hospital.repository;

import br.com.hospital.model.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {
    public void inserir(Paciente obj) throws SQLException {
        String sql = "INSERT INTO Paciente (nome, sexo, telefone, data_nascimento, cpf, rg, endereco, cep, uf) VALUES (?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, obj.getNome()); ps.setString(2, obj.getSexo()); ps.setString(3, obj.getTelefone()); ps.setDate(4, obj.getDataNascimento()); ps.setString(5, obj.getCpf()); ps.setString(6, obj.getRg()); ps.setString(7, obj.getEndereco()); ps.setString(8, obj.getCep()); ps.setString(9, obj.getUf());
            ps.executeUpdate();
        }
    }

    public List<Paciente> listarTodos() throws SQLException {
        List<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Paciente";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                br.com.hospital.model.Paciente obj = new br.com.hospital.model.Paciente(); obj.setIdPaciente(rs.getInt("id_paciente")); obj.setNome(rs.getString("nome")); obj.setSexo(rs.getString("sexo")); obj.setTelefone(rs.getString("telefone")); obj.setDataNascimento(rs.getDate("data_nascimento")); obj.setCpf(rs.getString("cpf")); obj.setRg(rs.getString("rg")); obj.setEndereco(rs.getString("endereco")); obj.setCep(rs.getString("cep")); obj.setUf(rs.getString("uf"));
                lista.add(obj);
            }
        }
        return lista;
    }
}
