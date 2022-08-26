/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.heranca;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Desenvolvedor {
    
    protected String nome;
    protected Integer qntHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qntHorasTrabalçhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qntHorasTrabalhadas = qntHorasTrabalçhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
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

    public void setQntHorasTrabalhadas(Integer qntHorasTrabalhadas) {
        this.qntHorasTrabalhadas = qntHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Double getSalario(){
        return this.qntHorasTrabalhadas * this.valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("Desenvolvedor\n"
                + "Nome: %s\n"
                + "Salário: %.2f", nome, getSalario());
    }
    
    
}
