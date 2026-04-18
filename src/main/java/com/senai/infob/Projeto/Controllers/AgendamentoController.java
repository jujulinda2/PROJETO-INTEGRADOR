package com.senai.infob.Projeto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.Projeto.Services.HomeAlunoService;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
    @Autowired
    public AgendamentoService AgendamentoService;
}
