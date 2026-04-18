package com.senai.infob.Projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.Projeto.Models.Cadastro;

@Repository
public interface CadastroRepositorie extends JpaRepository<Cadastro, Integer>{ 
}