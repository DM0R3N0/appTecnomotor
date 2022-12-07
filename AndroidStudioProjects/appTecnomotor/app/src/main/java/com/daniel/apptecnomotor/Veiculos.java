package com.daniel.apptecnomotor;

public class Veiculos {
    private int idCar;
    private String nome;

    public Veiculos(int idCar, String nome) {
        this.idCar = idCar;
        this.nome = nome;
    }

    public int getIdCar() {
        return idCar;
    }

    public String getNome() {
        return nome;
    }
}
