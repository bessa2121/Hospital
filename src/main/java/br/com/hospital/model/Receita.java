package br.com.hospital.model;

public class Receita {
    private int id_receita;
    private int id_paciente;
    private int id_funcionario;
    private date data_emissao;
    private string observacoes;

    public Receita(){}
    public Receita(int id_receita,int id_paciente, int id_funcionario, date data_emissao, string observacoes){
        this.id_receita = id_receita;
        this.id_paciente = id_paciente;
        this.id_funcionario = id_funcionario;
        this.data_emissao = data_emissao;
        this.observacoes = observacoes;
    }

    //Getters e Setters
    public int getIdReceita(int id_receita){
        return id_receita;
    }
    public void setIdReceita(int id_receita){
        this.id_receita = id_receita;
        }
    
    public int getIdPaciente(int id_paciente){
        return id_paciente;
    }
    public void setIdPaciente(int id_paciente){
        this.id_paciente = id_paciente;
    }

    public int getIdFuncionario(id_funcionario){
        return id_funcionario;
    }
    public void setIdFuncionario(int id_funcionario){
        this.id_funcionario = id_funcionario;
    }

    public date getDataEmissao(date data_emissao){
        return data_emissao;
    }
    public void setDataEmissao(date data_emissao){
        this.data_emissao = data_emissao;
    }

    public string getObservacoes(string observacoes){
        return observacoes;
    }
    public void setObservacoes(string observacoes){
        this.observacoes = observacoes;
    }

    @Override
    public String toString(){
    return "Receita [id_receita = "+ id_receita+", id_paciente = "+id_paciente+", id_funcionario = "+ id_funcionario+", data = "+data_emissao+" Observações = "+observacoes"         ]"
    }
}
