package com.senai.infob.Projeto.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    
    @Column(name = "id")
    private Integer id;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "senha")
    private Integer Senha;

    public Login() {
    }

    public Login(Integer id, String usuario, Integer senha) {
        this.id = id;
        this.usuario = usuario;
        Senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getSenha() {
        return Senha;
    }

    public void setSenha(Integer senha) {
        Senha = senha;
    }

}
