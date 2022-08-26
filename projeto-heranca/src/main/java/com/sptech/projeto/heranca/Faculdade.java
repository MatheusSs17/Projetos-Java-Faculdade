/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Faculdade {
    
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }
    
    
      
      
    
}
