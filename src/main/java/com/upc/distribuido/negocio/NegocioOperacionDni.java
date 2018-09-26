package com.upc.distribuido.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.upc.distribuido.entidades.Persona;
import com.upc.distribuido.repositorio.PersonaRepositorio;

@Service
public class NegocioOperacionDni {
	
	@Autowired
	private PersonaRepositorio personaRepositorio;

	
	
	public List<Persona> ConPersona() {
		
		List<Persona> oLisPersona = null;
				
		oLisPersona = personaRepositorio.allpersona() ;
		
		return oLisPersona;
		
	
	}
	
	
	
}
