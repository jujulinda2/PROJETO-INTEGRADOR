package com.senai.infob.Projeto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.senai.infob.Projeto.Models.Professor;
import com.senai.infob.Projeto.Repositories.ProfessorRepository;


public class ProfessorService {
@Autowired
    public ProfessorRepository professorRepository;

  public String professor(String email, String senha) {
        if (professorRepository.existsByEmail(email)) {
            Professor professor = professorRepository.findByEmail(email);
            if (senha.equals(professor.getSenha())) {
                return "Login efetuado com sucesso";
            }
        }
        return "Falha ao encontrar o login";
    }

 public Professor salvar (Professor professor, String senha){
    if (professor.getSenha().equals(senha)){
        return professorRepository.save(professor);

    }
    return null;
    }


  public boolean  delete(Integer id) {
      Professor professor= professorRepository.findById(id).get();
        if(professor != null) {
        professorRepository.deleteById(id);
        return true;
    }
    return false;
    }
  public Professor getId(Integer id){
        return professorRepository.findById(id).get(); 
    }

  public Professor atualizarProfessor(Professor professor, Integer id){
        Professor e = getId(id);
         if (e != null){professor.setId(id);
          professorRepository.save(professor);
         }
    
         return null;
    }
  public List<Professor> listartodos(){
       return professorRepository.findAll();
    }  

}
