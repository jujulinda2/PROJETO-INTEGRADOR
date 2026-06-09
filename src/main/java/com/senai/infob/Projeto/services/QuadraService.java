package com.senai.infob.Projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.models.Quadra;
import com.senai.infob.Projeto.repositories.QuadraRepository;

@Service
public class QuadraService {

        @Autowired
        private QuadraRepository quadraRepository;

    public Long contarQuadra() {
        return quadraRepository.count();
    }

    public Quadra buscarQuadra(Integer id) {
        return quadraRepository.findById(id).get();
    }

    public List<Quadra> listarQuadras() {
        return quadraRepository.findAll();
    }

    public Boolean deletarQuadra(Integer id) {
        if (quadraRepository.existsById(id)) {
            quadraRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Quadra cadastrarQuadra(Quadra quadra) {
        return quadraRepository.save(quadra);
    }

    public Quadra atualizarQuadra(Integer id, Quadra quadra) {
        Quadra quadraRecuperado = buscarQuadra(id);
        if(quadraRecuperado != null){
            quadraRecuperado.setId(id);
            if(quadra.getId() != null){
                quadraRecuperado.setId(quadra.getId());
            }
            if(quadra.getId() != null){
                quadraRecuperado.setId(quadra.getId());
            }
            return quadraRepository.save(quadraRecuperado);
        }
        return null;
    } 

}
