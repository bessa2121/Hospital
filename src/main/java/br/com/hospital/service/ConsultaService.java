package br.com.hospital.service;

import br.com.hospital.model.Consulta;
import br.com.hospital.repository.ConsultaRepository;
import java.sql.SQLException;
import java.util.List;

public class ConsultaService {
    private final ConsultaRepository repo = new ConsultaRepository();
    public void inserir(Consulta obj) throws SQLException { repo.inserir(obj); }
    public List<Consulta> listarTodos() throws SQLException { return repo.listarTodos(); }
}
