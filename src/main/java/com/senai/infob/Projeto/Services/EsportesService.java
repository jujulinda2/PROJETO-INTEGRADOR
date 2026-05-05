package com.senai.infob.Projeto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.senai.infob.Projeto.Models.Esportes;
import com.senai.infob.Projeto.Repositories.EsportesRepository;


@Service
public class EsportesService {
    @Autowired
    public EsportesRepository esportesRepository;

    public Esportes salvar (Esportes esportes, Integer id){
    if (esportes.getId().equals(id)){
        return esportesRepository.save(esportes);

    }
    return null;
    }

    public List<Esportes> listartodos(){
       return esportesRepository.findAll();
    }

    public Esportes getId(Integer id){
        return esportesRepository.findById(id).get(); 
    }


    public boolean  delete(Integer id) {
      Esportes esportes = esportesRepository.findById(id).get();
        if(esportes != null) {
        esportesRepository.deleteById(id);
        return true;
      }
    return false;
    }
    
  public Esportes atualizarEsportes(Esportes esportes, Integer id){
        Esportes e = getId(id);
         if (e != null){esportes.setId(id);
           esportesRepository.save(esportes);
         }
    
         return null;
    }


}
