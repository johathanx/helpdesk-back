package com.jonathan.hepldesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.hepldesk.domain.Tecnico;
import com.jonathan.hepldesk.repositories.TecnicoRepository;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElse(null);
	
	}
}
