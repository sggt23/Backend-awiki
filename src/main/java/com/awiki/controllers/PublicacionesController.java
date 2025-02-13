package com.awiki.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.awiki.models.Publicacion;
import com.awiki.services.PublicacionesService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="api/publicaciones/")
public class PublicacionesController {
	
	private final PublicacionesService publicacionesServices;
	
	@Autowired
	public PublicacionesController(PublicacionesService publicacionesServices) {
		this.publicacionesServices= publicacionesServices;
	}//CONSTRUCTOR
	
	@GetMapping
	public List <Publicacion> getPublicaciones(){
		return publicacionesServices.getAllPublicacions();
	}//GET controller (all)
	
	@GetMapping(path="{puId}")
	public Publicacion getPublicacion(@PathVariable("puId") Long id) {
		return publicacionesServices.getPublicacion(id);
	}//GET controller (one)
	
	@PostMapping
	public Publicacion addPublicacion(@RequestBody Publicacion publicacion) {
		return publicacionesServices.addPublicacion(publicacion);
	}//POST controller
	
	@PutMapping(path="{puId}")
	public Publicacion updatePublicacion(@PathVariable("puId")Long id,
			@RequestParam(name="descripcion", required=false) String descripcion,
			@RequestParam(name="imagen", required=false) String imagen) {
		return publicacionesServices.updatePublicacion(id, descripcion, imagen);
	}//PUT controller
	
	@DeleteMapping(path="{puId}")
	public Publicacion deletePublicacion(@PathVariable("puId") Long id) {
		return publicacionesServices.deletePublicacion(id);
	}//DELETE controller
}//CLASS