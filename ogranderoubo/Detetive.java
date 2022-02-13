package com.israelandradedev.ogranderoubo;

public class Detetive extends Pessoa{
    public final static int PORCENTAGEM_SUCESSO = 20;

    public Detetive(String nome, String apelido, int anoNascimento, String especializacao, Item[] itens) {
        super(nome, apelido, anoNascimento, especializacao, itens);
    }

    @Override
    public void imprimirDadosBiograficos() {
        System.out.println("Detetive:");
        super.imprimirDadosBiograficos();
    }

}
