package com.devfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfit.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
