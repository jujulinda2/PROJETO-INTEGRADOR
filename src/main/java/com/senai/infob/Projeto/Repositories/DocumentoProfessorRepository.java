package com.senai.infob.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.Projeto.models.Agendamento;

@Repository
public interface DocumentoProfessorRepository extends JpaRepository<Agendamento, Integer>{
    
}

