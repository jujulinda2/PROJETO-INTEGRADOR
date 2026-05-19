package com.senai.infob.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.senai.infob.Projeto.models.DocumentoProfessor;

@Repository
public interface DocumentoProfessorRepository extends JpaRepository<DocumentoProfessor, Integer>{
    
}

