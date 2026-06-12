package com.senai.infob.Projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.models.DocumentoProfessor;
import com.senai.infob.Projeto.services.DocumentoProfessorService;

@RestController
@RequestMapping("/documento_professor")
public class DocumentoProfessorController {

    @Autowired
    private DocumentoProfessorService documentoProfessorService;

     @GetMapping("/contar-documento_professor")
    public Long contarDocumentoProfessor() {
        return documentoProfessorService.contarDocumentoProfessor();
    }
    

    @GetMapping("/buscar-DocumentoProfessor/{id}")
    public DocumentoProfessor buscarDocumentoProfessor(@PathVariable @NonNull Integer id){ {
        return documentoProfessorService.buscarDocumentoProfessor(id);
    }
    }

    @GetMapping("/listar-DocumentoProfessor")
    public List<DocumentoProfessor> listarDocumentoProfessors(){
        return documentoProfessorService.listarDocumentoProfessor();
    }

    @DeleteMapping("/deletar-DocumentoProfessor/{id}")
    public String deletarDocumentoProfessor(@PathVariable @NonNull Integer id){
        if(documentoProfessorService.deletarDocumentoProfessor(id)){
            return "DocumentoProfessor removido com sucesso!";
        }
        return "Não foi possível remover o DocumentoProfessor!";
    }
    
    @PostMapping("/salvar-DocumentoProfessor")
    public DocumentoProfessor cadastrarDocumentoProfessor(@RequestBody @NonNull DocumentoProfessor DocumentoProfessor) {
        return documentoProfessorService.cadastrarDocumentoProfessor(DocumentoProfessor);
    }

    @PutMapping("/atualizar-DocumentoProfessor/{id}")
    public String atualizarDocumentoProfessor(@PathVariable @NonNull Integer id, @RequestBody DocumentoProfessor DocumentoProfessor) {
        if(documentoProfessorService.atualizarDocumentoProfessor(id, DocumentoProfessor) != null){
            return "DocumentoProfessor atualizado com sucesso!";
        }
        return "Não foi possível atualizar o DocumentoProfessor!";
    }
    
}
