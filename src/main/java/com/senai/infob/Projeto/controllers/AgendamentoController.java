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

import com.senai.infob.Projeto.models.Agendamento;
import com.senai.infob.Projeto.services.AgendamentoService;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping("/contar-agendamentos")
    public Long contarAgendamentos() {
        return agendamentoService.contarAgendamentos();
    }
    

    @GetMapping("/buscar-agendamentos/{id}")
    public Agendamento buscarAgendamento(@PathVariable @NonNull Integer id){ {
        return agendamentoService.buscarAgendamentos(id);
    }
    }

    @GetMapping("/listar-agendamentos")
    public List<Agendamento> listarAgendamentos(){
        return agendamentoService.listarAgendamentos();
    }

    @DeleteMapping("/deletar-agendamento/{id}")
    public String deletarAgendamento(@PathVariable @NonNull Integer id){
        if(agendamentoService.deletarAgendamento(id)){
            return "Agendamento removido com sucesso!";
        }
        return "Não foi possível remover o agendamento!";
    }
    
    @PostMapping("/salvar-agendamento")
    public Agendamento cadastrarAgendamento(@RequestBody @NonNull Agendamento agendamento) {
        return agendamentoService.cadastrarAgendamento(agendamento);
    }

    @PutMapping("/atualizar-agendamento/{id}")
    public String atualizarAgendamento(@PathVariable @NonNull Integer id, @RequestBody Agendamento agendamento) {
        if(agendamentoService.atualizarAgendamento(id, agendamento) != null){
            return "Agendamento atualizado com sucesso!";
        }
        return "Não foi possível atualizar o agendamento!";
    }
}
