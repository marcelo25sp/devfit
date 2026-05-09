package com.devfit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfit.model.Aluno;
import com.devfit.service.AlunoService;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	// Criar aluno
	@PostMapping
	public Aluno criar(@RequestBody Aluno aluno) {
		return alunoService.salvar(aluno);
	}
	
	//Listar alunos
	@GetMapping
	public List<Aluno> listar() {
		return alunoService.listar();
	}
	
	// Buscar aluno por id
	@GetMapping("/{id}")
	public Aluno buscar(@PathVariable Long id) {
		return alunoService.buscarPorId(id);
	}
	
	// Deletar aluno por id
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		alunoService.deletar(id);
	}
	

}
