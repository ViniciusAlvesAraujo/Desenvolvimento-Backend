package com.example.lojagamesback.service;

import com.example.lojagamesback.model.Jogo;
import com.example.lojagamesback.repository.BancoDeDados;
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
}
