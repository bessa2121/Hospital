package br.com.hospital.service;

import br.com.hospital.model.Remedio;
import br.com.hospital.repository.RemedioRepository;
import java.sql.SQLException;
import java.util.List;

public class RemedioService {
    private final RemedioRepository repo = new RemedioRepository();
    public void inserir(Remedio obj) throws SQLException { repo.inserir(obj); }
    public List<Remedio> listarTodos() throws SQLException { return repo.listarTodos(); }
}
