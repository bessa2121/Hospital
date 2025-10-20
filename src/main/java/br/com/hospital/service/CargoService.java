package br.com.hospital.service;

import br.com.hospital.model.Paciente;
import br.com.hospital.repository.PacienteRepository;
import java.sql.SQLException;
import java.util.List;

public class CargoService {
    private final CargoRepository repo = new CargoRepository();
    public void inserir(Cargo obj) throws SQLException { repo.inserir(obj); }
    public List<Cargo> listarTodos() throws SQLException { return repo.listarTodos(); }
}