package br.com.calculadorafit.modelos;

public class Alimento {
    private String nome;
    private double calorias;
    private double proteina;
    private double carboidrato;
    private double gordura;
    private double quantidade;

    // SETTER

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public void setCarboidrato(double carboidrato) {
        this.carboidrato = carboidrato;
    }

    public void setGordura(double gordura) {
        this.gordura = gordura;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    // FIM SETTER

    public double quantidadeCaloria(double quantidade) {
        double resultadoCaloria = quantidade * calorias;
        System.out.println(quantidade + "g tem " +resultadoCaloria+ " calorias.");
        return resultadoCaloria;
    }

    public double quantidadeProteina(double quantidade) {
        double resultadoProteina = quantidade * proteina;
        System.out.println(quantidade + "g tem " +resultadoProteina+ " proteína.");
        return resultadoProteina;
    }

    public double quantidadeCarboidrato(double quantidade) {
        double resultadoCarboidrato = quantidade * carboidrato;
        System.out.println(quantidade + "g tem " +resultadoCarboidrato+ " carboidrato.");
        return resultadoCarboidrato;
    }

    public double quantidadeGordura(double quantidade) {
        double resultadoGordura = quantidade * gordura;
        System.out.println(quantidade + "g tem " +resultadoGordura+ " gordura.");
        return resultadoGordura;
    }
}
