package com.example.jogos.controller;

import com.example.jogos.model.Jogo;
import com.example.jogos.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
@CrossOrigin ("*")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<Jogo>> getAll(){
        List<Jogo> jogos = jogoService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(jogoService.getAll());
    }

    @PostMapping
    public ResponseEntity<Jogo> save(@RequestBody Jogo jogoRecebido){
        Jogo jogoRetornado = jogoService.save(jogoRecebido);

        if(jogoRetornado == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(jogoRetornado);
    }

    @PutMapping("/favoritar/{id}")
    public ResponseEntity<Jogo> favoritar(@PathVariable int id){
        Jogo jogo = jogoService.favoritar(id);
        return ResponseEntity.status(HttpStatus.OK).body(jogo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable int id){
        jogoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
