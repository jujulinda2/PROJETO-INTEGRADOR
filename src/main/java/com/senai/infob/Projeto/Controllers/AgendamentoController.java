package com.senai.infob.Projeto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.infob.Projeto.Models.Agendamento;
import com.senai.infob.Projeto.Services.AgendamentoService;


import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
    @Autowired
    public AgendamentoService agendamentoService;

    @PostMapping("/salvar")
    public Agendamento salvar (@RequestBody Agendamento agendamento) {    
        return agendamentoService.salvar(agendamento);
    }
    @GetMapping("/listar")
    public List<Agendamento> listarTodos() {
            return agendamentoService.listartodos();
        }
    @GetMapping("/buscar/{id}")
        public Agendamento buscar (@PathVariable Integer id) {
            return agendamentoService.getId(id);
        }
    @DeleteMapping("/delete/{id}") 
        public String deletar(@PathVariable Integer id) {
        boolean deletou = agendamentoService.delete(id);
        if (deletou) {
            return "Agendamento removido com sucesso";
        }
        return "Falha ao remover o Agendamento";
        }
        
}
