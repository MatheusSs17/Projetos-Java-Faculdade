/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.banco;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Connection {
    private BasicDataSource batata;

    public Connection() {
        this.batata = new BasicDataSource();
        
        batata.setDriverClassName("org.h2.Driver");
        batata.setUrl("jdbc:h2:file:./meu_banco");
        batata.setUsername("sa");
        batata.setPassword("");
    }

    public BasicDataSource getBatata() {
        return batata;
    }

    public void setBatata(BasicDataSource batata) {
        this.batata = batata;
    }
     
    
}
