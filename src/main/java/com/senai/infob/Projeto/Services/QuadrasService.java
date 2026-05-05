package com.senai.infob.Projeto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.senai.infob.Projeto.Models.Quadras;
import com.senai.infob.Projeto.Repositories.QuadrasRepository;


public class QuadrasService {
@Autowired
    public QuadrasRepository quadrasRepository;

    public Quadras salvar (Quadras quadras, Integer id){
    if (quadras.getId().equals(id)){
        return quadrasRepository.save(quadras);

    }
    return null;
    }
  public boolean  delete(Integer id) {
      Quadras quadras= quadrasRepository.findById(id).get();
        if(quadras != null) {
        quadrasRepository.deleteById(id);
        return true;
    }
    return false;
    }
  public Quadras getId(Integer id){
        return quadrasRepository.findById(id).get(); 
    }

  public Quadras atualizarQuadras(Quadras quadras, Integer id){
        Quadras e = getId(id);
         if (e != null){quadras.setId(id);
          quadrasRepository.save(quadras);
         }
    
         return null;
    }
  public List<Quadras> listartodos(){
       return quadrasRepository.findAll();
    }  

}
