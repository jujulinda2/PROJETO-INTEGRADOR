package com.senai.infob.Projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 

@Repository
public interface  LoginRepository extends JpaRepository<LoginRepository, Integer>{ 
}
