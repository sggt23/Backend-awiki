package com.awiki.models;
import javax.persistence.*;

@Entity
@Table(name="publicaciones")
public class Publicacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	@Column(unique=true, nullable=false)
	private String descripcion;
	private String imagen;
	@Column(nullable=false)
	private Long usuariosId;
	
	//Constructor vacío
	public Publicacion() {
	}
	//Constructor
	public Publicacion(String descripcion, String imagen, Long usuariosId) {
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.usuariosId = usuariosId;
	}
	
	public Long getId() {
		return id;
	}
	
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
	
	public Long getUsuariosId() {
		return usuariosId;
	}
	
	public void setUsuariosId(Long usuariosId) {
		this.usuariosId = usuariosId;
	}
	
	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", descripcion=" + descripcion + ", imagen=" + imagen + "]";
	}
	
	
	
	
	
}


