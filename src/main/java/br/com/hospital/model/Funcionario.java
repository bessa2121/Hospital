/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Hospital;

/**
 *
 * @author DAVI
 */
public class Funcionario {
    private int id_funcionario;
    private int id_cargo;
    private String nome;
    private String sexo;
    private String telefone;
    private date data_nascimento;
    private String cpf;
    private String rg;
    private String endereco;
    private String cep;
    private String uf;
    private String crm;
    private String coren;
    
    public  Funcionario() {}
    
    public Funcionario(int id_funcionario, int id_cargo, String nome, String sexo, String telefone, date data_nascimento, String cpf, String rg, String endereco, String cep, String uf, String crm, String coren) {
        this.idFuncionario = id_funcionario;
        this.id_cargo = id_cargo;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.cep = cep;
        this.uf = uf;
        this.crm = crm;
        this.coren = coren;
    }
    
    
    public int getid_funcionario() {return id_funcionario;}
    public void setid_funcionario(int id_funcionario) {this.id_funcionario = id_funcionario;}

    public int getid_cargo() {return id_cargo;}
    public void setid_cargo(int id_cargo) {this.id_cargo = id_cargo;}
    
    public String getnome() {return nome;}
    public void setnome(String nome) {this.nome = nome;}

    public String getsexo() {return sexo;}
    public void setsexo(String sexo) {this.sexo = sexo;}
    
    public String gettelefone() {return telefone;}
    public void settelefone(String telefone) {this.telefone = telefone;}
    
    public date getdata_nascimento() {return data_nascimento;}
    public void setdata_nascimento(date data_nascimento) {this.data_nascimento = data_nascimento;}

    public String getcpf() {return cpf;}
    public void setcpf(String cpf) {this.cpf = cpf;}

    public String getrg() {return rg;}
    public void setrg(String rg) {this.rg = rg;}

    public String getendereco() {return endereco;}
    public void setendereco(String endereco) {this.endereco = endereco;}

    public String getcep() {return cep;}
    public void setcep(String cep) {this.cep = cep;}

    public String getuf() {return uf;}
    public void setuf(String uf) {this.uf = uf;}
    
    public String getcrm() {return crm;}
    public void setcrm(String crm) {this.crm = crm;}
    
    public String getcoren() {return coren;}
    public void setcoren(String coren) {this.coren = coren;}
    
    @Override
    public String toString() {
        return "Funcionario [id=" + idFuncionario + ", nome" + nome + "]";
    }
}
