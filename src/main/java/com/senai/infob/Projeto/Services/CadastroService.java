package com.senai.infob.Projeto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.senai.infob.Projeto.Models.Cadastro;
import com.senai.infob.Projeto.Repositories.CadastroRepository;

@Service
  public class CadastroService {
    @Autowired
    public CadastroRepository cadastroRepository;

 public String login(Integer id, String senha) {
   Cadastro cadastro = cadastroRepository.findById(id).get();
    if(cadastro != null && senha.equals(cadastro.getSenha())){
        return "login efetuado com sucesso";
    }
    return "falha ao encontrar o login";
    }
 public Cadastro salvar (Cadastro cadastro, String senha){
    if (cadastro.getSenha().equals(senha)){
        return cadastroRepository.save(cadastro);

    }
    return null;
    }
  public boolean  delete(Integer id) {
      Cadastro cadastro = cadastroRepository.findById(id).get();
        if(cadastro != null) {
        cadastroRepository.deleteById(id);
        return true;
    }
    return false;
    }
  public Cadastro getId(Integer id){
        return cadastroRepository.findById(id).get(); 
    }

  public Cadastro atualizarCadastro(Cadastro cadastro, Integer id){
        Cadastro e = getId(id);
         if (e != null){cadastro.setId(id);
           cadastroRepository.save(cadastro);
         }
    
         return null;
    }
  public List<Cadastro> listartodos(){
       return cadastroRepository.findAll();
    }  

}
