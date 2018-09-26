package com.upc.distribuido.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_UBIGEO")
public class Ubigeo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6627312926975277634L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_UBIGEO")
	private Long idUbigeo;
	
	
	@ManyToOne
	@JoinColumn(name="ID_DEPARTAMENTO")
	private Departamento idDepartamento;
	
	@ManyToOne
	@JoinColumn(name="ID_PROVINCIA")
	private Provincia idProvincia;
	
	@ManyToOne
	@JoinColumn(name="ID_PAIS")
	private Pais idPais;

	public Long getIdUbigeo() {
		return idUbigeo;
	}

	public void setIdUbigeo(Long idUbigeo) {
		this.idUbigeo = idUbigeo;
	}

	public Departamento getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Departamento idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public Provincia getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Provincia idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Pais getIdPais() {
		return idPais;
	}

	public void setIdPais(Pais idPais) {
		this.idPais = idPais;
	}

	
	
	

}
