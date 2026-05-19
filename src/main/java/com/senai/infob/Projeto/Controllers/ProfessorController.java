package com.senai.infob.Projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.models.Professor;
import com.senai.infob.Projeto.services.ProfessorService;



@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

     @GetMapping("/contar-professor")
    public Long contarProfessor(@RequestParam String param) {
        return professorService.contarProfessor();
    }
    

    @GetMapping("/buscar-professor/{id}")
    public Professor buscarProfessor(@PathVariable Integer id){ {
        return professorService.buscarProfessor(id);
    }
    }

    @GetMapping("/listar-Professors")
    public List<Professor> listarProfessor(){
        return professorService.listarProfessor();
    }

    @DeleteMapping("/deletar-Professor/{id}")
    public String deletarProfessor(@PathVariable Integer id){
        if(professorService.deletarProfessor(id)){
            return "Professor removido com sucesso!";
        }
        return "Não foi possível remover o Professor!";
    }
    
    @PostMapping("/salvar-Professor")
    public Professor cadastrarProfessor(@RequestBody Professor Professor) {
        return professorService.cadastrarProfessor(Professor);
    }

    @PutMapping("/atualizar-Professor/{id}")
    public String atualizarProfessor(@PathVariable Integer id, @RequestBody Professor Professor) {
        if(professorService.atualizarProfessor(id, Professor) != null){
            return "Professor atualizado com sucesso!";
        }
        return "Não foi possível atualizar o Professor!";
    }

}