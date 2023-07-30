package com.example.ecommerce.controller;

import com.example.ecommerce.model.Cosmetico;
import com.example.ecommerce.service.CosmeticosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
public class CosmeticoController {

    @Autowired
    private CosmeticosService cosmeticosService;

    @GetMapping
    public List<Cosmetico> getAll(){
        return cosmeticosService.getAll();
    }

    @GetMapping("/{id}")
    public Cosmetico getById(@PathVariable int id){
       return cosmeticosService.getById(id);
    }

    @PostMapping
    public String save(@RequestBody Cosmetico cosmetico){
        return cosmeticosService.save(cosmetico);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return cosmeticosService.delete(id);
    }


}
