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
    private int idFuncionario;
    private String nome;
    private String telefone;
    private String CPF;
    private String crm;
    private String coren;
    
    public  Funcionario() {}
    
    public Funcionario(int idFuncionario, String nome, String telefone, String CPF, String crm, String coren) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.crm = crm;
        this.coren = coren;
    }
    
    
    public int getidFuncionario() {return idFuncionario;}
    public void setidFuncionario(int idFuncionario) {this.idFuncionario = idFuncionario;}
    
    public String getnome() {return nome;}
    public void setnome(String nome) {this.nome = nome;}
    
    public String gettelefone() {return telefone;}
    public void settelefone(String telefone) {this.telefone = telefone;}
    
    public String getCPF() {return CPF;}
    public void setCPF(String CPF) {this.CPF = CPF;}
    
    public String getcrm() {return crm;}
    public void setcrm(String crm) {this.crm = crm;}
    
    public String getcoren() {return coren;}
    public void setcoren(String coren) {this.coren = coren;}
    
    @Override
    public String toString() {
        return "Funcionario [id=" + idFuncionario + ", nome" + nome + "]";
    }
}
