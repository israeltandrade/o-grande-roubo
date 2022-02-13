package com.israelandradedev.ogranderoubo;

// Essa é classe é totalmente convencional.
public class Item {
    private String  nome = "";
    private float   valor;

    public Item(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }
}
