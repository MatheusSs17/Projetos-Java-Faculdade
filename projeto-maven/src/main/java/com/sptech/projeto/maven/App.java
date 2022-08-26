/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sptech.projeto.maven;


import com.github.britooo.looca.api.core.Looca;
import com.github.javafaker.Faker;
import java.util.Locale;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class App {

    public static void main(String[] args) {
        
        Faker f = new Faker(Locale.forLanguageTag("pt-br"));
        Looca l = new Looca();
        
//        
//        System.out.println("Nomes:\n");
//        System.out.println(faker1.animal().name());
//        System.out.println(faker1.animal().name());
//        System.out.println(faker1.animal().name());
//        System.out.println(faker1.animal().name());
//        System.out.println(faker1.animal().name());
//        System.out.println(faker1.animal().name());
//        

        System.out.println(l.getSistema() + "\n");
        System.out.println(l.getTemperatura() + "\n");
        System.out.println(l.getGrupoDeServicos() + "\n");
        System.out.println(l.getGrupoDeDiscos().getDiscos() + "\n");
        

       
        
        
        
        
    }
}
