package com.awiki.models;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",unique = true,nullable =false)
	private Long id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String contrasena;
	private String imagenPerfil;
	@Column(nullable = false)
	private String descripcionPerfil;
	@Column(nullable = false)
	private Boolean esPerfilEmpresa;
	/*--------------AGREGADO POR ADRIÁN--------------*/
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="categoryId", referencedColumnName="id")
	private List<Listing> listingsUsuario = new ArrayList<Listing>();
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="categoryId", referencedColumnName="id")
	private List<Publicacion> publicacionesUsuario = new ArrayList<Publicacion>();
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="categoryId", referencedColumnName="id")
	private List<Resena> resenasUsuario = new ArrayList<Resena>();
	/*-----------------------------------------------*/
	//Constructores
	
	//Constructor vacío
	public Usuario() {
		//Usuario.total++;
		//this.idusuarios=Usuario.total;
	}

	
	//Constructor
	
	public Usuario( String nombre, String apellido, String email, String contrasena,
			String imagenPerfil, String descripcionPerfil, Boolean esPerfilEmpresa) {
		
		//Usuario.total++;
		//this.idusuarios=Usuario.total;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contrasena = contrasena;
		this.imagenPerfil = imagenPerfil;
		this.descripcionPerfil = descripcionPerfil;
		this.esPerfilEmpresa = esPerfilEmpresa;
	}

	//Getters and Setters 
	
	public Long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getImagenPerfil() {
		return imagenPerfil;
	}


	public void setImagenPerfil(String imagenPerfil) {
		this.imagenPerfil = imagenPerfil;
	}


	public String getDescripcionPerfil() {
		return descripcionPerfil;
	}


	public void setDescripcionPerfil(String descripcionPerfil) {
		this.descripcionPerfil = descripcionPerfil;
	}


	public Boolean getEsPerfilEmpresa() {
		return esPerfilEmpresa;
	}


	public void setEsPerfilEmpresa(Boolean esPerfilEmpresa) {
		this.esPerfilEmpresa = esPerfilEmpresa;
	}
	
	public List<Listing> getListingsUsuario(){
		return listingsUsuario;
	}
	
	public List<Publicacion> getPublicacionesUsuario(){
		return publicacionesUsuario;
	}

	public List<Resena> getResenasUsuario(){
		return resenasUsuario;
	}


	@Override
	public String toString() {
		return "Usuario [idusuarios=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", contrasena=" + contrasena + ", imagenPerfil=" + imagenPerfil + ", descripcionPerfil="
				+ descripcionPerfil + ", esPerfilEmpresa=" + esPerfilEmpresa + "]";
	}



	
	
	

	
	
	
	
	
	
	
	

}
