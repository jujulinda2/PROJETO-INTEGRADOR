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
import com.senai.infob.Projeto.Services.ProfessorService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Professor")
public class ProfessorController {
    @Autowired
    public ProfessorService homeProfessorService;

    @PostMapping("/salvar")
    public Professor salvar (@RequestBody Professor professor, @RequestParam String senha) {    
        return ProfessorService.save(professor, senha);
    }


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha){
    return ProfessorService.login(email, senha);
    }
    @PutMapping("/atualizar/{id}")
        public Professor  atualizarHomeProfessor(@PathVariable Integer id, @RequestBody Professor Professor) {
            return ProfessorService.atualizar(HomeProfessorService(Professor, id));
        }

    @GetMapping("/buscar/{id}")
        public Professor buscar (@PathVariable Integer id) {
            return ProfessorService.getId(id);
        }
    @DeleteMapping("/delete/{id}") 
        public String deletar(@PathVariable Integer id) {
        boolean deletou = EsportesService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
        }

    @GetMapping("/listar")
        public List<Professor> listarTodos() {
            return EsportesService.listartodos();
        }
}