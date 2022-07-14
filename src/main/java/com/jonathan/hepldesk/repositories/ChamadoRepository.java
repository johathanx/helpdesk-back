package com.jonathan.hepldesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.hepldesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

	
}
