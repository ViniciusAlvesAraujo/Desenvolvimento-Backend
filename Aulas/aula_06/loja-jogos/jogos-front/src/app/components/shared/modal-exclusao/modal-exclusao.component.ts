import { Component, OnInit } from '@angular/core';
import { Jogo } from 'src/app/model/jogo';
import { JogoService } from 'src/app/services/jogo.service';

@Component({
  selector: 'app-modal-exclusao',
  templateUrl: './modal-exclusao.component.html',
  styleUrls: ['./modal-exclusao.component.css']
})
export class ModalExclusaoComponent implements OnInit{
  jogoASerExcluido!: Jogo;

  constructor(private jogoService: JogoService) { }

  ngOnInit(): void {
    this.jogoService.jogoASerExcluido$.subscribe((jogo) => {
      this.jogoASerExcluido = jogo;
    })
  }

  excluirJogo(){
    this.jogoService.deletarJogo(this.jogoASerExcluido.id)
  }

}
