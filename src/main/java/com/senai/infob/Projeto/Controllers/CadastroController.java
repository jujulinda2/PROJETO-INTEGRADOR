package com.senai.infob.Projeto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.Models.Cadastro;
import com.senai.infob.Projeto.Services.CadastroService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    public CadastroService cadastroService;
@GetMapping("/listar")
    public List<Cadastro> listarTodos() {
            return cadastroService.listartodos();
        }
        
@PostMapping("/salvar")
    public Cadastro salvar (@RequestBody Cadastro cadastro, @RequestParam String senha) {    
        return cadastroService.salvar(cadastro,senha);
    }


@PutMapping("/atualizar/{id}")
        public Cadastro atualizarCadastro(@PathVariable Integer id, @RequestBody Cadastro cadastro ) {
            return cadastroService.atualizarCadastro(cadastro, id);
    }
@GetMapping("/buscar/{id}")
    public Cadastro buscar (@PathVariable Integer id) {
    return cadastroService.getId(id);
}


    
}
