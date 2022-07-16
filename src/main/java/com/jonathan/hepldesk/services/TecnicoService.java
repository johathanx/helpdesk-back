package com.jonathan.hepldesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.hepldesk.domain.Tecnico;
import com.jonathan.hepldesk.repositories.TecnicoRepository;
import com.jonathan.hepldesk.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + id));
	 
	}

	public List<Tecnico> findAll() {
		return repository.findAll();
	}
}
