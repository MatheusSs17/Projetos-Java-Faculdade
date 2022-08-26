/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.banco;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Pokemon {
    private Integer id;
    private String nome;
    private String tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pokemon(Integer id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Pokemon() {
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + '}';
    }
    
    
}
