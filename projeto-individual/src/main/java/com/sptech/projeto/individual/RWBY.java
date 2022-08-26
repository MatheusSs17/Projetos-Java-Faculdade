/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.individual;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class RWBY {

    public static void main(String[] args) {

        Utilitarios util = new Utilitarios();
        Scanner leitor = new Scanner(System.in);
        Jogo miniGame = new Jogo();

        Integer opcao = null;
        
        do {
            System.out.println("/\\\\");
            Integer opcaoDigitada = null;
            opcao = util.selecaoDeOpcao(opcaoDigitada);

            Integer alturaDigitada = null;
            Double distanciaDigitada = null;

            String personagem = null;
            
            String frase = "A opção escolhida não foi encontrada"
                    + ", por favor digite outra inicial!";

            switch (opcao) {
                case 1:
                    util.calculoDeTrabalhoDaForcaVariavel(alturaDigitada,
                            distanciaDigitada);
                    break;

                case 2:
                    do {
                        System.out.println("Digite a letra inicial de um personagem: ");
                        String letraInicialDoPersonagem = leitor.nextLine()
                                .toUpperCase();
                        personagem
                                = util.descricaoDoPersonagem(letraInicialDoPersonagem);
                        System.out.println(personagem);
                    } while (frase.equals(personagem));
                    break;

                case 3:
                    util.formacaoDeTime();
                    break;

                case 5:
                    miniGame.jogoDePerguntas(opcaoDigitada);
                    break;

                default:
                    break;

            }

            System.out.println("\n\nDeseja voltar ao menu principal?\nDigite "
                    + "Sim, para voltar. E NÃO, para fechar o programa ");
            String continuar = leitor.nextLine().toUpperCase();

            while (!Objects.equals(continuar, "SIM")
                    && !Objects.equals(continuar, "NÃO")) {

                System.out.println("Não entendi. Digite SIM, para voltar ao Menu"
                        + " ou NÃO, para fechar o programa, "
                        + "por favor!");
                continuar = leitor.nextLine().toUpperCase();
            }

            if (!"SIM".equals(continuar)) {
                opcao = 4;
            }

        } while (opcao != 4);
    }
}
