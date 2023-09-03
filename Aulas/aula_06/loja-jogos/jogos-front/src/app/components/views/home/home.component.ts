import { Component, OnInit } from '@angular/core';
import { Jogo } from 'src/app/model/jogo';
import { JogoService } from 'src/app/services/jogo.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  jogos: Jogo[] = [];

  constructor(private jogoService: JogoService){}
  ngOnInit(): void {
    this.fillJogos();
  }
    fillJogos(){
      this.jogoService.getJogos().subscribe(resposta => {
        console.log(resposta)
        this.jogos = resposta;
      })
    }
}


