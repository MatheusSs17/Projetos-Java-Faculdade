/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sptech.projeto.lista;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class App {

    public static void main(String[] args) {
   
        // var nomes = [];
        
//        String[] nomes = new String[10];
//        Integer[] numeros = new Integer[10];
//        nomes[1] = "Diego";
//        
//        List listaEstranha = new ArrayList();
//        
//        listaEstranha.add("Matheus Moreschi");
//        listaEstranha.add(42);
//        listaEstranha.add(10.0);
//        listaEstranha.add(true);
//        
//        System.out.println(listaEstranha);
        
//        List<String> nomes = new ArrayList();
//        
//        nomes.add("Dom");
//        nomes.add("Car");
//        
//        System.out.println("\n\nPRIMEIRO RECEBAAA!");
//        for (int i = 0; i < nomes.size(); i++) {
//            
//            String nome = nomes.get(i);
//            
//            System.out.println("Nome: " + nome);
//        }
//
//        nomes.add(0, "Gerson");
//        
//        System.out.println("\n\n SEGUNDO RECEBAAA!");
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println("Nome: " + nomes.get(i));
//        }
//        
//        nomes.set(1, "Brandão");
//        System.out.println("\n\n TERCEIRO RECEBAAA!");
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println("Nome: " + nomes.get(i));
//        }
//        
//        nomes.remove(0);
//        
//        System.out.println("\n\n QUARTO RECEBAAA!");
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println("Nome: " + nomes.get(i));
//        }
//        
//        
//        
//        if (nomes.isEmpty()) {
//            System.out.println("VAZIO RECEBA");
//        } else {
//            System.out.println("NÃO TÁ VAZIO");
//        }
//        
//        nomes.forEach(nome -> {
//            System.out.println("Nome: " + nome);
//        });
//        
//        List<Integer> numeros = new ArrayList();
//        
//        numeros.add(1);
//        numeros.add(10);
//        numeros.add(100);
//        numeros.add(1000);
//        
//        
//        for (Integer numero : numeros) {
//            System.out.println(numero);
//        }

        Animacao a1 = new Animacao("Shrek", 2001);
        Animacao a2 = new Animacao("Toy Story", 1995);
        Animacao a3 = new Animacao("Carros", 2006);
        Animacao a4 = new Animacao("Rei Leão", 1994);
        Animacao a5 = new Animacao("Branca de Neve", 1937);
        Animacao a6 = new Animacao("Pica pau", 2000);
        
        List<Animacao> animacoes = new ArrayList<>();
        
        animacoes.add(a1);
        animacoes.add(a2);
        animacoes.add(a3);
        animacoes.add(a4);
        animacoes.add(a5);
        animacoes.add(a6);
        
        for (Animacao animacaoDaVEz : animacoes) {
            if (animacaoDaVEz.getAnoDeLancamento().equals(1994)) {
                System.out.println(animacaoDaVEz);
                
            }
            
        }
        
    }
}
