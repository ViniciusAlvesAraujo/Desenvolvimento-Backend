package com.exercicio02lista01.ex02lista01.controller;

import com.exercicio02lista01.ex02lista01.model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")

public class JogoController {
    private List<Jogo> jogos = new ArrayList<>();

    public JogoController(){
        jogos.add(new Jogo(1, "GTA V", 12.49));
        jogos.add(new Jogo(1, "Three Kingooms", 35.99));
        jogos.add(new Jogo(1, "Dota 2", 9.99));
    }

    @GetMapping
    public List<Jogo> getAll(){
        return jogos;
    }

    @GetMapping("/{id}")
    public Jogo jogoPeloId(@PathVariable int id){
        for (Jogo jogo : jogos){
            if (jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }

    @GetMapping("/menor-preco")
    public Jogo menorPreco(){
        int menorValor = 1000;
        int index = 0;
        for (int i = 0; i < jogos.size(); i++) {
            if(jogos.get(i).getPreco() < menorValor ){
                menorValor = (int) jogos.get(i).getPreco();
                index = i;
            }
        }
        return jogos.get(index);
    }

    @PostMapping
    public String saveJogo (@RequestBody Jogo jogo) {
        for (Jogo novoJogo : jogos) {
            if (jogo.getId() == novoJogo.getId()) {
                return "Jogo já existe";
            }
        }
        this.jogos.add(jogo);
        return "Jogo " + jogo.getNome() + " cadastrado com sucesso!";

    }
}
