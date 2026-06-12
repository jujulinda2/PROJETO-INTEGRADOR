package com.senai.infob.Projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.models.Esporte;
import com.senai.infob.Projeto.repositories.EsporteRepository;

@Service
public class EsporteService {

    @Autowired
    private EsporteRepository esporteRepository;

    public Long contarEsporte() {
        return esporteRepository.count();
    }

    public Esporte buscarEsporte(@NonNull Integer id) {
        return esporteRepository.findById(id).get();
    }

    public List<Esporte> listarEsportes() {
        return esporteRepository.findAll();
    }

    public Boolean deletarEsporte(@NonNull Integer id) {
        if (esporteRepository.existsById(id)) {
            esporteRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Esporte cadastrarEsporte(@NonNull Esporte esporte) {
        return esporteRepository.save(esporte);
    }

    public Esporte atualizarEsporte(@NonNull Integer id, Esporte esporte) {
        Esporte esporteRecuperado = buscarEsporte(id);
        if(esporteRecuperado != null){
            esporteRecuperado.setId(id);
            if(esporte.getId() != null){
                esporteRecuperado.setId(esporte.getId());
            }
            if(esporte.getId() != null){
                esporteRecuperado.setId(esporte.getId());
            }
            return esporteRepository.save(esporteRecuperado);
        }
        return null;
    }



}
