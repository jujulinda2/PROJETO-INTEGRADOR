package com.senai.infob.Projeto.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.Models.Esportes;
import com.senai.infob.Projeto.Services.EsportesService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
@RequestMapping("/Esportes")
public class EsportesController {
    @Autowired
    public EsportesService EsportesService;

    @PostMapping("/salvar")
    public Esportes salvar (@RequestBody Esportes Esportes, @RequestParam String senha) {    
        return EsportesService.salvar(Esportes,senha);
    }


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha){
    return EsportesService.login(email, senha);
    }
    @PutMapping("/atualizar/{id}")
        public Esportes atualizarEsportes(@PathVariable Integer id, @RequestBody Esportes Esportes) {
            return EsportesService.atualizarEsportes(Esportes, id);
        }

    @GetMapping("/buscar/{id}")
        public Esportes buscar (@PathVariable Integer id) {
            return EsportesService.getId(id);
        }
   
        
    
    }

