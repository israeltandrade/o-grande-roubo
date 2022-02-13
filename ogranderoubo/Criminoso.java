package com.israelandradedev.ogranderoubo;

public class Criminoso extends Pessoa {
    public final static int CHANCE_SUCESSO = 20;

    public Criminoso(String nome, String apelido, int anoNascimento, String especializacao, Item[] itens) {
        super(nome, apelido, anoNascimento, especializacao, itens);
    }

    @Override
    public void imprimirDadosBiograficos() {
        System.out.println("Criminoso:");
        // É possível invocar um método inteiro da classe pai com o prefixo super:
        super.imprimirDadosBiograficos();
    }
}
