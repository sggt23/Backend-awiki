package com.awiki.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.awiki.models.Publicacion;
import com.awiki.services.PublicacionesService;

@RestController
@RequestMapping(path="api/publicaciones/") //http://localhost:8080/api/publicaciones
public class PublicacionesController {
	
	private final PublicacionesService publicacionesServices;
	
	@Autowired
	public PublicacionesController(PublicacionesService publicacionesServices) {
		this.publicacionesServices= publicacionesServices;
	}
	
	@GetMapping
	public List <Publicacion> getPublicaciones(){
		return publicacionesServices.getAllPublicacions();
	}//todos los productos
	
	@GetMapping(path="{puId}")
	public Publicacion getPublicacion(@PathVariable("puId") Long id) {
		return publicacionesServices.getPublicacion(id);
	}
	
	@DeleteMapping(path="{puId}")
	public Publicacion deletePublicacion(@PathVariable("puId") Long id) {
		return publicacionesServices.deletePublicacion(id);
	}
	@PostMapping
	public Publicacion addPublicacion(@RequestBody Publicacion publicacion) {
		return publicacionesServices.addPublicacion(publicacion);
	}
	
	@PutMapping(path="{puId}")
	public Publicacion updatePublicacion(@PathVariable("puId")Long id,
			@RequestParam(name="descripcion", required=false) String descripcion,
			@RequestParam(name="imagen", required=false) String imagen) {
		return publicacionesServices.updatePublicacion(id, descripcion, imagen);
		}
	
		
	}
	


