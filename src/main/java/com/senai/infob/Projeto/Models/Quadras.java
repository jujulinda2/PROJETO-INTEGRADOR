package com.senai.infob.Projeto.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quadras")
public class Quadras {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;
    
    @Column(name = "endereco")
    private String endereco_;

    @Column(name = "status")
    private Boolean status;

    public Quadras() {
    }

    public Quadras(Integer id, String endereco_, Boolean status) {
        this.id = id;
        this.endereco_ = endereco_;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndereco_() {
        return endereco_;
    }

    public void setEndereco_(String endereco_) {
        this.endereco_ = endereco_;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    
}
