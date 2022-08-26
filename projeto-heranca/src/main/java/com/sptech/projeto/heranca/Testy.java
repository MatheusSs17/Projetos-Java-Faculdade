/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.heranca;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Testy {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Gui", 8, 2.0);
        Desenvolvedor d2 = new Desenvolvedor("Denis Negão", 2, 10.0);
        DesenvolvedorMobile dm1 = new DesenvolvedorMobile(3, 3.0, "Jailson", 4, 4.0);
        Consultoria c1 = new Consultoria("Jacintopi Into", 2);
        
        c1.contratar(d1);
        c1.contratar(dm1);
        c1.contratar(d1);
        c1.contratar(d2);
        
        System.out.println(c1.existePorNome("Jailon"));
        System.out.println(c1.existePorNome("JAilSoN"));
        
        System.out.println(c1.buscarDesenvolvedorPorNome("Jailson"));
        System.out.println(c1.getQuantidadeDesenvolvedores());
        System.out.println(c1.getVagas());
        System.out.println(c1.getDesenvolvedores());
        System.out.println(c1.getQuantidadeDesenvolvedoresMobile());
    }
}
