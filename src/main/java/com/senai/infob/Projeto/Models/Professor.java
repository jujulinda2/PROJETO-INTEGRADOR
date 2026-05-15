package com.senai.infob.Projeto.models;

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

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Usuario> usuario;

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

    public Professor() {
    }

    public Professor(Integer id, List<Usuario> usuarios, String descricao, String instituicao, String cref,
            String documentoUrl, String statusVerificacao) {
        this.id = id;
        this.usuario = usuarios;
        this.descricao = descricao;
        this.instituicao = instituicao;
        this.cref = cref;
        this.documentoUrl = documentoUrl;
        this.statusVerificacao = statusVerificacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Usuario> getUsuarios() {
        return usuario;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuario = usuarios;
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

    
}
