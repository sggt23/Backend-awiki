package com.awiki.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awiki.models.Resena;

@Service
public class ResenasService {
	public final List<Resena> listRes = new ArrayList <>();
	
	@Autowired
	public ResenasService() {
		listRes.add(new Resena("¡Excelente servicio y comida deliciosa!", 5));
		listRes.add(new Resena("Muy buen ambiente y atención.", 4));
		listRes.add(new Resena("La comida estaba un poco fría.", 3));
		listRes.add(new Resena("No me gustó la decoración del lugar.", 2));
		listRes.add(new Resena("¡Los postres son increíbles!", 5));
	}//Constructor


	public List<Resena> getAllResenas() {
		return listRes;
	}//getAllResenas


	public Resena getResena(long id) {
		Resena res=null;
		for(Resena resena: listRes) {
			if(resena.getId()==id) {
				res=resena;
				break;
			}
		}
		return res;
	}//get1resena


	public Resena deleteResena(long id) {
		Resena res=null;
		for(Resena resena: listRes) {
			if(resena.getId()==id) {
				res=resena;
				listRes.remove(resena);
				break;
			}
		}
		return res;
	}//DeleteResena


	public Resena addResena(Resena resena) {
		listRes.add(resena);
		return resena;
	}//addResena


	public Resena updateResena(long id, String descripcion, Integer calificacion) {
		Resena res = null;
		for(Resena resena : listRes) {
			if(resena.getId().equals(id)) {
				if(descripcion!=null) resena.setDescripcion(descripcion);
				if(calificacion!=null) resena.setCalificacion(calificacion);
				res=resena;
				break;
			}//if
	}
		return res;
	}//updateResena
	
	
	
	
	
	
	

}//public class ResenasService
