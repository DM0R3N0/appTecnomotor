package com.daniel.apptecnomotor.model;

public class Veiculo {
    private int id;
    private String nome;

    public Veiculo(int idCar, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
