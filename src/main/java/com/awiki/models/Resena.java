package com.awiki.models;


public class Resena {
	private static long total = 1L;
	private Long id;
	private String descripcion;
	private Integer calificacion;
	
	
	//Constructor
	public Resena(String descripcion, Integer calificacion) {
		this.descripcion = descripcion;
		this.calificacion = calificacion;
		Resena.total++;
		this.id=Resena.total;
		
	}//Constructor


	public Resena() {
		Resena.total++;
		this.id=Resena.total;
	}//Constructor vacío

	
	//Getters and Setters

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}


	//toString
	@Override
	public String toString() {
		return "Resena [id=" + id + ", descripcion=" + descripcion + ", calificacion=" + calificacion + "]";
	}//toString
	
	
	
	
	
	
	
	
}//Main
