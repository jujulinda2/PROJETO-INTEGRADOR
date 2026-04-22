package com.senai.infob.Projeto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.Services.CadastroService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    public CadastroService CadastroService;
@GetMapping("/listar")
    public List<Cadastro> listarTodos() {
            return CadastroService.listartodos();
        }
        
@PostMapping("/salvar")
    public Cadastro salvar (@RequestBody Cadastro cadastro) {    
        return CadastroService.salvar(cadastro);
    }


@PutMapping("/atualizar/{id}")
        public Cadastro atualizarCadastro(@PathVariable Integer id, @RequestBody Cadastro cadastro ) {
            return CadastroService.atualizarCadastro(cadastro, id);
    }
@GetMapping("/buscar/{id}")
    public Cadastro buscar (@PathVariable Integer id) {
    return CadastroService.getId(id);
}
}
