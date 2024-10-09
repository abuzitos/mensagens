// src/main/java/com/example/mensagens/model/Mensagem.java
package com.example.mensagens.model;

public class Mensagem {

    private int id;
    private String texto;
    private String lingua;

    public Mensagem() {
    }

    public Mensagem(int id, String texto, String lingua) {
        this.id = id;
        this.texto = texto;
        this.lingua = lingua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }
}