package com.upc.distribuido;

import static org.junit.Assert.assertEquals;

import java.awt.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

//import com.upc.curso.TestRestTemplate;
import com.upc.distribuido.entidades.Persona;
import com.upc.distribuido.repositorio.PersonaRepositorio;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProyectoDistribuidosApplicationTests {

	
	@Autowired
	private TestRestTemplate  restTemplate;
	
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	
	@Test
	public void pruebaPersona() {
		Persona respuesta =   restTemplate.getForObject("http://localhost:8080/api/Persona/47266593/",
				Persona.class);
	assertEquals(new Long(1), respuesta.getIdPersona());
	}
	
	/*@Test
    public void testApuestas() {
   	   List<Persona> ap = personaRepositorio.allpersona();    	   
   	   assertNotNull(ap);
    }*/
	
	
	
}
