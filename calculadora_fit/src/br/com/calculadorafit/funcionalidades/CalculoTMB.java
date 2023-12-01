package br.com.calculadorafit.funcionalidades;

import br.com.calculadorafit.modelos.DadoUsuario;

public class CalculoTMB extends DadoUsuario {
    public void calcularTMB() {

        if (getGenero() == null) {
            System.out.println("Gênero não especificado para o cálculo da TMB.");
            return;
        }

        double tmb;

        if (getGenero().equalsIgnoreCase("Masculino")) {
            tmb = 88.362 + (13.397 * getPeso()) + (4.799 * getAltura()) - (5.677 * getIdade());
        } else if (getGenero().equalsIgnoreCase("Feminino")) {
            tmb = 447.593 + (9.247 * getPeso()) + (3.098 * getAltura()) - (4.330 * getIdade());
        } else {
            System.out.println("Gênero inválido para o cálculo da TMB.");
            return;  // Sai do método se o gênero for inválido
        }

        System.out.println("TMB calculada: " + tmb + " calorias por dia");
    }


}
