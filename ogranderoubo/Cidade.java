package com.israelandradedev.ogranderoubo;

public class Cidade {
    // Array com objeto personalizado como tipo (baseado na classe Edificio)
    // Esse construtor veio da classe edifício e prevê NOME e ITENS (array de classe personalizada)
    private Edificio[] edificios = new Edificio[4];

    // Construtor:
    public Cidade() {
        // Arrays criados (do tipo Item, classe personalizada) para armazenar os dois itens de cada edifício
        Item[] itensBanco = new Item[2];
        itensBanco[0] = new Item("Abridor de Cartas", 1.5f);
        itensBanco[1] = new Item("Carimbo", 2.5f);
        // Nome está aqui e o array temporário serve para preencher os itens do parâmetro de Edifício
        // A instância não é independente, mas entra como parte do índice do array "edifícios"
        edificios[0] = new Edificio("Banco", itensBanco);

        Item[] itensMansao = new Item[2];
        itensMansao[0] = new Item("Par de sapatos chiques", 25.0f);
        itensMansao[1] = new Item("Vidro quebrado", 0.1f);
        edificios[1] = new Edificio("Mansão", itensMansao);

        Item[] itensCorreio = new Item[2];
        itensCorreio[0] = new Item("Carta para João", 1.5f);
        itensCorreio[1] = new Item("Lápis", 2.0f);
        edificios[2] = new Edificio("Correio", itensCorreio);

        Item[] itensSupermercado = new Item[2];
        itensSupermercado[0] = new Item("Fatia de pão", 2.5f);
        itensSupermercado[1] = new Item("Uma sacola de chá", 6.5f);
        edificios[3] = new Edificio("Supermercado", itensSupermercado);
    }

    // O getter para array deve incluir "[]" após o tipo
    public Edificio[] getEdificios() {
        return edificios;
    }
}