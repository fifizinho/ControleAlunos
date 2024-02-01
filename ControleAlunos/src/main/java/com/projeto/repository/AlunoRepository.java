package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}