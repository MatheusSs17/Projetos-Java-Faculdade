/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.lista;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Animacao {
    private String nome;
    private Integer anoDeLancamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Integer anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public Animacao(String nome, Integer anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nAno de lançamento: %d \n\n",
                nome, anoDeLancamento);

    
    }
}
