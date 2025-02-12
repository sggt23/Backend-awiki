package com.awiki.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	//Agregar claves foráneas "usuariosId" y "listingsId".
	
	
	
	//Constructor
	public Resena(String descripcion, Integer calificacion) {
		this.descripcion = descripcion;
		this.calificacion = calificacion;
		this.usuariosId = usuariosId;
		this.listingsId = listingsId;
		//Resena.total++;
		//this.id=Resena.total;
		
	}//Constructor


	public Resena() {
		//Resena.total++;
		//this.id=Resena.total;
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


	public Long getUsuariosId() {
		return usuariosId;
	}


	public void setUsuariosId(Long usuariosId) {
		this.usuariosId = usuariosId;
	}


	public Long getListingsId() {
		return listingsId;
	}


	public void setListingsId(Long listingsId) {
		this.listingsId = listingsId;
	}

	
	//toString

	@Override
	public String toString() {
		return "Resena [id=" + id + ", descripcion=" + descripcion + ", calificacion=" + calificacion + ", usuariosId="
				+ usuariosId + ", listingsId=" + listingsId + "]";
	}
	



	

	

	
	
	
	
	
	
}//Main
