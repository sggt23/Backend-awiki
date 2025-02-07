package com.awiki.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",unique = true,nullable =false )
	private Long idusuarios;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String nombre_usuario;
	@Column(nullable = false)
	private String contraseña;
	@Column(nullable = false)
	private String imagen_perfil;
	@Column(nullable = false)
	private String descripcion_perfil;
	@Column(nullable = false)
	private Boolean es_perfil_empresa;
	//private static Long total= Long.valueOf(0);
	
	//Constructores
	
	//Constructor vacío
	public Usuario() {
		//Usuario.total++;
		//this.idusuarios=Usuario.total;
	}

	
	//Constructor
	
	public Usuario( String nombre, String email, String nombre_usuario, String contraseña,
			String imagen_perfil, String descripcion_perfil, Boolean es_perfil_empresa) {
		
		//Usuario.total++;
		//this.idusuarios=Usuario.total;
		this.nombre = nombre;
		this.email = email;
		this.nombre_usuario = nombre_usuario;
		this.contraseña = contraseña;
		this.imagen_perfil = imagen_perfil;
		this.descripcion_perfil = descripcion_perfil;
		this.es_perfil_empresa = es_perfil_empresa;
	}

	//Getters and Setters 
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombre_usuario() {
		return nombre_usuario;
	}


	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getImagen_perfil() {
		return imagen_perfil;
	}


	public void setImagen_perfil(String imagen_perfil) {
		this.imagen_perfil = imagen_perfil;
	}


	public String getDescripcion_perfil() {
		return descripcion_perfil;
	}


	public void setDescripcion_perfil(String descripcion_perfil) {
		this.descripcion_perfil = descripcion_perfil;
	}


	public Boolean getEs_perfil_empresa() {
		return es_perfil_empresa;
	}


	public void setEs_perfil_empresa(Boolean es_perfil_empresa) {
		this.es_perfil_empresa = es_perfil_empresa;
	}


	public Long getIdusuarios() {
		return idusuarios;
	}


	
	//ToString
	
	
	@Override
	public String toString() {
		return "Usuario [idusuarios=" + idusuarios + ", nombre=" + nombre + ", email=" + email + ", nombre_usuario="
				+ nombre_usuario + ", contraseña=" + contraseña + ", imagen_perfil=" + imagen_perfil
				+ ", descripcion_perfil=" + descripcion_perfil + ", es_perfil_empresa=" + es_perfil_empresa + "]";
	}
	

	
	
	
	
	
	
	
	

}
