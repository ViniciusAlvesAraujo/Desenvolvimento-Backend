package com.example.jogos.service;

import com.example.jogos.model.Jogo;
import com.example.jogos.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Jogo> getAll(){
        return bancoDeDados.findAll();
    }

    public Jogo save(Jogo jogo){
        return bancoDeDados.save(jogo);
    }
}
