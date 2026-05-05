package com.senai.infob.Projeto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.senai.infob.Projeto.Models.Esportes;
import com.senai.infob.Projeto.Services.EsportesService;

@RestController
@RequestMapping("/Esportes")
public class EsportesController {

    @Autowired
    public EsportesService esportesService;

    @PostMapping("/salvar")
    public Esportes salvar(@RequestBody Esportes esportes, @RequestParam Integer id) {    
        return esportesService.salvar(esportes, id);
    }

    @GetMapping("/buscar/{id}")
    public Esportes buscar(@PathVariable Integer id) {
        return esportesService.getId(id);
    }

    @GetMapping("/listar")
    public List<Esportes> listarTodos() {
        return esportesService.listartodos();
    }
}