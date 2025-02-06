package com.awiki.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awiki.models.Publicacion;
@Service
public class PublicacionesService {

	private final List<Publicacion> publi= new ArrayList<Publicacion>();
	
	@Autowired
	public PublicacionesService() {
		publi.add(new Publicacion("Disfrutando del atardecer en la playa.","ruta/imagen1.jpg"));
		publi.add(new Publicacion("¡Nueva receta de pasta!", "ruta/imagen2.jpg"));
		publi.add(new Publicacion("De excursión por las montañas.", "ruta/imagen3.jpg"));
		publi.add(new Publicacion("Mi libro favorito del momento.", "ruta/imagen4.jpg"));
		publi.add(new Publicacion("¡A cocinar se ha dicho!", "ruta/imagen5.jpg"));
	}
	
	//getAllPublicaciones
	public List <Publicacion> getAllPublicacions(){
		return publi;
	}
	
	//getPublicacion
	public Publicacion getPublicacion(Long id) {
		Publicacion pub=null;
		for(Publicacion publicacion: publi) {
			if(publicacion.getId()== id) {
				pub=publicacion;
				break;
			}
		}
		return pub;
	}
	
	
	//deletePublicacion
	public Publicacion deletePublicacion(Long id) {
		Publicacion pub= null;
		for(Publicacion publicacion : publi) {
			if(publicacion.getId()== id) {
				pub= publicacion;
				publi.remove(publicacion);
				break;
			}
		}
		return pub;
	}
	
	
	//addPublicacion
	public Publicacion addPublicacion(Publicacion publicacion) {
		publi.add(publicacion);
		return publicacion;
	}
	
	
	//updatePublicacion
	public Publicacion updatePublicacion(Long id, String descripcion, String imagen) {
		Publicacion pub= null;
		for(Publicacion publicacion : publi) {
			if(publicacion.getId().equals(id)) {
				if(descripcion!=null)publicacion.setDescripcion(descripcion);
				if(imagen!=null)publicacion.setImagen(imagen);
				pub= publicacion;
				break;
			}//if
		}
		return pub;
	}
	
	
}
