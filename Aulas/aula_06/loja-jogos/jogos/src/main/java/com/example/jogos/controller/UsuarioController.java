package com.example.jogos.controller;

import com.example.jogos.model.Usuario;
import com.example.jogos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getAll());
    }

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
    }
}
