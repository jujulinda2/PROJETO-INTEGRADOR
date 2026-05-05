package com.senai.infob.Projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.Projeto.Models.Quadras;


@Repository
public interface QuadrasRepository extends JpaRepository< Quadras, Integer> {
    
}
