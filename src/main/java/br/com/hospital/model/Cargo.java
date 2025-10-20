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
    private int IdCargo;
    private String Nome;
    
    public Cargo() {}
    
    public Cargo(int IdCargo, String Nome) {
        this.IdCargo = IdCargo;
        this.Nome = Nome;
    }

    public int getIdcargo() {return IdCargo;}
    public void setIdcargo(int IdCargo) {this.IdCargo = IdCargo;}
    
    public String getNome() {return Nome;}
    public void setNome(String Nome) {this.Nome = Nome;}
    
    @Override
    public String toString() {
        return "Cargo [id=" + IdCargo + ", Nome" + Nome + "]";
    }
}
