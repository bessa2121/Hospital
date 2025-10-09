package br.com.hospital.repository;

import br.com.hospital.model.Funcionario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {
    public void inserir(Funcionario obj) throws SQLException {
        String sql = "INSERT INTO Funcionario 
        (IdFuncionario, IdCargo, Nome, Sexo, Telefone, DataNascimento, Cpf, Rg, Endereco, Cep, Uf, Crm, Coren) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, obj.getNome()); ps.setString(2, obj.getSexo()); ps.setString(3, obj.getTelefone()); ps.setDate(4, obj.getDataNascimento()); ps.setString(5, obj.getCpf()); ps.setString(6, obj.getRg()); ps.setString(7, obj.getEndereco()); ps.setString(8, obj.getCep()); ps.setString(9, obj.getUf()); ps.setString(9, obj.getCrm()); ps.setString(10, obj.getCoren())
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
                br.com.hospital.model.Funcionario obj = new br.com.hospital.model.Funcionario(); obj.setIdFuncionario(rs.getInt("IdFuncionario")); obj.setIdCargo(rs.getInt("IdCargo")); obj.setNome(rs.getString("Nome")); obj.setSexo(rs.getString("Sexo")); obj.setTelefone(rs.getString("Telefone")); obj.setDataNascimento(rs.getDate("DataNascimento")); obj.setCpf(rs.getString("Cpf")); obj.setRg(rs.getString("Rg")); obj.setEndereco(rs.getString("Endereco")); obj.setCep(rs.getString("Cep")); obj.setUf(rs.getString("Uf")); obj.setCrm(rs.getString("Crm")); obj.setCoren(rs.getString("Coren"));
                lista.add(obj);
            }
        }
        return lista;
  }
}