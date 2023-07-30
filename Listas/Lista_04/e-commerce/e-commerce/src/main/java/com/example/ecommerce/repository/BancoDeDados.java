package com.example.ecommerce.repository;

import com.example.ecommerce.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados(){
        cosmeticos.add(new Cosmetico(1, "Sabonete", new BigDecimal(30)));
        cosmeticos.add(new Cosmetico(2, "Shampoo", new BigDecimal(50)));
        cosmeticos.add(new Cosmetico(3, "Condicionador", new BigDecimal(60)));
    }

    public List<Cosmetico> findAll(){
        return cosmeticos;
    }
    public String save(Cosmetico novoCosmetico){
        for(Cosmetico cosmetico : cosmeticos){
            if (novoCosmetico.getId() != cosmetico.getId() ) {
                this.cosmeticos.add(novoCosmetico);
                return "O Cosmético " + novoCosmetico.getNome() + " foi adicionado no banco de dados";
            }
        }
        return "O cosmético já existe no banco de dados.";
    }

    public String delete(int id){
        for(Cosmetico cosmetico : cosmeticos){
            if(cosmetico.getId() == id){
                String mensagem = "Cosmético " + cosmetico.getNome() + " foi removido com sucesso!";
                cosmeticos.remove(cosmetico);
                return mensagem;
            }
        }
        return "Cosmético inexistente.";
    }

}
