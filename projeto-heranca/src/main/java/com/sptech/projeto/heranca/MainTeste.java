
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
public class MainTeste {

    public static void main(String[] args) {
        AlunoGraduacao ag = new AlunoGraduacao
        (1, "Dominik", 10.0, 8.0);
        
        Aluno a = new Aluno(2, "Cheirador de Crack - Bands");
        Faculdade f = new Faculdade("PARE CIAMINGAU");
        
        System.out.println(ag.getNome());
        System.out.println(ag.getRa());
        System.out.println(ag.getNotaContinuada());
        System.out.println(ag.getNotaIntegrada());
        
        ag.teste();
        a.teste();
        
        System.out.println(ag);
        f.matricularAluno(a);
        
        System.out.println(f);
        
        if (a instanceof AlunoGraduacao ) {
            System.out.println("É aluno de graduação");
        }
        
        Aluno ag1 = new AlunoGraduacao
        (2, "Antonio", 10.0, 8.0);
    }
}
