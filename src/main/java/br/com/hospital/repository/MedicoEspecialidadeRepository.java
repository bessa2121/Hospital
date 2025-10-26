 package br.com.hospital.repository;

import br.com.hospital.model.Medico_Especialidade;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoEspecialidadeRepository {

    // Inserir novo médico
    public void inserir(Medico_Especialidade obj) throws SQLException {
        String sql = "INSERT INTO Medico_Especialidade (nome, crm, especialidade, turno) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getCrm());
            ps.setString(3, obj.getEspecialidade());
            ps.setString(4, obj.getTurno());

            ps.executeUpdate();
        }
    }

    // Listar todos os médicos
    public List<Medico_Especialidade> listarTodos() throws SQLException {
        List<Medico_Especialidade> lista = new ArrayList<>();
        String sql = "SELECT * FROM Medico_Especialidade";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Medico_Especialidade obj = new Medico_Especialidade();
                obj.setIdMedico(rs.getInt("id_medico"));
                obj.setNome(rs.getString("nome"));
                obj.setCrm(rs.getString("crm"));
                obj.setEspecialidade(rs.getString("especialidade"));
                obj.setTurno(rs.getString("turno"));
                lista.add(obj);
            }
        }
        return lista;
    }
}
