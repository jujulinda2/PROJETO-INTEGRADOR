package com.senai.infob.Projeto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.Models.Usuario;
import com.senai.infob.Projeto.Services.HomeAlunoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/aluno")
public class HomeAlunoController {
    @Autowired
    public HomeAlunoService HomeAlunoService;

    @PostMapping("/salvar")
    public Usuario salvar (@RequestBody Aluno aluno, @RequestParam String senha) {    
        return HomeAlunoService.save(aluno,senha);
    }


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha){
    return HomeAlunoService.login(email, senha);
    }
    @PutMapping("/atualizar/{id}")
        public Usuario atualizarHomeAluno(@PathVariable Integer id, @RequestBody Aluno aluno) {
            return HomeAlunoService.atualizar(HomeAlunoService(aluno, id));
        }

    @GetMapping("/buscar/{id}")
        public Usuario buscar (@PathVariable Integer id) {
            return HomeAlunoService.getId(id);
        }
}
