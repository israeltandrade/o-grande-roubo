package com.israelandradedev.ogranderoubo;

public abstract class Pessoa {
    private String  nome;
    private String  apelido;
    private int     anoNascimento;
    private String  especializacao;
    // Similar aos arrays tradicionais, mas usando uma classe personalizada como tipo de dado.
    // Pensando bem, isso parece com array de String (que é classe em JAVA).
    public Item[] itens;

    // O construtor segue o padrão tradicional, exceto pelo tipo do parâmetro de entrada "Item" (não esquecer das chaves)
    public Pessoa(String nome, String apelido, int anoNascimento, String especializacao, Item[] itens) {
        this.nome = nome;
        this.apelido = apelido;
        this.anoNascimento = anoNascimento;
        this.especializacao = especializacao;
        this.itens = itens;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void imprimirDadosBiograficos() {
        System.out.println("Nome: " + getNome());
        System.out.println("Apelido: " + getApelido());
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Especialização: " + especializacao);
        System.out.println("Tem os seguintes itens:");
        // Estrutura do for each:
        // 1. Tipo e nome de variável temporária que armazenará os elementos.
        // 2. Fonte do loop for, no caso o array itens.
        for (Item item : itens) {
            // Um método getter é invocado no array
            // A vantagem de arrays com base em classes personalizadas é o armazenamento de tipos diferentes de dados
            // em uma mesma instância e índice do objeto.
            System.out.println("-" + item.getNome());
        }
    }
}
