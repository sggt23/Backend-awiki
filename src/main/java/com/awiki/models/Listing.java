package com.awiki.models;

import java.util.HashMap;

import javax.persistence.*;
@Entity
@Table(name="listings")
public class Listing {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String nombreCalle;
	@Column (nullable=false)
	private String numeroCalle;
	@Column(nullable=false)
	private String colonia;
	@Column(nullable=false)
	private String municipio;
	@Column(nullable=false)
	private String estado;
	@Column(nullable=false)
	private String codigoPostal;
	private String descripcion;
	@Column(nullable=false)
	private String telefonoContacto;
	@Column(nullable=false)
	private String emailContacto;
	private String sitioWeb;
	@Column(nullable=false)
	private String tipoNegocio;
	
	private String tipoCocina;
	private Integer categoriaHotel;
	private String horarios;
	private String horarioCheckInOut;
	
	@Column(nullable=false)
	private Double rating;
	
	public Listing() {
		this.id = id;
		this.rating = 5.0;
	}

	public Listing(String nombre, String nombreCalle, String numeroCalle, String colonia, String municipio,
			String estado, String codigoPostal, String descripcion, String telefonoContacto, String emailContacto,
			String sitioWeb, String tipoNegocio, String tipoCocina, Integer categoriaHotel,
			String horarios, String horarioCheckInOut) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreCalle = nombreCalle;
		this.numeroCalle = numeroCalle;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
		this.descripcion = descripcion;
		this.telefonoContacto = telefonoContacto;
		this.emailContacto = emailContacto;
		this.sitioWeb = sitioWeb;
		this.tipoNegocio = tipoNegocio;
		this.tipoCocina = tipoCocina;
		this.categoriaHotel = categoriaHotel;
		this.horarios = horarios;
		this.horarioCheckInOut = horarioCheckInOut;
		this.rating = 5.0;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public String getNumeroCalle() {
		return numeroCalle;
	}

	public String getColonia() {
		return colonia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getEstado() {
		return estado;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}

	public String getTipoNegocio() {
		return tipoNegocio;
	}

	public String getTipoCocina() {
		return tipoCocina;
	}

	public Integer getCategoriaHotel() {
		return categoriaHotel;
	}

	public String getHorarios() {
		return horarios;
	}

	public String getHorarioCheckInOut() {
		return horarioCheckInOut;
	}

	public Double getRating() {
		return rating;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public void setNumeroCalle(String numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public void setTipoCocina(String tipoCocina) {
		this.tipoCocina = tipoCocina;
	}

	public void setCategoriaHotel(Integer categoriaHotel) {
		this.categoriaHotel = categoriaHotel;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public void setHorarioCheckInOut(String horarioCheckInOut) {
		this.horarioCheckInOut = horarioCheckInOut;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	
	
	
	
	
	
	

}
