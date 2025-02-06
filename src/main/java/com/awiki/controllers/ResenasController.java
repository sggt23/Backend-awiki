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

import com.awiki.models.Resena;
import com.awiki.service.ResenasService;

@RestController
@RequestMapping(path="/api/resenas/") //http://localhost:8080/api/resenas/
public class ResenasController {
	private final ResenasService resenaService;

	@Autowired
	public ResenasController(ResenasService resenaService) {
		this.resenaService = resenaService;
	}//Constructor
	
	
	@GetMapping
	public List<Resena> getResenas(){
		return resenaService.getAllResenas();
	}//getAllResenas

	@GetMapping(path="{resId}")
	public Resena getResena(@PathVariable("resId")long id) {
		return resenaService.getResena(id);
	}//getResena
	
	@DeleteMapping(path="{resId}")
	public Resena deleteResena(@PathVariable("resId")long id) {
		return resenaService.deleteResena(id);
	}//deleteProducto
	
	@PostMapping
	public Resena addResena(@RequestBody Resena resena) {
		return resenaService.addResena(resena);
	}//addResena
	
	@PutMapping(path="{resId}")
	public Resena updateResena(@PathVariable("resId")long id,
			@RequestParam(required = false, name = "descripcion")String descripcion,
			@RequestParam(required = false, name = "calificacion")Integer calificacion) {
		return resenaService.updateResena(id, descripcion, calificacion);
	}//updateResena
	
	
	
	
}//public class ProductosController
