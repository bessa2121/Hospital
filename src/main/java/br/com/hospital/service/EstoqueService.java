package br.com.hospital.service;

import br.com.hospital.model.Estoque;
import br.com.hospital.repository.EstoqueRepository;
import java.sql.SQLException;
import java.util.List;

public class EstoqueService {
    private final EstoqueRepository repo = new EstoqueRepository();
    public void inserir(Estoque obj) throws SQLException { repo.inserir(obj); }
    public List<Estoque> listarTodos() throws SQLException { return repo.listarTodos(); }
}