package com.senai.infob.Projeto.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.Repositories.HomeAlunoRepositorie;

@Service
public class HomeAlunoService {

@Autowired
public HomeAlunoRepositorie HomeAlunoRepositorie;


public String login(String email, String senha) {

    Aluno aluno = HomeAlunoRepositorie.findByEmail(email);
    if(aluno != null && senha.equals(aluno.getSenha())){
        return "login efetuado com sucesso";
    }
        return "falha ao encontrar o login";
}
    public Aluno salvar (Aluno aluno, String senha){
    if (aluno.getSenha().equals(senha)){
        return HomeAlunoRepositorie.save(aluno);

    }
    return null;
}

   public Aluno atualizarHomeAlunoService(Aluno aluno, Integer id){
         Aluno e = HomeAlunoRepositorie.findById(id).get();
         if (e != null){
           aluno.setId(e.getId());
            HomeAlunoRepositorie.save(aluno);
            return aluno;
         }
         return null;
    }

       public Aluno getId(Integer id){
        return HomeAlunoRepositorie.findById(id).get(); }

     
}
