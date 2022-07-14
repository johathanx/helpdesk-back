package com.jonathan.hepldesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.hepldesk.domain.Chamado;
import com.jonathan.hepldesk.domain.Cliente;
import com.jonathan.hepldesk.domain.Tecnico;
import com.jonathan.hepldesk.domain.enums.Perfil;
import com.jonathan.hepldesk.domain.enums.Prioridade;
import com.jonathan.hepldesk.domain.enums.Status;
import com.jonathan.hepldesk.repositories.ChamadoRepository;
import com.jonathan.hepldesk.repositories.ClienteRepository;
import com.jonathan.hepldesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Jonathan Rafael", "78779571069", "johathanx@outlook.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Leticia Alves", "38013388000", "leticiaalves@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
