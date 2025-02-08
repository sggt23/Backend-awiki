package com.awiki.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.awiki.models.Listing;
import com.awiki.repositories.ListingsRepository;

@Service
public class ListingsService {
//	public List<Listing> listings = new ArrayList<Listing>();
	
	public final ListingsRepository listRep;//ADD
	
	@Autowired
	public ListingsService(ListingsRepository listRep) {
		this.listRep = listRep;
//		super();
		
//		listings.add(new Listing("Restaurant Roma", "Comida italiana", "restaurante", "Congal 13", "Colonia Centro", "Ecatepec", "Estado Mexico", 12345));
//		listings.add(new Listing("Tienda Hernadez", "Ropa y accesorios", "tienda", "Chalala 201", "Colonia Sur", "Nezahualcoyotl", "Veracruz", 67890));
//		listings.add(new Listing("Hotel ABC", "Hospedaje", "hotel", "Calle 3 #30", "Real de Pellejo 34", "Tlanepantla", "Durango", 13579));
//		listings.add(new Listing("Cafetería el dicho", "Café y postres", "cafeteria", "Valladolid 8932", "Colonia Oeste", "Atizapan", "Jalisco", 24680));
//		listings.add(new Listing("Bar Bar", "Bebidas y snacks", "bar", "Calle 5 #50", "Ermozo 604", "Coacalco", "Guerrero", 98765));
	}//CONSTRUCTOR
	
	public List<Listing> getListings() {
		return listRep.findAll();
	}//getListings()
	
	public Listing getListing(Long id) {
		return listRep.findById(id).orElseThrow(() -> new IllegalArgumentException("Listing with ID" + id + "does not exist."));
	}//getListing()
	
	public void addListing(Listing lstng) {
		Optional<Listing> listing = listRep.findByNombre(lstng.getNombre());
		if (listing.isEmpty()) {
			listRep.save(lstng);
		}
	}//addListing()
	
	public void updateListing(Long id, String nombre, String descripcion, String categoria, String direccion, String colonia, String municipio, String estado, Integer codigoPostal) {
			Listing listing = null;
			if (listRep.existsById(id)) {
				if (nombre != null) listing.setNombre(nombre);
				if (descripcion !=null) listing.setDescripcion(descripcion);
				if (categoria !=null) listing.setCategoria(categoria);
				if (direccion !=null) listing.setDireccion(direccion);
				if (colonia !=null) listing.setColonia(colonia);
				if (municipio !=null) listing.setMunicipio(municipio);
				if (estado !=null) listing.setEstado(estado);
				if (codigoPostal !=null) listing.setCodigoPostal(codigoPostal);
				listRep.save(listing);
			}//if
	}//updateListing()
	
	public void deleteListing(Long id) {
		if(listRep.existsById(id)) {
			listRep.deleteById(id);
		}//if
	}
}//CLASS
