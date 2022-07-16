package com.jonathan.hepldesk.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

import com.jonathan.hepldesk.domain.Tecnico;
import com.jonathan.hepldesk.domain.dtos.TecnicoDTO;
import com.jonathan.hepldesk.services.TecnicoService;


@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResouce {

	// localhost:8080/tecnicos/1
	
	
	@Autowired
	private TecnicoService service;
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id) {
		 Tecnico obj = service.findById(id);
		 return ResponseEntity.ok().body(new TecnicoDTO(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<TecnicoDTO>> findAll() {
		List<Tecnico> list = service.findAll ();
		List<TecnicoDTO> listDTO = list.stream().map(obj -> new TecnicoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}