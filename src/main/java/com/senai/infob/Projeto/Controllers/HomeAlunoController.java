package com.senai.infob.Projeto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.senai.infob.Projeto.Models.HomeAluno;
import com.senai.infob.Projeto.Services.HomeAlunoService;

@RestController
@RequestMapping("/aluno")
public class HomeAlunoController {
    @Autowired
    public HomeAlunoService homeAlunoService;

    @PostMapping("/salvar")
    public HomeAluno salvar (@RequestBody HomeAluno aluno, @RequestParam String senha) {    
        return homeAlunoService.salvar(aluno,senha);
    }

    @PostMapping("/login")
    public String login
    (@RequestParam String email, @RequestParam String senha)
    {
    return homeAlunoService.login(email, senha);
    }

    @PutMapping("/atualizar/{id}")
        public HomeAluno  atualizarHomeAluno
        (@PathVariable Integer id, @RequestBody HomeAluno aluno) 
        {
           return HomeAlunoService.atualizar(id, aluno);
        }


    @GetMapping("/buscar/{id}")
        public HomeAluno buscar (@PathVariable Integer id) {
            return homeAlunoService.getId(id);
        }
}
