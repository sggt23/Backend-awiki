package com.awiki.models;

public class Listing {
	private Long id;
	private String nombre;
	private String descripcion;
	private Double rating;
	private String categoria;
	private String direccion;
	private String colonia;
	private String municipio;
	private String estado;
	private Integer codigoPostal;
	private static Long idIncrement = 1L;
	
	public Listing() {
		super();
		this.id = idIncrement;
		idIncrement++;
	}
	
	public Listing(String nombre, String descripcion, String categoria, String direccion, String colonia, String municipio, String estado, Integer codigoPostal) {
		super();
		this.id = idIncrement;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.rating = 5.0;
		this.categoria = categoria;
		this.direccion = direccion;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
		idIncrement++;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	

}
