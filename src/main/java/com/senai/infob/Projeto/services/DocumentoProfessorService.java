package com.senai.infob.Projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.models.DocumentoProfessor;
import com.senai.infob.Projeto.repositories.DocumentoProfessorRepository;

@Service
public class DocumentoProfessorService {

    @Autowired
    private DocumentoProfessorRepository documentoProfessorRepository;

    public Long contarDocumentoProfessor() {
        return documentoProfessorRepository.count();
    }

    public DocumentoProfessor buscarDocumentoProfessor(@NonNull Integer id) {
        return documentoProfessorRepository.findById(id).get();
    }

    public List<DocumentoProfessor> listarDocumentoProfessor() {
        return documentoProfessorRepository.findAll();
    }

    public Boolean deletarDocumentoProfessor(@NonNull Integer id) {
        if (documentoProfessorRepository.existsById(id)) {
            documentoProfessorRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public DocumentoProfessor cadastrarDocumentoProfessor(@NonNull DocumentoProfessor documentoProfessor) {
        return documentoProfessorRepository.save(documentoProfessor);
    }

    public DocumentoProfessor atualizarDocumentoProfessor(@NonNull Integer id, DocumentoProfessor documentoProfessor) {
        DocumentoProfessor documentoProfessorRecuperado = buscarDocumentoProfessor(id);
        if(documentoProfessorRecuperado != null){
            documentoProfessorRecuperado.setId(id);
            if(documentoProfessor.getId() != null){
                documentoProfessorRecuperado.setId(documentoProfessor.getId());
            }
            if(documentoProfessor.getId() != null){
                documentoProfessorRecuperado.setId(documentoProfessor.getId());
            }
            return documentoProfessorRepository.save(documentoProfessorRecuperado);
        }
        return null;
    }

    
}
