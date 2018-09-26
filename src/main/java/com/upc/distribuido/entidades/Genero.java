package com.upc.distribuido.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_GENERO")
public class Genero implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 550490208457676960L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_GENERO")
	private Long idgenero;
	
	private String descriEstado;

	public Long getCodGenero() {
		return idgenero;
	}

	public void setCodGenero(Long codGenero) {
		this.idgenero = codGenero;
	}

	public String getDescriEstado() {
		return descriEstado;
	}

	public void setDescriEstado(String descriEstado) {
		this.descriEstado = descriEstado;
	}
	
	
	
	
}
