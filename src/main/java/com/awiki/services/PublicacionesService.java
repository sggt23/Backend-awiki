package com.awiki.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awiki.models.Publicacion;
import com.awiki.repositories.PublicacionesRepository;
@Service
public class PublicacionesService {

	public final PublicacionesRepository publicacionesRepository;
	
	@Autowired
	public PublicacionesService(PublicacionesRepository publicacionesRepository) {
		this.publicacionesRepository = publicacionesRepository;
	}
	
	//getAllPublicaciones
	public List <Publicacion> getAllPublicacions(){
		return publicacionesRepository.findAll();
	}
	
	//getPublicacion
	public Publicacion getPublicacion(Long id) {
		return publicacionesRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("La publicación con el id ["
						+ id + "] no existe"));
	}
	
	//deletePublicacion
	public Publicacion deletePublicacion(Long id) {
		Publicacion pub= null;
			if(publicacionesRepository.existsById(id)) {
				pub= publicacionesRepository.findById(id).get();
				publicacionesRepository.deleteById(id);
			}
			return pub;
	}	
	
	//addPublicacion
	public Publicacion addPublicacion(Publicacion publicacion) {
		Optional<Publicacion> pub= publicacionesRepository.findByDescripcion(publicacion.getDescripcion()); // repository
		if(pub.isEmpty()) { 
			publicacionesRepository.save(publicacion);
			return publicacion;
		}else {
			return null;
		}
	}
	
	
	//updatePublicacion
	public Publicacion updatePublicacion(Long id, String descripcion, String imagen) {
		Publicacion pub= null;
		if(publicacionesRepository.existsById(id)) {
			Publicacion publicacion= publicacionesRepository.findById(id).get();
			if(publicacion.getId().equals(id)) {
				if(descripcion!=null)publicacion.setDescripcion(descripcion);
				if(imagen!=null)publicacion.setImagen(imagen);
				publicacionesRepository.save(publicacion);
			}//if
		}
		return pub;
	}
	
	
}
