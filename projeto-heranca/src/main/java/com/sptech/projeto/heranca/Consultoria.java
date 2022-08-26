/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.heranca;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Consultoria {
    
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }
    
    //existePorNome(): recebe o nome de um desenvolvedor e verifica se ele existena
    //consultoria, se encontrado retornar true, caso contrario retornar false
    
    public Boolean existePorNome(String nome){
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
    
    //contratar(): recebe um desenvolvedor e adiciona na consultoria, exiba
    //a frase“Sem vagas disponíveis!” caso as vagas estejam esgotadas.
    public void contratar(Desenvolvedor desenvolvedor){
        if (this.vagas > 0) {
            for (Desenvolvedor desenvolvedorDaVez : desenvolvedores) {
                if (desenvolvedorDaVez.equals(desenvolvedor)) {
                    System.out.println("Gosta de trabaia em kkkkkk");
                    break;
                }
            }
            desenvolvedores.add(desenvolvedor);
            this.vagas--;
        } else {
            System.out.println("Sem vagas");
        }
    }
    
    public Integer getQuantidadeDesenvolvedores(){
        return desenvolvedores.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile(){
        Integer c = 0;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor instanceof DesenvolvedorMobile) {
                c++;
            }
        }
        return c;
    }
    
    public Double getTotalSalarios(){
        Double c = 0.0;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            c += desenvolvedor.getSalario();
        }
        return c;
    }
    //desenvolvedores buscarDesenvolvedorPorNome(): recebe um nome e busca
    //na listadedesenvolvedores, caso não encontrado retornar null
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor.getNome().equalsIgnoreCase(nome)) {
                return desenvolvedor;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Consultoria{");
        sb.append("nome=").append(nome);
        sb.append(", vagas=").append(vagas);
        sb.append(", desenvolvedores=").append(desenvolvedores);
        sb.append('}');
        return sb.toString();
    }
    
    
}