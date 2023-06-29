package com.exercicio01lista01.ex01lista01.controller;

import com.exercicio01lista01.ex01lista01.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();
    public ProdutoController(){
        produtos.add(new Produto(10001234,"Fone de ouvido",30.50));
        produtos.add(new Produto(10001244,"Carregador",40.00));
        produtos.add(new Produto(10001265,"Capinha de celular",20.00));
    }
    @GetMapping
    public List<Produto> getAll(){
        return produtos;
    }

    @GetMapping("/{codigoDeBarras}")
    public Produto retornaProduto(@PathVariable int codigoDeBarras){
        for (Produto produto : produtos){
            if(produto.getCodigoDeBarras() == codigoDeBarras){
                return produto;
            }
        }
        return null;
    }

    @PostMapping
    public String saveProduto (@RequestBody Produto produto){
        for (Produto novoProduto : produtos){
            if(produto.getCodigoDeBarras() == novoProduto.getCodigoDeBarras()){
                return "Produto já existente";
            }
        }
        this.produtos.add(produto);
        return "O produto " + produto.getNome() + "foi cadastrado com sucesso!";
    }
}
