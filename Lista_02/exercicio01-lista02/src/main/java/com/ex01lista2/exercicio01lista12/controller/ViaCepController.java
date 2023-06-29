package com.ex01lista2.exercicio01lista12.controller;

import com.ex01lista2.exercicio01lista12.model.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/enderecos")

public class ViaCepController {
    @GetMapping("/{cep}")
    public Endereco obterCep(@PathVariable String cep){
        String url = "https://viacep.com.br/ws/"+ cep + "/json/";

        RestTemplate restTemplate = new RestTemplate();
        Endereco enderecos = restTemplate.getForObject(url, Endereco.class);
        return enderecos;
    }
}
