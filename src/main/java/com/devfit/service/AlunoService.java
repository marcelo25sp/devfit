package com.devfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfit.model.Aluno;
import com.devfit.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public Aluno salvar(Aluno aluno) {

		// Regra de negócio IMC
		double imc = aluno.getPeso() / (aluno.getAltura() * aluno.getAltura());
		aluno.setImc(imc);

		return alunoRepository.save(aluno);

	}
	
	public List<Aluno> listar(){
		return alunoRepository.findAll();
	}
	
	public Aluno buscarPorId(Long id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public void deletar(Long id) {
		alunoRepository.deleteById(id);
	}

}
