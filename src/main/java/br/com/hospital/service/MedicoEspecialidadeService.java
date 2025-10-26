 package br.com.hospital.service;

import br.com.hospital.model.Medico_Especialidade;
import br.com.hospital.repository.MedicoEspecialidadeRepository;
import java.sql.SQLException;
import java.util.List;

public class MedicoEspecialidadeService {
    private final MedicoEspecialidadeRepository repo = new MedicoEspecialidadeRepository();

    public void inserir(Medico_Especialidade obj) throws SQLException {
        repo.inserir(obj);
    }

    public List<Medico_Especialidade> listarTodos() throws SQLException {
        return repo.listarTodos();
    }
}
