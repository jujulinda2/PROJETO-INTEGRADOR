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
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.models.Usuario;
import com.senai.infob.Projeto.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/contar-usuarios")
    public Long contarUsuarios() {
        return usuarioService.contarUsuarios();
    }
    

    @GetMapping("/buscar-usuarios/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id){ {
        return usuarioService.buscarUsuario(id);
    }
    }

    @GetMapping("/listar-Usuarios")
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }

    @DeleteMapping("/deletar-Usuario/{id}")
    public String deletarUsuario(@PathVariable Integer id){
        if(usuarioService.deletarUsuario(id)){
            return "Usuario removido com sucesso!";
        }
        return "Não foi possível remover o Usuario!";
    }
    
    @PostMapping("/salvar-Usuario")
    public Usuario cadastrarUsuario(@RequestBody Usuario Usuario) {
        return usuarioService.cadastrarUsuario(Usuario);
    }

    @PutMapping("/atualizar-Usuario/{id}")
    public String atualizarUsuario(@PathVariable Integer id, @RequestBody Usuario Usuario) {
        if(usuarioService.atualizarUsuario(id, Usuario) != null){
            return "Usuario atualizado com sucesso!";
        }
        return "Não foi possível atualizar o Usuario!";
    }
    
}
