package com.sptech.projeto.heranca;

public class AlunoGraduacao extends Aluno{
    
    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoGraduacao(Integer ra, String nome, Double notaContinuada, Double notaIntegrada) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }    
    
    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public void teste() {
        System.out.println("Minha mãe gorda");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nnotaContinuada: ").append(notaContinuada);
        sb.append(" \nnotaIntegrada: ").append(notaIntegrada);
        sb.append(" \nnome: ").append(this.nome);
        sb.append(" \nra: ").append(this.getRa());
        return sb.toString();
    }
    
    
    
    
}
