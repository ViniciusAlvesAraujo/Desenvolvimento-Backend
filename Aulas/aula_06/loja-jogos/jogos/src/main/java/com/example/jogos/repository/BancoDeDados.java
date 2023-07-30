package com.example.jogos.repository;

import com.example.jogos.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados(){
        this.jogos.add(new Jogo(1,"Beyond good and evil", "fdafdahjfsa", "https://staticctf.ubisoft.com/J3yJr34U2pZ2Ieem48Dwy9uqj5PNUQTn/6mK9g517yCW3zA8DUul0Fs/986d65c568a96e1c50d78aee4ae116f5/BGEHD_Hero_Image_-_Mobile.jpg", 35.00,false));
        this.jogos.add(new Jogo(2,"Super smash bros ultimate", "fdafdahjfsa", "https://images.eshop-prices.com/games/1566/480w.jpeg", 60.00,false));
        this.jogos.add(new Jogo(3,"Fire emblem engage", "fdafdahjfsa", "https://cdn.vox-cdn.com/thumbor/192yPvQy9WEwByNV0CVkuIFYn04=/0x0:1280x720/1000x1429/filters:focal(640x360:641x361)/cdn.vox-cdn.com/uploads/chorus_asset/file/24364343/2023011319381400_C71F2BA23713B0380A896115D1AD4717.jpg", 60.00,false));
    }

    public List<Jogo> findAll(){
        return jogos;
    }
    public Jogo save(Jogo jogo){
        for (Jogo jogoNaLista : jogos){
            if (jogo.getId() == jogoNaLista.getId()){
                return null;
            }
        }
        jogos.add(jogo);
        return jogo;
    }
}
