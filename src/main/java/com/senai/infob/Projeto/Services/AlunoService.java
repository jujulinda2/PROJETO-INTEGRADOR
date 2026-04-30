package com.senai.infob.Projeto.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.infob.Projeto.Models.Aluno;
import com.senai.infob.Projeto.Repositories.AlunoRepository;

@Service
public class AlunoService {

public String login(String email, String senha) {

    Aluno aluno = AlunoRepository.findByEmail(email);
    if(aluno != null && senha.equals(aluno.getSenha())){
        return "login efetuado com sucesso";
    }
        return "falha ao encontrar o login";
}
    public Aluno salvar (Aluno homealuno, String senha){
    if (homealuno.getSenha().equals(senha)){
        return alunoRepository.save(homealuno);

    }
    return null;
}

   public Aluno atualizarHomeAlunoService(Aluno aluno, Integer id){
         Aluno e = alunoRepository.findById(id).get();
         if (e != null){
           aluno.setId(e.getId());
            alunoRepository.save(aluno);
            return aluno;
         }
         return null;
    }

       public Aluno getId(Integer id){
        return alunoRepository.findById(id).get(); }

     
}
