package com.senai.infob.Projeto.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.Models.Cadastro;
import com.senai.infob.Projeto.Repositories.CadastroRepositorie;

@Service
public class CadastroService {
    @Autowired
    public CadastroRepositorie CadastroRepositorie;

 public String login(String email, String senha) {
   Cadastro cadastro = CadastroRepositorie.findByEmail(email);
    if(cadastro != null && senha.equals(cadastro.getSenha())){
        return "login efetuado com sucesso";
    }
    return "falha ao encontrar o login";
    }
 public Cadastro salvar (Cadastro cadastro, String senha){
    if (cadastro.getSenha().equals(senha)){
        return CadastroRepositorie.save(cadastro);

    }
    return null;
    }
    public boolean  delete(Integer id) {
      Cadastro cadastro = CadastroRepositorie.findById(id).get();
        if(cadastro != null) {
        CadastroRepositorie.deleteById(id);
        return true;
    }
    return false;
    }
    public Cadastro getId(Integer id){
        return CadastroRepositorie.findById(id).get(); 
    }

    public Cadastro atualizarCadastro(Cadastro cadastro, Integer id){
        Cadastro e = getId(id);
         if (e != null){cadastro.setId(id);
           CadastroRepositorie.save(cadastro);
         }
    
         return null;
    }

}
