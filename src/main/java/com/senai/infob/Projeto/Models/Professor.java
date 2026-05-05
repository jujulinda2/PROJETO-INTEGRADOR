package com.senai.infob.Projeto.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name= "senha")
        private String senha;


    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Usuario> usuarios;

    
    @OneToMany
    @JoinColumn(name = "esporte_id")
    private List<Esportes> esportes;
    
    public Professor() {
    }
    
    public Professor(Integer id, List<Usuario> usuarios, List<Esportes> esportes, String email, String senha) {
        this.id = id;
        this.usuarios = usuarios;
        this.esportes = esportes;
        this.email = email;
        this.senha = senha;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Esportes> getEsportes() {
        return esportes;
    }

    public void setEsportes(List<Esportes> esportes) {
        this.esportes = esportes;
    }
    

}
