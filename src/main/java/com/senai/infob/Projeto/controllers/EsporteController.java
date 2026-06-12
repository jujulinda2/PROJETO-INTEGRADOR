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

import com.senai.infob.Projeto.models.Esporte;
import com.senai.infob.Projeto.services.EsporteService;



@RestController
@RequestMapping("/esporte")
public class EsporteController {

    @Autowired
    private EsporteService esporteService;


@GetMapping("/contar-esporte")
    public Long contarEsporte() {
        return esporteService.contarEsporte();
    }
    

    @GetMapping("/buscar-esporte/{id}")
    public Esporte buscarEsporte(@PathVariable @NonNull Integer id){ {
        return esporteService.buscarEsporte(id);
    }
    }

    @GetMapping("/listar-Esportes")
    public List<Esporte> listarEsportes(){
        return esporteService.listarEsportes();
    }

    @DeleteMapping("/deletar-Esporte/{id}")
    public String deletarEsporte(@PathVariable @NonNull Integer id){
        if(esporteService.deletarEsporte(id)){
            return "Esporte removido com sucesso!";
        }
        return "Não foi possível remover o Esporte!";
    }
    
    @PostMapping("/salvar-Esporte")
    public Esporte cadastrarEsporte(@RequestBody @NonNull Esporte esporte) {
        return esporteService.cadastrarEsporte(esporte);
    }

    @PutMapping("/atualizar-Esporte/{id}")
    public String atualizarEsporte(@PathVariable @NonNull Integer id, @RequestBody Esporte Esporte) {
        if(esporteService.atualizarEsporte(id, Esporte) != null){
            return "Esporte atualizado com sucesso!";
        }
        return "Não foi possível atualizar o Esporte!";
    }


}