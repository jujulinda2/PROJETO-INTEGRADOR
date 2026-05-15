package com.senai.infob.Projeto.models;

import java.time.LocalDateTime;

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
    private LocalDateTime dataHoraInicio;
    
    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;

    @Column(name = "aluno_id")
    private Integer alunoId;

    @Column(name = "quadra_id")
    private Integer quadraId;

    @Column(name = "professor_id")
    private Integer professorId;

    @Column(name = "esportes_id")
    private Integer esportesId;

    @Column(name = "status")
    private String status;

    public Agendamento() {
    }

    public Agendamento(Integer id, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, Integer alunoId,
            Integer quadraId, Integer professorId, Integer esportesId, String status) {
        this.id = id;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.alunoId = alunoId;
        this.quadraId = quadraId;
        this.professorId = professorId;
        this.esportesId = esportesId;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public Integer getQuadraId() {
        return quadraId;
    }

    public void setQuadraId(Integer quadraId) {
        this.quadraId = quadraId;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public Integer getEsportesId() {
        return esportesId;
    }

    public void setEsportesId(Integer esportesId) {
        this.esportesId = esportesId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    
}
