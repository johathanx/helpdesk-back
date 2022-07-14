package com.jonathan.hepldesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.hepldesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	
}
