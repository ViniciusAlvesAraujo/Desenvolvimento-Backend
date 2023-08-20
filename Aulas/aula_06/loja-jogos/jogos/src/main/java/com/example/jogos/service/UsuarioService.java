package com.example.jogos.service;

import com.example.jogos.model.Usuario;
import com.example.jogos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario categoria){
        return usuarioRepository.save(categoria);
    }
}
