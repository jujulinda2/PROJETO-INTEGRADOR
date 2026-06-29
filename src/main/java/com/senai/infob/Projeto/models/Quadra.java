package com.senai.infob.Projeto.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quadra")
public class Quadra {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "endereco")
    private String endereco;

    @Column(name = "status")
    private Boolean status;


    public Quadra() {
    }

 

    public Quadra(Integer id, String nome, String endereco, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.status = status;
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



    public String getEndereco() {
        return endereco;
    }



    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    public Boolean getStatus() {
        return status;
    }



    public void setStatus(Boolean status) {
        this.status = status;
    }


    
}
