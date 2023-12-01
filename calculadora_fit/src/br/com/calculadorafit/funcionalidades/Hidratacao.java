package br.com.calculadorafit.funcionalidades;

import br.com.calculadorafit.modelos.DadoUsuario;

public class Hidratacao extends DadoUsuario {

    public void calculoHidratacao() {
        int fatorHidratacao = 35;
        double resultado = fatorHidratacao * getPeso();
        System.out.println("Você deve beber " + resultado + " ml de água por dia");
    }
}

