package br.com.hospital.model;

import java.sql.Timestamp;

public class Consulta {
    private int idConsulta;
    private int idPaciente;
    private int idFuncionario;
    private Integer idSala;
    private Integer idReceita;
    private String diagnostico;
    private Timestamp dataHora;
    private Double temperatura;
    private String pressao;
    private Integer frequenciaCardiaca;

    public Consulta() {}

    public int getIdConsulta() { return idConsulta; }
    public void setIdConsulta(int idConsulta) { this.idConsulta = idConsulta; }

    public int getIdPaciente() { return idPaciente; }
    public void setIdPaciente(int idPaciente) { this.idPaciente = idPaciente; }

    public int getIdFuncionario() { return idFuncionario; }
    public void setIdFuncionario(int idFuncionario) { this.idFuncionario = idFuncionario; }

    public Integer getIdSala() { return idSala; }
    public void setIdSala(Integer idSala) { this.idSala = idSala; }

    public Integer getIdReceita() { return idReceita; }
    public void setIdReceita(Integer idReceita) { this.idReceita = idReceita; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public Timestamp getDataHora() { return dataHora; }
    public void setDataHora(Timestamp dataHora) { this.dataHora = dataHora; }

    public Double getTemperatura() { return temperatura; }
    public void setTemperatura(Double temperatura) { this.temperatura = temperatura; }

    public String getPressao() { return pressao; }
    public void setPressao(String pressao) { this.pressao = pressao; }

    public Integer getFrequenciaCardiaca() { return frequenciaCardiaca; }
    public void setFrequenciaCardiaca(Integer frequenciaCardiaca) { this.frequenciaCardiaca = frequenciaCardiaca; }
}
