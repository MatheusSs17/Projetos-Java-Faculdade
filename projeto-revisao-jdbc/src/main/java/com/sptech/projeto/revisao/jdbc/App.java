/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.revisao.jdbc;

import java.util.List;
import javax.xml.transform.Templates;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class App {
    
    public static void main(String[] args) {
        
        Connection cnc = new Connection();
        JdbcTemplate template = new JdbcTemplate(cnc.getBatata());
        
        template.execute("DROP TABLE IF EXISTS jogo");
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("CREATE TABLE IF NOT EXISTS jogo (");
        builder.append("id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, ");
        builder.append("nome VARCHAR(200), ");
        builder.append("genero VARCHAR(200) ");
        builder.append("); ");
        
        
        template.execute(builder.toString());
        
        template.update("INSERT INTO jogo VALUES (null, ?, ?)", "Sonic", "Plataforma");
        
        template.update("INSERT INTO jogo VALUES (null, ?, ?)", "Bloodborne", "Souls-Like");
        
        template.update("INSERT INTO jogo VALUES (null, ?, ?)", "Crash Bandicoot", "Plataforma");
        
//        List jogos = template.queryForList("SELECT * FROM jogo");
//        
//        for (Object jogo : jogos) {
//            System.out.println(jogo.toString());
//        }

        List<Jogo> jogos = template.query("SELECT * FROM jogo;", new BeanPropertyRowMapper<>(Jogo.class));
        
        
        System.out.println("Query com Bean");
        for (Jogo jogo : jogos) {
            System.out.println(jogo.getNome());
        }
        
    }
    
    
    
}
