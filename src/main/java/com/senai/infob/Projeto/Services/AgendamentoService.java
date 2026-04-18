package com.senai.infob.Projeto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.Models.Agendamento;
import com.senai.infob.Projeto.Repositories.Agendamentorepositorie;

@Service
public class AgendamentoService {
    @Autowired
    public Agendamentorepositorie AgendamentoRepositorie;

     public Agendamento salvar (Agendamento agendamento, String senha){
    if (agendamento.getSenha().equals(senha)){
        return AgendamentoRepositorie.save(agendamento);

    }
    return null;
    }

    public List<Agendamento> listartodos(){
       return AgendamentoRepositorie.findAll();
        }  
       
    public boolean  delete(Integer id) {
       Agendamento agendamento = AgendamentoRepositorie.findById(id).get();
        if(agendamento != null) {
        AgendamentoRepositorie.deleteById(id);
        return true;
    }
    return false;
    }
    
}
