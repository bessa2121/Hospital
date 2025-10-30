package br.com.hospital.model;

import java.sql.Date;

public class Estoque {
    private int idEstoque;
    private int idRemedio;
    private int quantidade;
    private Date dataEntrada;
    private Date dataValidade;

    public Estoque() {}

    public int getIdEstoque() { return idEstoque; }
    public void setIdEstoque(int idEstoque) { this.idEstoque = idEstoque; }

    public int getIdRemedio() { return idRemedio; }
    public void setIdRemedio(int idRemedio) { this.idRemedio = idRemedio; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public Date getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(Date dataEntrada) { this.dataEntrada = dataEntrada; }

    public Date getDataValidade() { return dataValidade; }
    public void setDataValidade(Date dataValidade) { this.dataValidade = dataValidade; }
}
