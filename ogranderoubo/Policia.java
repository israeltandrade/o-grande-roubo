package com.israelandradedev.ogranderoubo;

import java.util.Random;

public class Policia {

    private Detetive guilhermeRocha;

    public Policia() {
        Item[] itensGuilherme = new Item[2];
        itensGuilherme[0] = new Item("Revólver", 500.0f);
        itensGuilherme[1] = new Item("Lupa", 10.0f);
        guilhermeRocha = new Detetive("Guilherme Rocha", "O Coiote", 1968, "xadrez", itensGuilherme);
    }

    public boolean capturarCriminosos(Quadrilha quadrilha) {
        if(criminososForamCapturados()) {
            System.out.println(guilhermeRocha.getNome() + " conseguiu capturar a quadrilha.");
            if(quadrilha.getSomaValorRoubado() > 0.0) {
                System.out.println("Os valores roubados foram recuperados.");
                System.out.println("O valor estimado de todos eles é de $" + quadrilha.getSomaValorRoubado());
            } else {
                System.out.println("A quadrilha não conseguiu roubar nada.");
            }
            return true;
        } else {
            System.out.println(guilhermeRocha.getNome() + " não conseguiu capturar os criminosos.");
            System.out.println("Até agora, eles conseguiram roubar itens avaliados em $" + String.format("%.2f", quadrilha.getSomaValorRoubado()));
            return false;
        }
    }

    private boolean criminososForamCapturados() {
        Random geradorNumeroAleatorio = new Random();
        if(geradorNumeroAleatorio.nextInt(101) >= Detetive.PORCENTAGEM_SUCESSO) {
            return  false;
        }
        return true;
    }
}
