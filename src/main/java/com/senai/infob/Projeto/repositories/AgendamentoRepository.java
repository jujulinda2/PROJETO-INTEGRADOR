package com.senai.infob.Projeto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.Projeto.models.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer>{
    List<Agendamento> findByQuadraId(Integer quadraId);
    
}


