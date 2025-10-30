package br.com.hospital.repository;

import br.com.hospital.model.Consulta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultaRepository {
    public void inserir(Consulta obj) throws SQLException {
        String sql = "INSERT INTO Consulta (id_paciente, id_funcionario, id_sala, id_receita, diagnostico, data_hora, temperatura, pressao, frequencia_cardiaca) VALUES (?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, obj.getIdPaciente()); ps.setInt(2, obj.getIdFuncionario()); if(obj.getIdSala()!=null) ps.setInt(3, obj.getIdSala()); else ps.setNull(3, java.sql.Types.INTEGER); if(obj.getIdReceita()!=null) ps.setInt(4, obj.getIdReceita()); else ps.setNull(4, java.sql.Types.INTEGER); ps.setString(5, obj.getDiagnostico()); ps.setTimestamp(6, obj.getDataHora()); if(obj.getTemperatura()!=null) ps.setDouble(7, obj.getTemperatura()); else ps.setNull(7, java.sql.Types.DOUBLE); ps.setString(8, obj.getPressao()); if(obj.getFrequenciaCardiaca()!=null) ps.setInt(9, obj.getFrequenciaCardiaca()); else ps.setNull(9, java.sql.Types.INTEGER);
            ps.executeUpdate();
        }
    }

    public List<Consulta> listarTodos() throws SQLException {
        List<Consulta> lista = new ArrayList<>();
        String sql = "SELECT * FROM Consulta";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                br.com.hospital.model.Consulta obj = new br.com.hospital.model.Consulta(); obj.setIdConsulta(rs.getInt("id_consulta")); obj.setIdPaciente(rs.getInt("id_paciente")); obj.setIdFuncionario(rs.getInt("id_funcionario")); obj.setIdSala(rs.getObject("id_sala")!=null?rs.getInt("id_sala"):null); obj.setIdReceita(rs.getObject("id_receita")!=null?rs.getInt("id_receita"):null); obj.setDiagnostico(rs.getString("diagnostico")); obj.setDataHora(rs.getTimestamp("data_hora")); obj.setTemperatura(rs.getObject("temperatura")!=null?rs.getDouble("temperatura"):null); obj.setPressao(rs.getString("pressao")); obj.setFrequenciaCardiaca(rs.getObject("frequencia_cardiaca")!=null?rs.getInt("frequencia_cardiaca"):null);
                lista.add(obj);
            }
        }
        return lista;
    }
}
