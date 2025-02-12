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
	public void addListing(@RequestBody Listing listing) {
		ls.addListing(listing);
	}//addListing()
	
	@PutMapping(path="{listing}")
	public void updateListing(
		@PathVariable("listing") Long id,
		@RequestParam(name="nombre", required=false) String nombre,
		@RequestParam(name="nombreCalle", required=false) String nombreCalle,
		@RequestParam(name="numeroCalle", required=false) String numeroCalle,
		@RequestParam(name="colonia", required=false) String colonia,
		@RequestParam(name="municipio", required=false) String municipio,
		@RequestParam(name="estado", required=false) String estado,
		@RequestParam(name="codigoPostal", required=false) String codigoPostal,
		@RequestParam(name="descripcion", required=false) String descripcion,
		@RequestParam(name="telefonoContacto", required=false) String telefonoContacto,
		@RequestParam(name="emailContacto", required=false) String emailContacto,
		@RequestParam(name="sitioWeb", required=false) String sitioWeb,
		@RequestParam(name="tipoNegocio", required=false) String tipoNegocio,
		@RequestParam(name="tipoCocina", required=false) String tipoCocina,
		@RequestParam(name="tipoProductos", required=false) String tipoProductos,
		@RequestParam(name="categoriaHotel", required=false) Integer categoriaHotel,
		@RequestParam(name="horarios", required=false) String horarios,
		@RequestParam(name="horarioCheckInOut", required=false) String horarioCheckInOut
		) {
			ls.updateListing(id, nombre, nombreCalle, numeroCalle, colonia, municipio, estado, codigoPostal, descripcion, telefonoContacto, emailContacto, sitioWeb, tipoNegocio, tipoCocina, tipoProductos, categoriaHotel, horarios, horarioCheckInOut);
		}
	
	@DeleteMapping(path="{listingId}")
	public void deleteListing(@PathVariable("listingId") Long id) {
		ls.deleteListing(id);
	}
}
