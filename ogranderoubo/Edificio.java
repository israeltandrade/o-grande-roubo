package com.israelandradedev.ogranderoubo;

public class Edificio {
    private String  nome = "";
    private Item[] itens;

    public Edificio(String nome, Item[] itens){
        this.nome = nome;
        this.itens = itens;
    }

    public String getNome() {
        return nome;
    }

    // Getter de array do tipo objeto personalizado. Necessário especificar "[ ]"
    public Item[] getItens() {
        return itens;
    }

    // Setter perfeito(!!!) Ideia do stackoverflow
//    public void setItems(int indice, String item) {
//        this.items[indice] = item;
//    }


}
