 package br.com.hospital.service;

import br.com.hospital.model.Enfermeiro_Especialidade;
import br.com.hospital.repository.EnfermeiroEspecialidadeRepository;
import java.sql.SQLException;
import java.util.List;

public class EnfermeiroEspecialidadeService {
    private final EnfermeiroEspecialidadeRepository repo = new EnfermeiroEspecialidadeRepository();

    public void inserir(Enfermeiro_Especialidade obj) throws SQLException {
        repo.inserir(obj);
    }

    public List<Enfermeiro_Especialidade> listarTodos() throws SQLException {
        return repo.listarTodos();
    }
}
