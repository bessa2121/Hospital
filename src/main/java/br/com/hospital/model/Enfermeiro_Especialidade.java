public class Enfermeiro_Especialidade {
    private int idEnfermeiro;
    private String nome;
    private String coren; // Registro profissional do enfermeiro
    private String especialidade;
    private String turno; // Exemplo: "Manhã", "Tarde", "Noite"

    // Construtor padrão (vazio)
    public Enfermeiro_Especialidade() {}

    // Construtor com parâmetros
    public Enfermeiro_Especialidade(int idEnfermeiro, String nome, String coren, String especialidade, String turno) {
        this.idEnfermeiro = idEnfermeiro;
        this.nome = nome;
        this.coren = coren;
        this.especialidade = especialidade;
        this.turno = turno;
    }

    // Getters e Setters
    public int getIdEnfermeiro() { return idEnfermeiro; }
    public void setIdEnfermeiro(int idEnfermeiro) { this.idEnfermeiro = idEnfermeiro; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCoren() { return coren; }
    public void setCoren(String coren) { this.coren = coren; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    // Método para exibir informações básicas do enfermeiro
    @Override
    public String toString() {
        return "Enfermeiro [id=" + idEnfermeiro + ", nome=" + nome + ", especialidade=" + especialidade + "]";
    }
}
