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

    public Agendamento() {
    }

    public Agendamento(Integer id, Timestamp data_hora_inicio, Timestamp data_hora_fim, Integer aluno_id,
            Integer quadra_id, Integer professor_id, Integer esportes_id) {
        this.id = id;
        Data_hora_inicio = data_hora_inicio;
        Data_hora_fim = data_hora_fim;
        this.aluno_id = aluno_id;
        this.quadra_id = quadra_id;
        this.professor_id = professor_id;
        this.esportes_id = esportes_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getData_hora_inicio() {
        return Data_hora_inicio;
    }

    public void setData_hora_inicio(Timestamp data_hora_inicio) {
        Data_hora_inicio = data_hora_inicio;
    }

    public Timestamp getData_hora_fim() {
        return Data_hora_fim;
    }

    public void setData_hora_fim(Timestamp data_hora_fim) {
        Data_hora_fim = data_hora_fim;
    }

    public Integer getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(Integer aluno_id) {
        this.aluno_id = aluno_id;
    }

    public Integer getQuadra_id() {
        return quadra_id;
    }

    public void setQuadra_id(Integer quadra_id) {
        this.quadra_id = quadra_id;
    }

    public Integer getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(Integer professor_id) {
        this.professor_id = professor_id;
    }

    public Integer getEsportes_id() {
        return esportes_id;
    }

    public void setEsportes_id(Integer esportes_id) {
        this.esportes_id = esportes_id;
    }

}
