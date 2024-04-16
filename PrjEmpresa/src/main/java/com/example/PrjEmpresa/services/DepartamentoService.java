package com.example.PrjEmpresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PrjEmpresa.entidades.Departamento;
import com.example.PrjEmpresa.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	public List<Departamento> getAllDepartamentos() {
		return departamentoRepository.findAll();
	}

	public Departamento getDepartamentoById(long depcodigo) {
		return departamentoRepository.findById(depcodigo).orElse(null);
	}

	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

}