package com.senai.infob.Projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.models.Professor;
import com.senai.infob.Projeto.repositories.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Long contarProfessor() {
        return professorRepository.count();
    }

    public Professor buscarProfessor(@NonNull Integer id) {
        return professorRepository.findById(id).get();
    }

    public List<Professor> listarProfessor() {
        return professorRepository.findAll();
    }

    public Boolean deletarProfessor(@NonNull Integer id) {
        if (professorRepository.existsById(id)) {
            professorRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Professor cadastrarProfessor(@NonNull Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor atualizarProfessor(@NonNull Integer id, Professor professor) {
        Professor professorRecuperado = buscarProfessor(id);
        if(professorRecuperado != null){
            professorRecuperado.setId(id);
            if(professor.getId() != null){
                professorRecuperado.setId(professor.getId());
            }
            if(professor.getId() != null){
                professorRecuperado.setId(professor.getId());
            }
            return professorRepository.save(professorRecuperado);
        }
        return null;
    }

}
