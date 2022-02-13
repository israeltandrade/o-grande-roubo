package com.israelandradedev.ogranderoubo;

import java.util.Random;

public class Quadrilha {
    // Criado array do tipo Criminoso com dois espaços.
    private Criminoso[] criminosos = new Criminoso[2];
    // Gerador de número aleatório baseado na classe JAVA "Random".
    private Random geradorNumeroAleatorio = new Random();
    private float somaValorRoubado;

    // Construtor:
    public Quadrilha() {
        // Array de itens assim como em Cidade, o nome já sugere o personagem ao qual estão associados.
        Item[] itensRoberto = new Item[2];
        itensRoberto[0] = new Item("Canivete Suíço sem corte.", 10.5f);
        itensRoberto[1] = new Item("Maçã meio apodrecida.", 0.0f);
        // Criminoso criado como instância independente e que entra no array criminosos também.
        Criminoso roberto = new Criminoso("Roberto","O Cabeça",1976,"arrombar", itensRoberto);
        criminosos[0] = roberto;

        Item[] itensLinguica = new Item[2];
        itensLinguica[0] = new Item("Taco de baseball.", 20.0f);
        itensLinguica[1] = new Item("Palito de dentes.", 0.5f);
        Criminoso linguica = new Criminoso("Linguiça","O Montanha",1978,"nocautear", itensLinguica);
        criminosos[1] = linguica;
    }

    public float getSomaValorRoubado() {
        return somaValorRoubado;
    }

    public void imprimirInformacaoQuadrilha() {
        for(Criminoso criminoso : criminosos) {
            System.out.println("----------------------------");
            // Esta classe não precisou herdar a classe pessoa, pois o objeto Criminoso utilizado já tem métodos que
            // herdam e sobrepõem aos da classe Pessoa. Por exemplo:
            criminoso.imprimirDadosBiograficos();
        }
    }

    // Método para averiguar sucesso do roubo:
    private boolean rouboBemSucedido() {
        int numeroAleatorio = geradorNumeroAleatorio.nextInt(101);
        // Somatório resulta do número de criminosos vezes a chance de sucesso, que é uma constante estática:
        int somatorioChanceSucesso = criminosos.length * Criminoso.CHANCE_SUCESSO;
        if(numeroAleatorio >= somatorioChanceSucesso) {
            return false;
        }
        return true;
    }

    public void vamosRoubar(Edificio[] edificios) {
        // O número aleatório respeita o tamanho do array edificios. É necessário armazenar esse valor numa variável.
        // Se um novo número fosse invocado, ele provavelmente seria diferente.
        int indiceAleatorioEdificios = geradorNumeroAleatorio.nextInt(edificios.length);
        System.out.println("----------------------------------");
        if(rouboBemSucedido()) {
            System.out.println("A quadrilha conseguiu roubar o seguinte edificio: " + edificios[indiceAleatorioEdificios].getNome());
            System.out.println("E os seguintes itens foram roubados:");
            for (Item item : edificios[indiceAleatorioEdificios].getItens()) {
                somaValorRoubado += item.getValor();
                System.out.println("-" + item.getNome());
            }
        }
        else {
            System.out.println("A quadrilha tentou roubar o(a) " + edificios[indiceAleatorioEdificios].getNome() + ", mas falhou.");
        }
    }
}
