
package com.senai.infob.Projeto.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "esportes")
public class Esportes {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_hora_aula")
    private LocalDateTime data_hora_aula;

    public Esportes() {
    }

    public Esportes(Integer id, String nome, LocalDateTime data_hora_aula) {
        this.id = id;
        this.nome = nome;
        this.data_hora_aula = data_hora_aula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData_hora_aula() {
        return data_hora_aula;
    }

    public void setData_hora_aula(LocalDateTime data_hora_aula) {
        this.data_hora_aula = data_hora_aula;
    }

    //teste


}
