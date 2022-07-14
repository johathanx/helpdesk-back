package com.jonathan.hepldesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.hepldesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

	
}
