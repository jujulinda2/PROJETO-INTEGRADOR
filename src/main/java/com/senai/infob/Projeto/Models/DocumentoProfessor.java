package com.senai.infob.Projeto.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="documento_professor")
public class DocumentoProfessor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "professor_id")
    private Integer professorId;

    @Column(name="documento_url")
    private String documentoUrl;

    @Column(name = "data_envio")
    private LocalDateTime dataEnvio;

    public DocumentoProfessor() {
    }

    public DocumentoProfessor(Integer id, Integer professorId, String documentoUrl, LocalDateTime dataEnvio) {
        this.id = id;
        this.professorId = professorId;
        this.documentoUrl = documentoUrl;
        this.dataEnvio = dataEnvio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public String getDocumentoUrl() {
        return documentoUrl;
    }

    public void setDocumentoUrl(String documentoUrl) {
        this.documentoUrl = documentoUrl;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

 
    
}
