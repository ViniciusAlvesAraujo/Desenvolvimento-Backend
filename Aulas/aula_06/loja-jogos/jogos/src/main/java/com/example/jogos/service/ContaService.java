package com.example.jogos.service;

import com.example.jogos.model.Conta;
import com.example.jogos.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public List<Conta> getAll(){
        return contaRepository.findAll();
    }

    public Conta save(Conta categoria){
        return contaRepository.save(categoria);
    }
}
