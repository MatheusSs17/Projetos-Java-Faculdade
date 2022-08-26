/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.individual;

import java.util.Scanner;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Jogo {
    
    Scanner leitor = new Scanner(System.in);
    Scanner leitorPerguntas = new Scanner(System.in);
    
    void jogoDePerguntas(Integer pergunta) {
        
        Integer pontuacao = 0;
        String resposta = null;
        do {       
            pontuacao = 0;
            
//            Integer perguntaDois = null;
//            Integer perguntaTres = null;
//            Integer perguntaQuatro = null;

            System.out.println("\tVamos começar!");
            
            //Pergunta Um
            
            System.out.println("Cada dupla do time RWBY tem um ataque em "
            + "conjunto que tem um nome especifico.\n"
            + "Sabendo disso: ");
            System.out.println("\nQual o nome do ataque em conjunto de "
            + "Blake Belladonna e Yang Xiao Long?\n\n"
            + "1) Ice Flower.\n"
            + "2) Bumblebee.\n" //essa é a certa.
            + "3) White Rose.\n"
            + "4) Xeque Mate.\n"
            + "Digite a resposta abaixo");
            pergunta = leitorPerguntas.nextInt();

            while (pergunta != 1 && pergunta != 2 && pergunta != 3 &&
                    pergunta != 4) {                
                System.out.println("\n\nNão entendi. Aqui vai a pergunta de novo "
                + "e responda \ncom o número correspondente da questão!");
                
                System.out.println("\n\nQual o nome do ataque em conjunto de "
                + "Blake Belladonna e Yang Xiao Long?\n\n"
                + "1) Ice Flower.\n"
                + "2) Bumblebee.\n" //essa é a certa.
                + "3) White Rose.\n"
                + "4) Xeque Mate.\n"
                + "Digite a resposta abaixo");
                pergunta = leitorPerguntas.nextInt();
            }
            
            if (pergunta == 2) {
                pontuacao+=10;
                System.out.println(String.format("Você acertou, agora tens"
                        + " %d pontos \n" + "-".repeat(80), pontuacao));
            } else {
                pontuacao-= 5;
                System.out.println(String.format("Você errou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            }
            
            //Pergunta Dois
            
            System.out.println("\n\nQual o nome do ataque em conjunto de "
            + "Blake Belladonna e Weiss Schnee?\n\n"
            + "1) Ice Flower.\n"
            + "2) Red Shadow.\n"
            + "3) White Rose.\n"
            + "4) Xeque Mate.\n" //essa é a certa.
            + "Digite a resposta abaixo");
            pergunta = leitorPerguntas.nextInt();

            while (pergunta != 1 && pergunta != 2 && pergunta != 3 &&
                    pergunta != 4) {                
                System.out.println("\n\nNão entendi. Aqui vai a pergunta de novo "
                + "e responda \ncom o número correspondente da questão!");
                
                System.out.println("\n\nQual o nome do ataque em conjunto de "
                + "Blake Belladonna e Weiss Schnee?\n\n"
                + "1) Ice Flower.\n"
                + "2) Red Shadow.\n"
                + "3) White Rose.\n"
                + "4) Xeque Mate.\n" //essa é a certa.
                + "Digite a resposta abaixo");
                pergunta = leitorPerguntas.nextInt();
            }
            
            if (pergunta == 4) {
                pontuacao+=10;
                System.out.println(String.format("Você acertou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            } else {
                pontuacao-= 5;
                System.out.println(String.format("Você errou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            }
            
            //Pergunta Três
            
            System.out.println("\n\nCada arma, seja uma foice ou um rifle"
                    + " semi-automatico, recebem nomes de seus donos.\nQual o "
                    + "nome da foice de Ruby Rose?\n\n"
            + "1) Gambol Shroud.\n"
            + "2) Myrtenaster.\n"
            + "3) Crescent Rose.\n" //essa é a certa.
            + "4) Ember Celica.\n"
            + "Digite a resposta abaixo");
            pergunta = leitorPerguntas.nextInt();

            while (pergunta != 1 && pergunta != 2 && pergunta != 3 &&
                    pergunta != 4) {  
                
                System.out.println("\n\nNão entendi. Aqui vai a pergunta de novo "
                + "e responda \ncom o número correspondente da questão!");
                
                System.out.println("\n\nCada arma, seja uma foice ou um rifle"
                    + " semi-automatico, recebem nomes de seus donos.\nQual o "
                    + "nome da foice de Ruby Rose?\n\n"
                + "1) Gambol Shroud.\n"
                + "2) Myrtenaster.\n"
                + "3) Crescent Rose.\n" //essa é a certa.
                + "4) Ember Celica.\n"
                + "Digite a resposta abaixo");
                pergunta = leitorPerguntas.nextInt();
                }
            
            if (pergunta == 3) {
                pontuacao+=15;
                System.out.println(String.format("Você acertou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            } else {
                pontuacao-= 10;
                System.out.println(String.format("Você errou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            }
            
            //Pergunta Quatro
            
            System.out.println("\n\nCada arma, seja uma foice ou um rifle"
            + " semi-automatico, recebem nomes de seus donos. \nQual o "
            + "nome das manoplas de Yang Xiao Long?\n\n"
            + "1) Gambol Shroud.\n"
            + "2) Myrtenaster.\n"
            + "3) Harbinger.\n" 
            + "4) Ember Celica.\n" //Essa é a certa.
            + "Digite a resposta abaixo");
            pergunta = leitorPerguntas.nextInt();

            while (pergunta != 1 && pergunta != 2 && pergunta != 3 &&
                    pergunta != 4) {  
                
                System.out.println("\n\nNão entendi. Aqui vai a pergunta de novo "
                + "e responda \ncom o número correspondente da questão!");
                
                System.out.println("\n\nCada arma, seja uma foice ou um rifle"
                + " semi-automatico, recebem nomes de seus donos.\n Qual o "
                + "nome das manoplas de  Yang Xiao Long?\n\n"
                + "1) Gambol Shroud.\n"
                + "2) Myrtenaster.\n"
                + "3) Harbinger.\n" 
                + "4) Ember Celica.\n" //Essa é a certa.
                + "Digite a resposta abaixo");
                pergunta = leitorPerguntas.nextInt();
                }
            
            if (pergunta == 4) {
                pontuacao+=15;
                System.out.println(String.format("Você acertou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            } else {
                pontuacao-= 10;
                System.out.println(String.format("Você errou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            }
            
            //Pergunta Cinco
            
            System.out.println("\n\nPessoas que estão destindas a "
            + "terem uma vida de guerreiros,\nnascem com uma"
            + " característica única.\n Qual é essa"
            + " característica?\n\n"
            + "1) Nascem com olhos prateados.\n" //Essa é a certa.
            + "2) Nascem com olhos dourados.\n"
            + "3) Nascem com olhos azuis como joias.\n" 
            + "4) Nascem com olhos coloridos.\n" 
            + "Digite a resposta abaixo");
            pergunta = leitorPerguntas.nextInt();

            while (pergunta != 1 && pergunta != 2 && pergunta != 3 &&
                    pergunta != 4) {  
                
                System.out.println("\n\nNão entendi. Aqui vai a pergunta de novo "
                + "e responda \ncom o número correspondente da questão!");
                
                System.out.println("\n\nPessoas que estão destindas a "
                + "terem uma vida de guerreiros,\nnascem com uma"
                + " característica única.\n Qual é essa"
                + " característica?\n\n"
                + "1) Nascem com olhos prateados.\n" //Essa é a certa.
                + "2) Nascem com olhos dourados.\n"
                + "3) Nascem com olhos azuis como joias.\n" 
                + "4) Nascem com olhos coloridos.\n" 
                + "Digite a resposta abaixo");
                pergunta = leitorPerguntas.nextInt();
                
            }
            
            if (pergunta == 1) {
                pontuacao+=25;
                System.out.println(String.format("Você acertou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            } else {
                pontuacao-= 30;
                System.out.println(String.format("Você errou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            }
            
            //Pergunta Seis
            
            System.out.println("\n\n'Semblante'"
                    + " não é nada mais do que um poder único e exclusivo"
                    + " de cada pessoa.\n Qual personagem "
                    + "tem o Semblante de 'Imaginação Hiperativa'?"
                    + " Na qual cria qualquer coisa que quiser.\n\n"
            + "1) Neopolitan.\n" //Essa é a certa.
            + "2) Qrow Branwen.\n"
            + "3) aven Branwen.\n" 
            + "4) Summer Rose.\n" 
            + "Digite a resposta abaixo");
            pergunta = leitorPerguntas.nextInt();

            while (pergunta != 1 && pergunta != 2 && pergunta != 3 &&
                    pergunta != 4) {  
                
                System.out.println("\n\nNão entendi. Aqui vai a pergunta de novo "
                + "e responda \ncom o número correspondente da questão!");
                
                System.out.println("\n\n'Semblante'"
                + " não é nada mais do que um poder único e exclusivo"
                + " de cada pessoa.\n Qual personagem "
                + "tem o Semblante de 'Imaginação Hiperativa'?\n"
                + " Na qual cria qualquer coisa que quiser.\n\n"
                + "1) Neopolitan.\n" //Essa é a certa.
                + "2) Qrow Branwen.\n"
                + "3) aven Branwen.\n" 
                + "4) Summer Rose.\n" 
                + "Digite a resposta abaixo");
                pergunta = leitorPerguntas.nextInt();
                
            }
            
            if (pergunta == 1) {
                pontuacao+=25;
                System.out.println(String.format("Você acertou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            } else {
                pontuacao-= 30;
                System.out.println(String.format("Você errou, agora tens"
                        + " %d pontos\n" + "-".repeat(80), pontuacao));
            }
            
            if (pontuacao == 100) {
                System.out.println("\n\n\t Parabéns, você conseguiu acertar"
                        + " todas as questões!!");
            } else {
                System.out.println("\n\n\tVocê pode melhorar se tentar de novo!!");
            }
            
            
            System.out.println("\n\nDeseja jogar de novo?");
            resposta = leitor.nextLine().toUpperCase();
            
            while (!"SIM".equals(resposta) &&
                    !"NÃO".equals(resposta) ) {                
                System.out.println("Não entendi, digite SIM para "
                + "continuar e NÃO para parar.");
                resposta = leitor.nextLine().toUpperCase();
                
            }
        } while ("SIM".equals(resposta));
    
        
        
    }
}
