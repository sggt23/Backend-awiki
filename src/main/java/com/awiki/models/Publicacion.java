package com.awiki.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publicaciones")
public class Publicacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	@Column(unique=true, nullable=false)
	private String descripcion;
	//Quitar anotación abajo, "imagen" SÍ puede ser nulo.
	@Column(unique=true, nullable=false)
	private String imagen;
	//Agregar clave foránea "UsuariosId".
	//private static Long total= Long.valueOf(0);//Eliminar, ya no se usa.
	
	//Constructor vacío
	public Publicacion() {
		//Publicacion.total++;
		//this.id=Publicacion.total;
	}
	//Constructor
	public Publicacion(String descripcion, String imagen) {
		this.descripcion = descripcion;
		this.imagen = imagen;
		//Publicacion.total++;
		//this.id=Publicacion.total;
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


