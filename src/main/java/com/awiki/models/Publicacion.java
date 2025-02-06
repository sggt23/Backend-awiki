package com.awiki.models;

public class Publicacion {

	private Long id;
	private String descripcion;
	private String imagen;
	private static Long total= Long.valueOf(0);
	
	//Constructor vacío
	public Publicacion() {
		Publicacion.total++;
		this.id=Publicacion.total;
	}
	//Constructor
	public Publicacion(String descripcion, String imagen) {
		this.descripcion = descripcion;
		this.imagen = imagen;
		Publicacion.total++;
		this.id=Publicacion.total;
	}
	
	//Getteres y setters sin el Set Id
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", descripcion=" + descripcion + ", imagen=" + imagen + "]";
	}
	
	
	
	
	
}


