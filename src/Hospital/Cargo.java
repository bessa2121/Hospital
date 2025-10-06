/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Hospital;

/**
 *
 * @author DAVI
 */
public class Cargo {
    private int idCargo;
    private String nome;
    
    public Cargo() {}
    
    public Cargo(int idCargo, String nome) {
        this.idCargo = idCargo;
        this.nome = nome;
    }

    public int getidCargo() {return idCargo;}
    public void setidCargo(int idCargo) {this.idCargo = idCargo;}
    
    public String getnome() {return nome;}
    public void setnome(String nome) {this.nome = nome;}
    
    @Override
    public String toString() {
        return "Cargo [id=" + idCargo + ", nome" + nome + "]";
    }
}
