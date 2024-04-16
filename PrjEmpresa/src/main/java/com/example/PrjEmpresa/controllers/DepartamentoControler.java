package com.example.PrjEmpresa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PrjEmpresa.entidades.Departamento;
import com.example.PrjEmpresa.services.DepartamentoService;


@RestController
@RequestMapping("/funcionario")
public class DepartamentoControler {

	private final DepartamentoService departamentoService;

	@Autowired
	public DepartamentoControler(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Departamento> findDepartamentobyId(@PathVariable Long id) {
		Departamento departamento = departamentoService.getDepartamentoById(id);
		if (departamento != null) {
			return ResponseEntity.ok(departamento);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Departamento>> findAllUsuarioscontrol() {
		List<Departamento> departamento = departamentoService.getAllDepartamentos();
		return ResponseEntity.ok(departamento);
	}

	@PostMapping("/")
	public ResponseEntity<Departamento> insertUsuariosControl(@RequestBody Departamento departamento) {
		Departamento novodepartamento = departamentoService.saveDepartamento(departamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(novodepartamento);
	}

}
