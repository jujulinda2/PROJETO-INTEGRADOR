package com.senai.infob.Projeto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.Projeto.models.Professor;

@Repository
public interface  ProfessorRepository extends JpaRepository<Professor, Integer>{
    List<Professor> findByStatusVerificacao(String statusVerificacao);

}


