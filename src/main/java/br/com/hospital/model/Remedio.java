package br.com.hospital.model;

public class Remedio {
    private int id_remedio;
    private string nome;
    private string descricao;

    public Remedio(){}
    public Remedio(int id_remedio, string nome, string descricao){
        this.id_remedio = remedio;
        this.nome = nome;
        this.descricao = descricao;
    }

    //GETTER E SETTERS
    public int getIdRemedio(int id_remedio){
        return remedio;
    }
    public void setIdRemedeio(int id_remedio){
        this.id_remedio = id_remedio;
    }

    public string getNome(string nome){
        return nome;
    }
    public void setNome(string nome){
        this.nome = nome;
    }

    public string getDescricao(string descricao){
        return descricao;
    }
    public void setDescricao(string descricao){
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return "Remedio [id_remedio = " + id_remedio +", nome = "+ nome +", descricao = "+ descricao +"]"
    }
}
