package br.com.hospital.service;

import br.com.hospital.model.Sala;
import br.com.hospital.repository.SalaRepository;
import java.sql.SQLException;
import java.util.List;

public class SalaService {
    private final SalaRepository repo = new SalaRepository();
    public void inserir(Sala obj) throws SQLException { repo.inserir(obj); }
    public List<Sala> listarTodos() throws SQLException { return repo.listarTodos(); }
}