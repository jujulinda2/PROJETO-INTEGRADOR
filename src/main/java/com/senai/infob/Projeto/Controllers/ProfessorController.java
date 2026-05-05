package com.senai.infob.Projeto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.senai.infob.Projeto.Models.Professor;
import com.senai.infob.Projeto.Services.ProfessorService;

@RestController
@RequestMapping("/Professor")
public class ProfessorController {

    @Autowired
    public ProfessorService professorService;

    @PostMapping("/salvar")
    public Professor salvar(@RequestBody Professor professor, @RequestParam String senha) {        
        return professorService.salvar(professor, senha);
    }


    @PutMapping("/atualizar/{id}")
    public Professor atualizarProfessor(@PathVariable Integer id, @RequestBody Professor professor) {
        return professorService.atualizarProfessor(professor, id);
    }

    @GetMapping("/buscar/{id}")
    public Professor buscar(@PathVariable Integer id) {
        return professorService.getId(id);
    }

    @DeleteMapping("/delete/{id}") 
    public String deletar(@PathVariable Integer id) {
        boolean deletou = professorService.delete(id);

        if (deletou) {
            return "Professor removido com sucesso";
        }
        return "Falha ao remover o professor";
    }

    @GetMapping("/listar")
    public List<Professor> listarTodos() {
        return professorService.listartodos();
    }
}