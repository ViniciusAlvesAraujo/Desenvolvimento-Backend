package com.example.lojagamesback.repository;

import com.example.lojagamesback.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados(){
        jogos.add(new Jogo(1, "Fire emblem Rekka no ken" , "RPG Tático", 60,"https://upload.wikimedia.org/wikipedia/en/thumb/e/e2/GBA_Fire_Emblem_Box.jpg/220px-GBA_Fire_Emblem_Box.jpg"));
        jogos.add(new Jogo(2, "Fire emblem Sealed swords" , "RPG Tático", 60,"https://serenesforest.net/wp-content/uploads/2016/02/fe6-wallpaper-boxart.jpg"));
        jogos.add(new Jogo(3, "Fire emblem Seacred stones" , "RPG Tático", 60,"https://upload.wikimedia.org/wikipedia/en/thumb/1/1e/Fire_Emblem_The_Sacred_Stones.JPG/220px-Fire_Emblem_The_Sacred_Stones.JPG"));
    }

    public List<Jogo> findAll(){
        return jogos;
    }
}
