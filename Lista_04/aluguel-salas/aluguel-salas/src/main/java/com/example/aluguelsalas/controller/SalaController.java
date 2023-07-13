package com.example.aluguelsalas.controller;

import com.example.aluguelsalas.model.Sala;
import com.example.aluguelsalas.repository.BancoDeDados;
import com.example.aluguelsalas.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")

public class SalaController {

    @Autowired
    public SalaService salaService;

    @GetMapping
    public List<Sala> getAll(){
        return salaService.getAll();
    }

    @PutMapping
    public String atualizar(@RequestBody Sala sala){
        return salaService.alugar(sala);
    }

    @PostMapping
    public String adicionarSala(Sala sala){
        return salaService.adicionarSala(sala);
    }
}
