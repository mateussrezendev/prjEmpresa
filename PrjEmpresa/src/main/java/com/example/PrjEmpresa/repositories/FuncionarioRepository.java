package com.example.PrjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PrjEmpresa.entidades.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}

