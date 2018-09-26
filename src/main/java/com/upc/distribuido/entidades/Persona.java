package com.upc.distribuido.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="TB_Persona")
public class Persona implements Serializable
{

	private static final long serialVersionUID = -8853167401760129387L;
	
	public Persona() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PERSONA")
	private Long idPersona;
	
	@Column(name="DNI", unique=true)
	private String dni;
	
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String direccion;
	
	//private Blob firma;
	
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private EstadoCivil idEstadoCivil;
	
	
	@ManyToOne
	@JoinColumn(name="ID_UBIGEO")
	private Ubigeo idUbigeo;
	/*
	@ManyToOne
	@JoinColumn(name="ID_UBIGEO")
	private Ubigeo idubigeoNacimiento;*/
	
	private Date fechaNacimiento;
	private Date fechaEmision;
	private Date fechaCaducidad;
	private String grupoVotacion;
	private int DonacionOrga;
	
	@ManyToOne
	@JoinColumn(name="ID_GENERO")
	private Genero idgenero;

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public EstadoCivil getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(EstadoCivil idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public Ubigeo getIdUbigeo() {
		return idUbigeo;
	}

	public void setIdUbigeo(Ubigeo idUbigeo) {
		this.idUbigeo = idUbigeo;
	}

	

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getGrupoVotacion() {
		return grupoVotacion;
	}

	public void setGrupoVotacion(String grupoVotacion) {
		this.grupoVotacion = grupoVotacion;
	}

	public int getDonacionOrga() {
		return DonacionOrga;
	}

	public void setDonacionOrga(int donacionOrga) {
		DonacionOrga = donacionOrga;
	}

	public Genero getIdgenero() {
		return idgenero;
	}

	public void setIdgenero(Genero idgenero) {
		this.idgenero = idgenero;
	}

	
	
	
	

	
	
	
	
}
