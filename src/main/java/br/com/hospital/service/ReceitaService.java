package br.com.hospital.service;
import br.com.hospital.model.Paciente;
import br.com.hospital.repository.PacienteRepository;
import java.sql.SQLException;
import java.util.List;

public class ReceitaService {
    private final ReceitaRepository repo = new ReceitaRepository();
    public void inserir(Receita obj) throws SQLException{repo.inserir(obj);}
    public List<Receita> listarTodos() throws SQLException{return repo.listarTodos();}
}
