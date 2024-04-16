package com.example.PrjEmpresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.PrjEmpresa.entidades.Dependente;
import com.example.PrjEmpresa.repositories.DependenteRepository;



public class DependenteService {


	@Autowired
	private DependenteRepository dependenteRepository;

	public List<Dependente> getAllDependentes() {
		return dependenteRepository.findAll();
	}

	public Dependente getDependenteById(long depencodigo) {
		return dependenteRepository.findById(depencodigo).orElse(null);
	}

	public Dependente saveDependente(Dependente dependente) {
		return dependenteRepository.save(dependente);
	}
}
