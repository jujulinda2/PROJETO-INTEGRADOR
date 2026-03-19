package com.senai.infob.Projeto.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome_usuario;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "CPF")
    private String CPF;

    @Column(name = "senha")
    private String senha;
}

    
