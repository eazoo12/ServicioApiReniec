package com.upc.distribuido.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.upc.distribuido.entidades.Persona;

public interface PersonaRepositorio extends CrudRepository<Persona, Long>{

	@Query("SELECT per FROM Persona per WHERE per.dni=:dni")
    Persona obtenerCliente(@Param("dni") String dni);
	
	
	@Query("SELECT per FROM Persona per")
    List<Persona> allpersona();
}
