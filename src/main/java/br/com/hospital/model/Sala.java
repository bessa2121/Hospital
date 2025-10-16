package br.com.hospital.model;

public class Sala {
    private int idSala;
    private int idFuncionario;
}

public Sala() {}

public Sala(int idSala, int idFuncionario) {
    this.idSala = idSala;
    this.idFuncionario = idFuncionario;
}

public int getidSala() { return idSala; } 
public void setidSala(int idSala) { this.idSala = idSala; }

public int getidFuncionario() { return idFuncionario; } 
public void setidFuncionario(int idSala) { this.idSala = idFuncionario; }

@Override 
public String toString() {
    return "id Sala = " + idSala;
}