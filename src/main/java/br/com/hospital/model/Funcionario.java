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
    private int IdFuncionario;
    private int IdCargo;
    private String Nome;
    private String Sexo;
    private String Telefone;
    private Date DataNascimento;
    private String Cpf;
    private String Rg;
    private String Endereco;
    private String Cep;
    private String Uf;
    private String Crm;
    private String Coren;
    
    public  Funcionario() {}
    
    public Funcionario(int IdFuncionario, int IdCargo, String Nome, String Sexo, String Telefone, date DataNascimento, String Cpf, String Rg, String Endereco, String Cep, String Uf, String Crm, String Coren) {
        this.IdFuncionario = IdFuncionario;
        this.IdCargo = IdCargo;
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Telefone = Telefone;
        this.DataNascimento = DataNascimento;
        this.Cpf = Cpf;
        this.Rg = Rg;
        this.Endereco = Endereco;
        this.Cep = Cep;
        this.Uf = Uf;
        this.Crm = Crm;
        this.Coren = Coren;
    }
    
    
    public int getIdFuncionario() {return IdFuncionario;}
    public void setIdFuncionario(int IdFuncionario) {this.IdFuncionario = IdFuncionario;}

    public int getIdCargo() {return IdCargo;}
    public void setIdCargo(int IdCargo) {this.IdCargo = IdCargo;}
    
    public String getNome() {return Nome;}
    public void setNome(String Nome) {this.Nome = Nome;}

    public String getSexo() {return Sexo;}
    public void setSexo(String Sexo) {this.Sexo = Sexo;}
    
    public String getTelefone() {return Telefone;}
    public void setTelefone(String Telefone) {this.Telefone = Telefone;}
    
    public Date getDataNascimento() {return DataNascimento;}
    public void setDataNascimento(date DataNascimento) {this.DataNascimento = DataNascimento;}

    public String getCpf() {return Cpf;}
    public void setCpf(String Cpf) {this.Cpf = Cpf;}

    public String getRg() {return Rg;}
    public void setRg(String Rg) {this.Rg = Rg;}

    public String getEndereco() {return Endereco;}
    public void setEndereco(String Endereco) {this.Endereco = Endereco;}

    public String getCep() {return Cep;}
    public void setCep(String Cep) {this.Cep = Cep;}

    public String getUf() {return Uf;}
    public void setUf(String Uf) {this.Uf = Uf;}
    
    public String getCrm() {return Crm;}
    public void setCrm(String Crm) {this.Crm = Crm;}
    
    public String getCoren() {return Coren;}
    public void setCoren(String Coren) {this.Coren = Coren;}
    
    @Override
    public String toString() {
        return "Funcionario [id=" + IdFuncionario + ", nome" + Nome + "]";
    }
}
