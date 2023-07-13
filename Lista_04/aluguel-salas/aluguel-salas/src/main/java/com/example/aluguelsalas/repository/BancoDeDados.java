package com.example.aluguelsalas.repository;

import com.example.aluguelsalas.model.Sala;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Sala> salas = new ArrayList<>();

    public BancoDeDados(){
        salas.add(new Sala(1,true,"Alex"));
        salas.add(new Sala(2,false,""));
        salas.add(new Sala(3,false, ""));
        salas.add(new Sala(4,true,"Bruno"));
        salas.add(new Sala(5,true,"Alisson"));
        salas.add(new Sala(6,false,""));
        salas.add(new Sala(7,false,""));
        salas.add(new Sala(8,true,"Anna"));
    }

    public List<Sala> getFind(){
        return salas;
    }

    public String alugar(Sala novoAluguel){
       for (Sala sala : salas){
           if (sala.isEstaAlugada() == false){
               sala.setEstaAlugada(true);
               sala.setNomeLocatario(novoAluguel.getNomeLocatario());
               return "A sala foi locada com sucesso.";
           }
       }
       return "Não existem salas disponiveis no momento";
    }
}
