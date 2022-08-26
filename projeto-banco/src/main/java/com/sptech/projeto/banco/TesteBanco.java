/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class TesteBanco {

    public static void main(String[] args) {
        //Esse objeto guarda as configurações do BD
        Connection config = new Connection();
        
        JdbcTemplate template = new JdbcTemplate(config.getBatata());
        
        template.execute("DROP TABLE IF EXISTS pokemon");
        
        String criacaoTabelaPokemon = "CREATE TABLE pokemon("
                                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                                    + "nome VARCHAR(255),"
                                    + "tipo VARCHAR(255)"
                                    + ")";
        //Criando tabela
        template.execute(criacaoTabelaPokemon);
        
        //Inserindo registros na tabela pokemon
        String inserirPokemon = "INSERT INTO pokemon VALUES(null, ?, ?)";
        template.update(inserirPokemon, "Excadrill", "Steel");
        template.update(inserirPokemon, "Gardevoir", "Fairy");
        
        List<Pokemon> listaPokemon1 = template.query("select * from pokemon",
                new BeanPropertyRowMapper<>(Pokemon.class));
        // vai no banco fazer select e devolve o resultado. E mesmo que você
        // não printe, ele verifica se vale a pena continuar com a execução
        // do projeto
        //Apagando a tabela caso exista
        
        
      
            
        for (int i = 0; i < listaPokemon1.size(); i++) {
            if (listaPokemon1.get(i).getNome().equals("Excadrill")) {
                System.out.println("aeee");
            }
            
        }
        Integer num = 0;
        for (Pokemon itemPokemonDaVez : listaPokemon1) {
//            if (itemPokemonDaVez.getNome().equals("Excadrill")) {
//                System.out.println("cap");
//                
//            }
//            num ++;
//            System.out.println(num);
            System.out.println(itemPokemonDaVez);
            
        }
    }
}
