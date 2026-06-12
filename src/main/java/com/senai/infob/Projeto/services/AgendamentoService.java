package com.senai.infob.Projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.models.Agendamento;
import com.senai.infob.Projeto.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {
    @Autowired
    private AgendamentoRepository agendamentoRepository;
    
    public Long contarAgendamentos() {
        return agendamentoRepository.count();
    }

    public Agendamento buscarAgendamentos(@NonNull Integer id) {
        return agendamentoRepository.findById(id).get();
    }

    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    public Boolean deletarAgendamento(@NonNull Integer id) {
        if (agendamentoRepository.existsById(id)) {
            agendamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Agendamento cadastrarAgendamento(@NonNull Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public Agendamento atualizarAgendamento(@NonNull Integer id, Agendamento agendamento) {
        Agendamento agendamentoRecuperado = buscarAgendamentos(id);
        if(agendamentoRecuperado != null){
            agendamentoRecuperado.setId(id);
            if(agendamento.getDataHoraInicio() != null){
                agendamentoRecuperado.setDataHoraInicio(agendamento.getDataHoraInicio());
            }
            if(agendamento.getId() != null){
                agendamentoRecuperado.setId(agendamento.getId());
            }
            return agendamentoRepository.save(agendamentoRecuperado);
        }
        return null;
    }
}

