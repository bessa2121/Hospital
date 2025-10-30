package br.com.hospital.service;

import br.com.hospital.model.Paciente;
import br.com.hospital.repository.PacienteRepository;
import java.sql.SQLException;
import java.util.List;

public class PacienteService {
    private final PacienteRepository repo = new PacienteRepository();
    public void inserir(Paciente obj) throws SQLException { repo.inserir(obj); }
    public List<Paciente> listarTodos() throws SQLException { return repo.listarTodos(); }
}
