package com.senai.infob.Projeto.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "instituicao")
    private String instituicao;

    @Column(name = "cref")
    private String cref;

    @Column(name = "documento_url")
    private String documentoUrl;

    @Column(name = "status_verificacao")
    private String statusVerificacao;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
        name = "professor_esporte",
        joinColumns = @JoinColumn(name = "professor_id"),
        inverseJoinColumns = @JoinColumn(name = "esporte_id")
    )
    private List<Esporte> esportes;


    public Professor() {
    }


    public Professor(Integer id, String descricao, String instituicao, String cref, String documentoUrl,
            String statusVerificacao, Usuario usuario, List<Esporte> esportes) {
        this.id = id;
        this.descricao = descricao;
        this.instituicao = instituicao;
        this.cref = cref;
        this.documentoUrl = documentoUrl;
        this.statusVerificacao = statusVerificacao;
        this.usuario = usuario;
        this.esportes = esportes;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getInstituicao() {
        return instituicao;
    }


    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }


    public String getCref() {
        return cref;
    }


    public void setCref(String cref) {
        this.cref = cref;
    }


    public String getDocumentoUrl() {
        return documentoUrl;
    }


    public void setDocumentoUrl(String documentoUrl) {
        this.documentoUrl = documentoUrl;
    }


    public String getStatusVerificacao() {
        return statusVerificacao;
    }


    public void setStatusVerificacao(String statusVerificacao) {
        this.statusVerificacao = statusVerificacao;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public List<Esporte> getEsportes() {
        return esportes;
    }


    public void setEsportes(List<Esporte> esportes) {
        this.esportes = esportes;
    }

   

   
    
}
