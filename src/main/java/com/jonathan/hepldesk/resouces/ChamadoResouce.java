package com.jonathan.hepldesk.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.hepldesk.domain.Chamado;
import com.jonathan.hepldesk.domain.dtos.ChamadoDTO;
import com.jonathan.hepldesk.services.ChamadoService;

@RestController
@RequestMapping(value = "/chamados")
public class ChamadoResouce {

	@Autowired
	private ChamadoService service;
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<ChamadoDTO> findById(@PathVariable Integer id) {
		 Chamado obj = service.findById(id);
		 return ResponseEntity.ok().body(new ChamadoDTO(obj));
	}
}
