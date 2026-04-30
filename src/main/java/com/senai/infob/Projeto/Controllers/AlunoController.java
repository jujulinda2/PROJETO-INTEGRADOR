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
import com.senai.infob.Projeto.Models.Aluno;
import com.senai.infob.Projeto.Services.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    public AlunoService homeAlunoService;

    @PostMapping("/salvar")
    public Aluno salvar (@RequestBody Aluno aluno, @RequestParam String senha) {    
        return homeAlunoService.salvar(aluno,senha);
    }

    @PostMapping("/login")
    public String login
    (@RequestParam String email, @RequestParam String senha)
    {
    return homeAlunoService.login(email, senha);
    }

    @PutMapping("/atualizar/{id}")
        public Aluno  atualizarHomeAluno
        (@PathVariable Integer id, @RequestBody Aluno aluno) 
        {
           return AlunoService.atualizar(id, aluno);
        }


    @GetMapping("/buscar/{id}")
        public Aluno buscar (@PathVariable Integer id) {
            return homeAlunoService.getId(id);
        }
}
