package br.com.hospital.service;

public class ConsultaService {

import br.com.hospital.model.Consulta;
import br.com.hospital.repository.ConsultaRepository;
import java.sql.SQLException;
import java.util.List;

public class ConsultaService {
    private final ConsultaRepository repo = new ConsultaRepository();

    //nova consulta
    public void inserir(Consulta obj) throws SQLException {
        repo.inserir(obj);
    }

    //lista consulta
    public List<Consulta> listarTodos() throws SQLException {
        return repo.listarTodos();
    }

    //buscar consulta
    public Consulta buscarPorId(int id) throws SQLException {
        return repo.buscarPorId(id);
    }

    //atualizar dados
    public void atualizar(Consulta obj) throws SQLException {
        repo.atualizar(obj);
    }

    //excluir consulta
    public void excluir(int id) throws SQLException {
        repo.excluir(id);
    }
}

}
