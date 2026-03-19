package com.senai.infob.Projeto.Models;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agendamento")
public class Agendamento {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "data_hora_inicio")
    private Timestamp Data_hora_inicio;
    
    @Column(name = "data_hora_fim")
    private Timestamp Data_hora_fim;

    @Column(name = "aluno_id")
    private Integer aluno_id;

    @Column(name = "quadra_id")
    private Integer quadra_id;

    @Column(name = "professor_id")
    private Integer professor_id;

    @Column(name = "esportes_id")
    private Integer esportes_id;

}
