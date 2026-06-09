package com.senai.infob.Projeto.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="documento_professor")
public class DocumentoProfessor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="documento_url")
    private String documentoUrl;

    @Column(name = "data_envio")
    private LocalDateTime dataEnvio;

        @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    public DocumentoProfessor() {
    }

    public DocumentoProfessor(Integer id, String documentoUrl, LocalDateTime dataEnvio, Professor professor) {
        this.id = id;
        this.documentoUrl = documentoUrl;
        this.dataEnvio = dataEnvio;
        this.professor = professor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


  
    
}
