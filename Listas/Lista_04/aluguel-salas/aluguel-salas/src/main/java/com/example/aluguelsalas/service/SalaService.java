package com.example.aluguelsalas.service;

import com.example.aluguelsalas.model.Sala;
import com.example.aluguelsalas.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    @Autowired
    public BancoDeDados bancoDeDados;

    public List<Sala> getAll(){
        return bancoDeDados.getFind();
    }

    public String alugar(Sala sala){
        return bancoDeDados.alugar(sala);
    }

    public String adicionarSala(Sala sala){
        return "Nosso salão só comporta 8 salas, verifique se temos " +
                "salas disponveis, ou espere até que um locatario finalize seu aluguel.";
    }

}
