package com.upc.distribuido.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_ESTADO_CIVIL")
public class EstadoCivil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4980234441010340469L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ESTADO")
	private Long idEstadoCivil;
	
	private String descriEstado;

	public Long getCodEstadoCivil() {
		return idEstadoCivil;
	}

	public void setCodEstadoCivil(Long codEstadoCivil) {
		this.idEstadoCivil = codEstadoCivil;
	}

	public String getDescriEstado() {
		return descriEstado;
	}

	public void setDescriEstado(String descriEstado) {
		this.descriEstado = descriEstado;
	}
	

}
