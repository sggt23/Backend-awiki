package com.awiki.models;
import javax.persistence.*;

@Entity
@Table(name="resenas")
public class Resena {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	@Column(nullable = false)
	private String descripcion;
	@Column(nullable = false)
	private Integer calificacion;
	@Column(nullable=false)
	private Long usuariosId;
	@Column(nullable=false)
	private Long listingsId;
	
	public Resena(String descripcion, Integer calificacion, Long usuariosId, Long listingsId) {
		this.descripcion = descripcion;
		this.calificacion = calificacion;
		this.usuariosId = usuariosId;
		this.listingsId = listingsId;
	}//Constructor


	public Resena() {
		
	}//Constructor vacío

	public Long getId() {
		return id;
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


	public Long getUsuariosId() {
		return usuariosId;
	}
	
	public Long setUsuariosId() {
		return usuariosId;
	}

	public Long getListingsId() {
		return listingsId;
	}
	
	public Long setListingsId() {
		return listingsId;
	}
	
	//toString

	@Override
	public String toString() {
		return "Resena [id=" + id + ", descripcion=" + descripcion + ", calificacion=" + calificacion + ", usuariosId="
				+ usuariosId + ", listingsId=" + listingsId + "]";
	}
	



	

	

	
	
	
	
	
	
}//Main
