package com.senai.infob.Projeto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.Models.Agendamento;

import com.senai.infob.Projeto.Repositories.AgendamentoRepository;


@Service
public class AgendamentoService {
    @Autowired

    public AgendamentoRepository agendamentoRepository;

     public Agendamento salvar (Agendamento agendamento){
        return agendamentoRepository.save(agendamento);
    }


    public List<Agendamento> listartodos(){
       return agendamentoRepository.findAll();
        }  
       
    public boolean  delete(Integer id) {
       Agendamento agendamento = agendamentoRepository.findById(id).get();
        if(agendamento != null) {
        agendamentoRepository.deleteById(id);
        return true;
    }
    return false;
    }
    
    public Agendamento getId(Integer id){
        return agendamentoRepository.findById(id).get(); 
    }

    
}

