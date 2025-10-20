package br.com.hospital.repository;

import br.com.hospital.model.Cargo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CargoRepository {
    public void inserir(Cargo obj) throws SQLExeption{
        String sql = "INSERT INTO Cargo (Nome) VALUES(?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, obj.getNome());
            ps.executeUpdate();
    }
}


public List<Cargo> listarTodos() throws SQLExeption {
    List<Cargo> lista = new ArrayList<>();
    String sql = "SELECT * FROM Cargo";
    try (Connection conn = DatabaseConnection.getConnection();
        Statement st = conn.createStatement();
        Result rs = st.executeQuery(sql)) {
            while (rs.next()) {
                br.com.hospital.model.Cargo obj = new br.com.hospital.model.Cargo(); obj.setIdCargo(rs.getInt("IdCargo")); obj.setNome(rs.getString("Nome"));
                lista.add(obj);
            }

        }
        return lista;
    }
}