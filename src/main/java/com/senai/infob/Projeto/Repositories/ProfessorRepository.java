package com.senai.infob.Projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infob.Projeto.Models.Professor;

@Repository
public interface  ProfessorRepository extends JpaRepository<Professor, Integer>{
     @Query(value = "select * from professor where email = :email", nativeQuery = true)
    public boolean existsByEmail(String email);

        @Query(value = "select * from professor where email = :email", nativeQuery = true)
    public Professor findByEmail(String email);
    
}


