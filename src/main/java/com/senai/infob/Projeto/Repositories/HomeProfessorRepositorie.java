package com.senai.infob.Projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.Projeto.Models.HomeProfessor;

@Repository
public interface  HomeProfessorRepositorie extends JpaRepository<HomeProfessor, Integer>{ 
}

