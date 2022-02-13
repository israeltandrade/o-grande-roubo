package com.israelandradedev.ogranderoubo;

public class OGrandeRouboApp {
    public static void main(String[] args) {
        Cidade cidade = new Cidade();
        Quadrilha aQuadrilha = new Quadrilha();
        Policia policia = new Policia();

        aQuadrilha.imprimirInformacaoQuadrilha();
        do {
            aQuadrilha.vamosRoubar(cidade.getEdificios());
        // A exclamação serve para negar ou inverter o resultado.
        // No caso a seguir, significa que o programa roda enquanto o detetive NÃO consegue capturar os criminosos.
        } while (!policia.capturarCriminosos(aQuadrilha));
    }
}