package br.com.hospital.model;

public class ReceitaRemedio {
    private int id_receita;
    private int id_remedio;
    private string quantidade;
    private string dosagem;
    private string periodo;

    public ReceitaRemedio(){}
    public ReceitaRemedio(int id_receita, int id_remedio, string quantidade, string dosagem, string periodo){
        this.id_receita = receita;
        this.id_remedio = remedio;
        this.quantidade = quantidade;
        this.dosagem = dosagem;
        this.periodo = periodo;
    }
    
    //GETTER E SETTERS
    public int getIdReceita(id_receita){
        return id_receita;
    }
    public void setIdReceita(id_receita){
        this.id_receita = id_receita;
    }

    public int getIdRemedio(id_remedio){
        return id_remedio;
    }
    public void setIdRemedio(id_remedio){
        this.IdRemedio = id_remedio;
    }

    public string getQuantidade(string quantidade){
        return quantidade;
    }
    public void setQuantidade(string quantidade){
        this.quantidade = quantidade;
    }

    public string getDosagem(string dosagem){
        return dosagem;
    }
    public void setDosagem(string dosagem){
        this.dosagem = dosagem;
    }

    public string getPeriodo(string periodo){
        return periodo;
    }
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }

    @Override
    public String toString(){
        return "ReceitaRemedio [id_receita = "+ id_receita + ", id_remedio = "+ id_remedio + ",quantidade = "+ quantidade +", dosagem = " + dosagem +", período = " + periodo +"]"
    }

}
