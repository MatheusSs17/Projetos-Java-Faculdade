/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.heranca;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class DesenvolvedorMobile extends Desenvolvedor{
    
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHorasTrabalhadasMobile;

    public DesenvolvedorMobile(Integer qtdHorasTrabalhadasMobile, Double valorHorasTrabalhadasMobile, String nome, Integer qntHorasTrabalçhadas, Double valorHoraTrabalhada) {
        super(nome, qntHorasTrabalçhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHorasTrabalhadasMobile() {
        return valorHorasTrabalhadasMobile;
    }

    public void setValorHorasTrabalhadasMobile(Double valorHorasTrabalhadasMobile) {
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQntHorasTrabalhadas() {
        return qntHorasTrabalhadas;
    }

    public void setQntHorasTrabalhadas(Integer qntHorasTrabalçhadas) {
        this.qntHorasTrabalhadas = qntHorasTrabalçhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    @Override
    public Double getSalario(){
        return (qntHorasTrabalhadas * valorHoraTrabalhada) +
               (qtdHorasTrabalhadasMobile * valorHorasTrabalhadasMobile);
    }

    @Override
    public String toString() {
        return String.format("Desenvolvedor\n"
                + "Nome: %s\n"
                + "Salário: %.2f", nome, getSalario());
    }
    
    
    
}
