package br.com.hospital.model;

public class Remedio {
    private int idRemedio;
    private String nomeRemedio;
    private String descricao;

    public Remedio() {}

    public int getIdRemedio() { return idRemedio; }
    public void setIdRemedio(int idRemedio) { this.idRemedio = idRemedio; }

    public String getNomeRemedio() { return nomeRemedio; }
    public void setNomeRemedio(String nomeRemedio) { this.nomeRemedio = nomeRemedio; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
