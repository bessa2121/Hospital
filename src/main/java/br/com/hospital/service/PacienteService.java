package br.com.hospital.service;

public class PacienteService {
    import br.com.hospital.model.Paciente;
import br.com.hospital.repository.PacienteRepository;
import java.sql.SQLException;
import java.util.List;

public class PacienteService {
    private final PacienteRepository repo = new PacienteRepository();

    //inserir paciente
    public void inserir(Paciente obj) throws SQLException {
        repo.inserir(obj);
    }

    //listar paciente
    public List<Paciente> listarTodos() throws SQLException {
        return repo.listarTodos();
    }

    //buscar paciente por ID
    public Paciente buscarPorId(int id) throws SQLException {
        return repo.buscarPorId(id);
    }

    //atualizar paciente existente
    public void atualizar(Paciente obj) throws SQLException {
        repo.atualizar(obj);
    }

    //excluir paciente pelo ID
    public void excluir(int id) throws SQLException {
        repo.excluir(id);
    }
}

}
