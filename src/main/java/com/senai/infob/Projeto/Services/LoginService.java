package com.senai.infob.Projeto.Services;

import com.senai.infob.Projeto.Models.Aluno;

public class LoginService {
    
    public LoginService getId(Integer id){
        return LoginRepository.findById(id).get(); } 
}
