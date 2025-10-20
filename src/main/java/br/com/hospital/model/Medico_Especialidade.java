public class Medico_Especialidade {
    private int idMedico;
    private String nome;
    private String crm; // Registro profissional do médico
    private String especialidade;
    private String turno; // Exemplo: "Manhã", "Tarde", "Noite"

    // Construtor padrão (vazio)
    public Medico_Especialidade() {}

    // Construtor com parâmetros
    public Medico_Especialidade(int idMedico, String nome, String crm, String especialidade, String turno) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.turno = turno;
    }

    // Getters e Setters
    public int getIdMedico() { return idMedico; }
    public void setIdMedico(int idMedico) { this.idMedico = idMedico; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCrm() { return crm; }
    public void setCrm(String crm) { this.crm = crm; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    // Método para exibir informações básicas do médico
    @Override
    public String toString() {
        return "Médico [id=" + idMedico + ", nome=" + nome + ", especialidade=" + especialidade + "]";
    }
}
