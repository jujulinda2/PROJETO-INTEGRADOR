package com.senai.infob.Projeto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.senai.infob.Projeto.Services.LoginService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    public LoginService LoginService;

    @PostMapping("/salvar")
    public Login salvar (@RequestBody Login Login, @RequestParam String senha) {    
        return LoginService.save(Login, senha);
    }


    @PostMapping("/login")
    public String login(@RequestParam String id, @RequestParam String senha){
    return LoginService.login(id, senha);
    }
    @PutMapping("/atualizar/{id}")
        public Login  atualizarHomeLogin(@PathVariable Integer id, @RequestBody Login Login) {
            return LoginService.atualizar(LoginService(Login, id));
        }

    @GetMapping("/buscar/{id}")
        public Login buscar (@PathVariable Integer id) {
            return LoginService.getId(id);
        }
}