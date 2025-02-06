package com.awiki.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.awiki.models.Listing;
import com.awiki.services.ListingsService;

@RestController
@RequestMapping(path="/api/listings/")
public class ListingsController {
	
	private final ListingsService ls;
	
	@Autowired
	public ListingsController(ListingsService ls) {
		super();
		this.ls = ls;
	}//CONSTRUCTOR
	
	@GetMapping
	public List<Listing> getListings(){
		return ls.getListings();
	}//getListings()
	
	@GetMapping(path="{listingId}")
	public Listing getListing(@PathVariable("listingId") Long id) {
		return ls.getListing(id);
	}//getListing()
	
	@PostMapping
	public void addProduct(@RequestBody Listing listing) {
		ls.addListing(listing);
	}//addListing()
	
	@PutMapping(path="{listing}")
	public void updateListing(
		@PathVariable("listing") Long id,
		@RequestParam(name="nombre", required=false) String nombre,
		@RequestParam(name="descripcion", required=false) String descripcion,
		@RequestParam(name="categoria", required=false) String categoria,
		@RequestParam(name="direccion", required=false) String direccion,
		@RequestParam(name="colonia", required=false) String colonia,
		@RequestParam(name="municipio", required=false) String municipio,
		@RequestParam(name="estado", required=false) String estado,
		@RequestParam(name="codigoPostal", required=false) Integer codigoPostal
		) {
			ls.updateListing(id, nombre, descripcion, categoria, direccion, colonia, municipio, estado, codigoPostal);
		}
	
	@DeleteMapping(path="{listingId}")
	public void deleteListing(@PathVariable("listingId") Long id) {
		ls.deleteListing(id);
	}
}
