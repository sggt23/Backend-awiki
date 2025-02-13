package com.awiki.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awiki.models.Resena;
import com.awiki.repositories.ResenasRepository;

@Service
public class ResenasService {
	public final ResenasRepository resenasRepository;
	
	@Autowired
	public ResenasService(ResenasRepository resenasRepository) {
		this.resenasRepository = resenasRepository;
	}//constructor

	public List<Resena> getAllResenas() {
		return resenasRepository.findAll();

	}//getAllResenas


	public Resena getResena(long id) {
		return resenasRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("La resena con el id["
						+ id +"] no existe")
				);
	}//get1resena


	public Resena deleteResena(long id) {
		Resena res=null;
		if(resenasRepository.existsById(id)) {
			res = resenasRepository.findById(id).get();
			resenasRepository.deleteById(id);
		}//if exist
		return res;
	}//DeleteResena


	public Resena addResena(Resena resena) {
		Optional<Resena> res = resenasRepository.findByDescripcion(resena.getDescripcion());
		if(res.isEmpty()) {
			return resenasRepository.save(resena);
		}else {
			return null;
		}//else
	}//addResena


	public Resena updateResena(long id, String descripcion, Integer calificacion) {
		Resena res = null;
		if(resenasRepository.existsById(id)) {
			Resena resena = resenasRepository.findById(id).get();
				if(descripcion!=null) resena.setDescripcion(descripcion);
				if(calificacion!=null) resena.setCalificacion(calificacion);
				resenasRepository.save(resena);
				res=resena;
			}//if
		return res;
	}//updateResena
	
	
	
	
	
	
	

}//public class ResenasService
