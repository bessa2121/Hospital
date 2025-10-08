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
    private int id_cargo;
    private String nome;
    
    public Cargo() {}
    
    public Cargo(int idCargo, String nome) {
        this.idCargo = idCargo;
        this.nome = nome;
    }

    public int getid_cargo() {return id_cargo;}
    public void setid_cargo(int id_cargo) {this.id_cargo = id_cargo;}
    
    public String getnome() {return nome;}
    public void setnome(String nome) {this.nome = nome;}
    
    @Override
    public String toString() {
        return "Cargo [id=" + id_cargo + ", nome" + nome + "]";
    }
}
