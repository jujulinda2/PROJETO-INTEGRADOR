package com.senai.infob.Projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.Projeto.Models.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer>{
    
}

