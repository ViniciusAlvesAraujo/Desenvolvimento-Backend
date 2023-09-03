import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Jogo } from '../model/jogo';

@Injectable({
  providedIn: 'root'
})
export class JogoService {

  private rota: string = "http://localhost:8080/jogos"

  constructor(private httpClient: HttpClient) { }

  public getJogos(): Observable<Jogo[]>{
    return this.httpClient.get<Jogo[]>(this.rota)
  }

  public postJogo(jogo: Jogo): Observable<Jogo>{
    return this.httpClient.post<Jogo>(this.rota, jogo);
  }

  public favoritarjogo(id: number): Observable<Jogo> {
    return this.httpClient.put<Jogo>(this.rota + "/favoritar/" + id, null);
  }

  private jogoASerExcluidoSubject  = new BehaviorSubject<any>(null);
  jogoASerExcluido$ = this.jogoASerExcluidoSubject.asObservable();

  setJogoASerExcluido(jogo: any){
    this.jogoASerExcluidoSubject.next(jogo);
  }

  deletarJogo(id: number){
    console.log("Chamou Service Jogo")
    this.httpClient.delete("http://localhost:8080/jogos/" + id).subscribe();
    window.location.reload();
  }
}
