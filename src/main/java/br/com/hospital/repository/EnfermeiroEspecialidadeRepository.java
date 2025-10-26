 package br.com.hospital.repository;

import br.com.hospital.model.Enfermeiro_Especialidade;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnfermeiroEspecialidadeRepository {

    // Inserir novo enfermeiro
    public void inserir(Enfermeiro_Especialidade obj) throws SQLException {
        String sql = "INSERT INTO Enfermeiro_Especialidade (nome, coren, especialidade, turno) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getCoren());
            ps.setString(3, obj.getEspecialidade());
            ps.setString(4, obj.getTurno());

            ps.executeUpdate();
        }
    }

    // Listar todos os enfermeiros
    public List<Enfermeiro_Especialidade> listarTodos() throws SQLException {
        List<Enfermeiro_Especialidade> lista = new ArrayList<>();
        String sql = "SELECT * FROM Enfermeiro_Especialidade";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Enfermeiro_Especialidade obj = new Enfermeiro_Especialidade();
                obj.setIdEnfermeiro(rs.getInt("id_enfermeiro"));
                obj.setNome(rs.getString("nome"));
                obj.setCoren(rs.getString("coren"));
                obj.setEspecialidade(rs.getString("especialidade"));
                obj.setTurno(rs.getString("turno"));
                lista.add(obj);
            }
        }
        return lista;
    }
}
