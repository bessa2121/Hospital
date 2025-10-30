package br.com.hospital.repository;

import br.com.hospital.model.Funcionario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {
    public void inserir(Funcionario obj) throws SQLException {
        String sql = "INSERT INTO Funcionario (id_cargo, nome, sexo, telefone, data_nascimento, cpf, rg, endereco, cep, uf, crm, coren) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, obj.getIdCargo()); ps.setString(2, obj.getNome()); ps.setString(3, obj.getSexo()); ps.setString(4, obj.getTelefone()); ps.setDate(5, obj.getDataNascimento()); ps.setString(6, obj.getCpf()); ps.setString(7, obj.getRg()); ps.setString(8, obj.getEndereco()); ps.setString(9, obj.getCep()); ps.setString(10, obj.getUf()); ps.setString(11, obj.getCrm()); ps.setString(12, obj.getCoren());
            ps.executeUpdate();
        }
    }

    public List<Funcionario> listarTodos() throws SQLException {
        List<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT * FROM Funcionario";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                br.com.hospital.model.Funcionario obj = new br.com.hospital.model.Funcionario(); obj.setIdFuncionario(rs.getInt("id_funcionario")); obj.setIdCargo(rs.getInt("id_cargo")); obj.setNome(rs.getString("nome")); obj.setSexo(rs.getString("sexo")); obj.setTelefone(rs.getString("telefone")); obj.setCpf(rs.getString("cpf")); obj.setCrm(rs.getString("crm")); obj.setCoren(rs.getString("coren"));
                lista.add(obj);
            }
        }
        return lista;
    }
}
