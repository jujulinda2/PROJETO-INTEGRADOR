package com.senai.infob.Projeto.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.infob.Projeto.Models.HomeAluno;
import com.senai.infob.Projeto.Repositories.HomeAlunoRepositorie;

@Service
public class HomeAlunoService {

@Autowired
public HomeAlunoRepositorie HomeAlunoRepositorie;


public String login(String email, String senha) {

    HomeAluno aluno = HomeAlunoRepositorie.findByEmail(email);
    if(aluno != null && senha.equals(aluno.getSenha())){
        return "login efetuado com sucesso";
    }
        return "falha ao encontrar o login";
}
    public HomeAluno salvar (HomeAluno homealuno, String senha){
    if (homealuno.getSenha().equals(senha)){
        return HomeAlunoRepositorie.save(homealuno);

    }
    return null;
}

   public HomeAluno atualizarHomeAlunoService(HomeAluno aluno, Integer id){
         HomeAluno e = HomeAlunoRepositorie.findById(id).get();
         if (e != null){
           aluno.setId(e.getId());
            HomeAlunoRepositorie.save(aluno);
            return aluno;
         }
         return null;
    }

       public HomeAluno getId(Integer id){
        return HomeAlunoRepositorie.findById(id).get(); }

     
}
