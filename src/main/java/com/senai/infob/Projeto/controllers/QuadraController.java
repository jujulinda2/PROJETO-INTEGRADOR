package com.senai.infob.Projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.models.Quadra;
import com.senai.infob.Projeto.services.QuadraService;

@RestController
@RequestMapping("/quadra")
public class QuadraController {
    
    @Autowired
    private QuadraService quadraService;

    @GetMapping("/contar-quadra")
    public Long contarQuadra() {
        return quadraService.contarQuadra();
    }
    

    @GetMapping("/buscar-Quadras/{id}")
    public Quadra buscarQuadra(@PathVariable @NonNull Integer id){ {
        return quadraService.buscarQuadra(id);
    }
    }

    @GetMapping("/listar-Quadras")
    public List<Quadra> listarQuadras(){
        return quadraService.listarQuadras();
    }

    @DeleteMapping("/deletar-Quadra/{id}")
    public String deletarQuadra(@PathVariable @NonNull Integer id){
        if(quadraService.deletarQuadra(id)){
            return "Quadra removida com sucesso!";
        }
        return "Não foi possível remover a Quadra!";
    }
    
    @PostMapping("/salvar-Quadra")
    public Quadra cadastrarQuadra(@RequestBody @NonNull Quadra Quadra) {
        return quadraService.cadastrarQuadra(Quadra);
    }

    @PutMapping("/atualizar-Quadra/{id}")
    public String atualizarQuadra(@PathVariable @NonNull Integer id, @RequestBody Quadra Quadra) {
        if(quadraService.atualizarQuadra(id, Quadra) != null){
            return "Quadra atualizada com sucesso!";
        }
        return "Não foi possível atualizar a Quadra!";
    }
}
