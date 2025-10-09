package br.com.hospital.service;

import br.com.hospital.model.Funcionario;
import br.com.hospital.repository.FuncionarioRepository;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioService {
    private final FuncionarioRepository repo = new FuncionarioRepository();
    public void inserir(Funcionario obj) throws SQLException { repo.inserir(obj); }
    public List<Funcionario> listarTodos() throws SQLException { return repo.listarTodos(); }
}
