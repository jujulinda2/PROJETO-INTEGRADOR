package com.senai.infob.Projeto.Models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Aluno")
public class Aluno {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "datas")
    private LocalDate datas_aulas;

    public Aluno() {
    }

    public Aluno(Integer id, LocalDate datas_aulas) {
        this.id = id;
        this.datas_aulas = datas_aulas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDatas_aulas() {
        return datas_aulas;
    }

    public void setDatas_aulas(LocalDate datas_aulas) {
        this.datas_aulas = datas_aulas;
    }

}
