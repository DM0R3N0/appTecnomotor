package com.daniel.apptecnomotor;


public class Posts {

    private String nome;
    //private String tipo;

    public Posts(String title, String body) {
        this.nome = title;
        //this.tipo = body;
    }

    public String getNome() {
        return nome;
    }
/*
    public String getTipo() {
        return tipo;
    }*/
}
