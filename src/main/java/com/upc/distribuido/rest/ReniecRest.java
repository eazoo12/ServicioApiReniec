package com.upc.distribuido.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.upc.distribuido.entidades.Persona;
import com.upc.distribuido.negocio.NegocioOperacionDni;
import com.upc.distribuido.repositorio.PersonaRepositorio;


@RestController
@RequestMapping("/api")
public class ReniecRest {
	
	
	@Autowired
	private NegocioOperacionDni negocioOperacionDni;
	
	
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	
	@GetMapping("/TodasPersonas/")
	public List<Persona> consultaClienteCuen(){
		return negocioOperacionDni.ConPersona();
	}
	@CrossOrigin(origins = {"http://localhost:8080"},allowCredentials = "false")
	@GetMapping("/Persona/{dni}")
	public Persona obtenerCliente(@PathVariable(name="dni") String dni){
		
		Persona cliente = null;
		cliente  = personaRepositorio.obtenerCliente(dni);
		
		
		return cliente;
	}
	
	
	

}
