package com.awiki.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.awiki.models.Resena;
import com.awiki.services.ResenasService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api/resenas/")
public class ResenasController {
	private final ResenasService resenaService;

	@Autowired
	public ResenasController(ResenasService resenaService) {
		this.resenaService = resenaService;
	}//CONSTRUCTOR
	
	
	@GetMapping
	public List<Resena> getResenas(){
		return resenaService.getAllResenas();
	}//GET controller (all)

	@GetMapping(path="{resId}")
	public Resena getResena(@PathVariable("resId")long id) {
		return resenaService.getResena(id);
	}//GET controller (one)
	
	@PostMapping
	public Resena addResena(@RequestBody Resena resena) {
		return resenaService.addResena(resena);
	}//POST controller
	
	@PutMapping(path="{resId}")
	public Resena updateResena(@PathVariable("resId")long id,
			@RequestParam(required = false, name = "descripcion")String descripcion,
			@RequestParam(required = false, name = "calificacion")Integer calificacion) {
		return resenaService.updateResena(id, descripcion, calificacion);
	}//PUT controller
	
	@DeleteMapping(path="{resId}")
	public Resena deleteResena(@PathVariable("resId")long id) {
		return resenaService.deleteResena(id);
	}//DELETE controller
}//CLASS