/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Utilitarios {
   
    Scanner leitor = new Scanner(System.in);
    
    
    void calculoDeTrabalhoDaForcaVariavel(Integer alturaMaxima,
            Double distanciaPercorrida) {
        
        System.out.println("Em RWBY, os principais personagens se deslocam"
                + "usando armas de fogo para ganharem impulso.\n"
                + "Esse ganho de velocidade pode ser representado"
                + "matematicamente por Trabalho de Força Variável.");
        System.out.println("Digite a altura máxima a ser alcançada: ");
        alturaMaxima = leitor.nextInt();
        
        System.out.println("Digite a distância percorrida: ");
        distanciaPercorrida = leitor.nextDouble();
        
        Double trabalhoVariavel = alturaMaxima * distanciaPercorrida / 2;
        System.out.println(String.format("A energia usada para alcançar o objetivo"
                + " foi de %.2f Joules.", trabalhoVariavel));
        
    }
    
    String descricaoDoPersonagem(String letraInicialDoPersonagem) {
        String personagemEscolhido = null;
        
        if (null != letraInicialDoPersonagem) 
            switch (letraInicialDoPersonagem      ) {
            case "A":
                personagemEscolhido = " Adam Taurus era um personagem de RWBY.\n"
                        + " Anteriormente um trabalhador abusado para a Schnee"
                        + " Dust Company, e mais tarde o líder da filial Vale"
                        + " do White Fang,\n ele se tornou o Alto Líder do White"
                        + " Fang depois de assassinar o ex-líder Sienna Khan em"
                        + " um golpe,\n mas foi expulso do White Fang.";
                break;
            case "B":
                personagemEscolhido = " Blake Belladonna é uma das protagonistas"
                        + " de RWBY.\n Ela é uma caçadora e uma fauno,"
                        + " tendo sido treinada"
                        + " na extinta Beacon Academy.\n Sua arma de escolha"
                        + " é uma Variant Ballistic Chain Scythe,"
                        + " chamada Gambol Shroud.";
                break;
            case "C":
                personagemEscolhido = " Cinder Fall é a antagonista secundária"
                        + " de RWBY e o principal antagonista do Beacon Arc.\n"
                        + " Ela é membro do Círculo Interno de Salem e era"
                        + " a líder de sua própria facção.\n"
                        + " Ela também é a atual Dama do Outono (Fall Maiden).";
                break;
            case "D":
                personagemEscolhido = " Dew Gayl é um membro da Equipe NDGO.\n"
                        + " Dew e sua equipe lutaram contra o Team SSSN em uma"
                        + " partida do Vytal Festival Tournament";
                break;
            case "E":
                personagemEscolhido = " Emerald Sustrai é um personagem em RWBY.\n"
                        + " Ela era uma associada de Cinder Fall e ex-parceira"
                        + " de Mercury Black.\n Suas armas de escolha são"
                        + " Thief's Respite,\n um par de revólveres duplos com"
                        + " lâminas de foice dobráveis\n ​​que podem se tornar"
                        + " kusarigamas.";
                break;
            case "F":
                personagemEscolhido = " Flynt Coal é um estudante da Atlas"
                        + " Academy e líder do Time FNKI.\n Ele e Neon Katt"
                        + " participaram do Torneio do Festival Vytal"
                        + " contra Weiss Schnee e Yang Xiao Long.";
                break;
            case "G":
                personagemEscolhido = " Glynda Goodwitch é membro da equipe e"
                        + " atual diretora da Beacon Academy. ";
                break;
            case "H":
                personagemEscolhido = " Hazel Rainart foi um antagonista de"
                        + " grande apoio em RWBY.\n Ele era um associado de Salem"
                        + " e parte de seu círculo íntimo .";
                break;
            case "I":
                personagemEscolhido = " Ilia Amitola era originalmente um membro"
                        + " do White Fang encarregado de capturar\n Blake"
                        + " Belladonna para Adam Taurus e matar o resto de"
                        + " sua família, antes de Blake convencê-la a buscar"
                        + " redenção durante o confronto.\n Ela então ajuda Blake"
                        + " a frustrar os planos de Adam"
                        + " de destruir a Haven Academy com suas forças.";
                break;
            case "J":
                personagemEscolhido = " Jaune Arc é um caçador e ex-aluno da"
                        + " Beacon Academy.\n Ele é o líder e um dos membros"
                        + " restantes da Equipe JNPR e membro da Equipe RNJR.\n"
                        + " Sua arma de escolha é Crocea Mors, que consiste"
                        + " em uma espada e uma bainha que pode se expandir"
                        + " em um escudo.\n A arma foi transmitida em sua família"
                        + " por seu tataravô, que a usou para"
                        + " lutar na Grande Guerra.";
                break;
            case "K":
                personagemEscolhido = " Kali Belladonna é mãe de Blake"
                        + " Belladonna e\n esposa de Ghira Belladonna,"
                        + " o chefe do Menagerie ";
                break;
            case "L":
                personagemEscolhido = " O professor Leonardo Lionheart era o"
                        + " diretor da Haven Academy e membro do Conselho"
                        + " Mistral.\n Ele foi referido por Salem"
                        + " como um informante de sua organização.";
                break;
            case "M":
                personagemEscolhido = " Mercury Black é um antagonista em RWBY.\n"
                        + " Ele é um ex-associado de Cinder Fall e ex-parceiro"
                        + " de Emerald Sustrai.\n Suas armas de escolha são"
                        + " Talaria, um par de botas de espingarda"
                        + " de dois alcances.";
                break;
            case "N":
                personagemEscolhido = " Neopolitan, nascido Trivia Vanille e"
                        + " agora mais conhecida como Neo, é uma grande"
                        + " antagonista em RWBY.\n Ela era a parceira de"
                        + " Roman Torchwick, com os dois compartilhando um"
                        + " possível vínculo romântico próximo.\n Sua arma de"
                        + " escolha é chamada Hush, um guarda-sol"
                        + " com uma lâmina oculta.";
                break;
            case "O":
                personagemEscolhido = " O professor Ozpin era o diretor da"
                        + " Beacon Academy e uma encarnação de Ozma,\n"
                        + " o antigo guerreiro dedicado a proteger"
                        + " Remnant de Salem .";
                break;
            case "P":
                personagemEscolhido = " Pyrrha Nikos foi uma personagem de RWBY.\n"
                        + " Ela era uma estudante da agora extinta Beacon"
                        + " Academy e ex-membro da Equipe JNPR até seu"
                        + " falecimento.\n Sua arma de escolha, chamada Miló," 
                        + " era uma arma semelhante a uma lança vermelha e"
                        + " bronze que poderia\n se transformar em um rifle ou"
                        + " uma espada curta. Ela usou isso ao lado de um"
                        + " escudo chamado Akoúo̱,\n que se assemelhava"
                        + " a um hoplon clássico.";
                break;
            case "Q":
                personagemEscolhido = " Qrow Branwen é o irmão gêmeo mais novo"
                        + " de Raven Branwen,\n tio biológico de Yang Xiao"
                        + " Long e tio honorário de Ruby Rose."
                        + " A arma de escolha de Qrow é uma foice"
                        + " chamada Harbinger.\n Ele é um ex-membro da Tribo"
                        + " Branwen, bem como um ex-professor da Signal"
                        + " Academy.\n Em sua juventude, Qrow frequentou a"
                        + " Beacon Academy com sua irmã,\n e juntos eles estavam"
                        + " em uma equipe com Summer Rose\n e Taiyang Xiao Long,"
                        + " conhecida como Team STRQ .";
                break;
            case "R":
                personagemEscolhido = " Ruby Rose é a principal protagonista"
                        + " de RWBY.\n Ela é uma caçadora, tendo sido treinada"
                        + " na extinta Beacon Academy.\n A arma de sua escolha "
                        + " é uma Sniper-Scythe de alto calibre,\n conhecida"
                        + " como Crescent Rose, que ela mesma projetou.";
                break;
            case "S":
                personagemEscolhido = " Summer Rose era a mãe de Ruby Rose e"
                        + " era a líder do Team STRQ.\n Sua lápide está em um"
                        + " penhasco na Floresta Cliffside.";
                break;
            case "T":
                personagemEscolhido = "Tyrian Callows é um antagonista"
                        + " de grande apoio em RWBY.\n Um serial killer"
                        + " conhecido, ele é um associado de Salem e"
                        + " parte de seu círculo íntimo.";
                break;
            case "U":
                personagemEscolhido = "Umber Gorgoneion é um personagem de"
                        + " RWBY: Before the Dawn.\n Ela era uma estudante"
                        + " vinda da Shade Academy que foi designada para"
                        + " a Equipe FNDU\n depois que o Professor Theodore"
                        + " embaralhou as equipes e uma agente secreta da The Crown.";
                break;
            case "V":
                personagemEscolhido = "Velvet Scarlatina é uma fauno, ex-aluna"
                        + " da Beacon Academy e membro do Team CFVY.\n"
                        + " Sua arma de escolha é a Anesidora, uma câmera"
                        + " que pode produzir cópias de armas\n de luz dura"
                        + " depois de tirar fotos delas.";
                break;
            case "W":
                personagemEscolhido = "Weiss Schnee é uma das protagonistas de"
                        + " RWBY.\n Ela é uma caçadora, ex-aluna da extinta"
                        + " Beacon Academy e ex-herdeira da Schnee Dust"
                        + " Company.\n Sua arma de escolha é"
                        + " um Multi-Action Dust Rapier (MADR)"
                        + " chamado Myrtenaster .";
                break;
            case "Y":
                personagemEscolhido = "Yang Xiao Long é um dos protagonistas"
                        + " de RWBY.\n Ela é uma caçadora, tendo sido"
                        + " treinada na extinta Beacon Academy.\n Suas armas"
                        + " de escolha são um par de Manoplas de Tiro de"
                        + " Longo Alcance, Ember Celica.";
                break;
            case "Z":
                personagemEscolhido = "Zwei é o cachorro de estimação de Ruby"
                        + " Rose e Yang Xiao Long.";
                break;
            default:
                    
                    personagemEscolhido ="A opção escolhida não foi encontrada"
                            + ", por favor digite outra inicial!";
                break;
        }
        
        return personagemEscolhido;
    }
    
    List<Integer> contador = new ArrayList<Integer>();
   
    
    void formacaoDeTime() {
        
        String[] personagensSelecionados = {"Blake Belladonna", "Yang Xiao Long",
         "Weiss Schnee", "Raven Branwen", "Qrow Branwen", "Ruby Rose",
         "Emerald Sustrai", "Mercury Black", "Neopolitan",
         "Roman Torchwick", "James Ironwood", "Ozpin", "Salem"};
        
        
        Integer selecaoDeTime = null;
        String times = "";
        String nomeDoTime = "";
        contador.clear();
        System.out.println("Sua equipe é formada por...\n");
        
        for (int i = 0; i <= 3; i++) {
            
            selecaoDeTime = ThreadLocalRandom.current().nextInt(0,13);
            
           if (contador.contains(selecaoDeTime)) {
               
               i--;
               
           } else {
                
                contador.add(selecaoDeTime);
                times = personagensSelecionados[selecaoDeTime];
                nomeDoTime += personagensSelecionados[selecaoDeTime]
                        .substring(0,1);
                ;
                System.out.println("\t" + times);
                
            }
                    
        }
         
                System.out.println(String.format("\nO nome do seu time é %s",
                        nomeDoTime));
        
    }

    public Utilitarios() {
    }
    
    
    
    
    
    Integer selecaoDeOpcao(Integer opcaoSelecionada) {
        do {            
            System.out.println("Selecione uma opção: \n\n"
            + "1) Trabalho de Força Variável\n"
            + "2) Descrição de personagem\n"
            + "3) Seleção de Time\n"
            + "4) Sair\n"
            + "5) Jogo\n\n"
            + "Digite o número da opção correspondente: ");
            opcaoSelecionada = leitor.nextInt();
            
        } while (opcaoSelecionada != 1 && 
                opcaoSelecionada != 2 && 
                opcaoSelecionada != 3 && 
                opcaoSelecionada != 4 && 
                opcaoSelecionada != 5);
        
        return opcaoSelecionada;
    }
}