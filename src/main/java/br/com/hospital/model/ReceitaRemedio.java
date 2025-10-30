package br.com.hospital.model;

public class ReceitaRemedio {
    private int idReceita;
    private int idRemedio;
    private String quantidade;
    private String dosagem;
    private String periodo;

    public ReceitaRemedio() {}

    public int getIdReceita() { return idReceita; }
    public void setIdReceita(int idReceita) { this.idReceita = idReceita; }

    public int getIdRemedio() { return idRemedio; }
    public void setIdRemedio(int idRemedio) { this.idRemedio = idRemedio; }

    public String getQuantidade() { return quantidade; }
    public void setQuantidade(String quantidade) { this.quantidade = quantidade; }

    public String getDosagem() { return dosagem; }
    public void setDosagem(String dosagem) { this.dosagem = dosagem; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }
}
