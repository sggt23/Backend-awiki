package com.awiki.services;

import java.util.*;

import org.springframework.stereotype.Service;
import com.awiki.models.Listing;

@Service
public class ListingsService {
	public List<Listing> listings = new ArrayList<>();
	
	public ListingsService() {
		super();
		listings.add(new Listing("Restaurant Roma", "Comida italiana", "restaurante", "Congal 13", "Colonia Centro", "Ecatepec", "Estado Mexico", 12345));
		listings.add(new Listing("Tienda Hernadez", "Ropa y accesorios", "tienda", "Chalala 201", "Colonia Sur", "Nezahualcoyotl", "Veracruz", 67890));
		listings.add(new Listing("Hotel ABC", "Hospedaje", "hotel", "Calle 3 #30", "Real de Pellejo 34", "Tlanepantla", "Durango", 13579));
		listings.add(new Listing("Cafetería el dicho", "Café y postres", "cafeteria", "Valladolid 8932", "Colonia Oeste", "Atizapan", "Jalisco", 24680));
		listings.add(new Listing("Bar Bar", "Bebidas y snacks", "bar", "Calle 5 #50", "Ermozo 604", "Coacalco", "Guerrero", 98765));
	}//CONSTRUCTOR
	
	public List<Listing> getListings() {
		return listings;
	}//getListings()
	
	public Listing getListing(Long id) {
		Listing res = null;
		for (Listing lstng : listings) {
			if (lstng.getId() == id) {
				res = lstng;
				return res;
			}//if
		}//for
		return res;
	}//getListing()
	
	public String addListing(Listing l) {
		String listingName = l.getNombre();
		for (Listing lstng : listings) {
			if (lstng.getNombre() == listingName) {
				return "FAILED: LISTING ALREADY EXISTS.";
			}//if
		}//for
		listings.add(l);
		return "SUCCESS!";
	}//addListing()
	
	public String updateListing(Long id, String nombre, String descripcion, String categoria, String direccion, String colonia, String municipio, String estado, Integer codigoPostal) {
		for(Listing lstng : listings) {
			if (lstng.getId() == id) {
				if (nombre != null) lstng.setNombre(nombre);
				if (descripcion !=null) lstng.setDescripcion(descripcion);
				if (categoria !=null) lstng.setCategoria(categoria);
				if (direccion !=null) lstng.setDireccion(direccion);
				if (colonia !=null) lstng.setColonia(colonia);
				if (municipio !=null) lstng.setMunicipio(municipio);
				if (estado !=null) lstng.setEstado(estado);
				if (codigoPostal !=null) lstng.setCodigoPostal(codigoPostal);
				return "SUCCESS!";
			}//if
		}//for
		return "FAILED: LISTING DOES NOT EXIST.";
	}//updateListing()
	
	public String deleteListing(Long id) {
		for(Listing lstng : listings) {
			if (lstng.getId() == id) {
				listings.remove(lstng);
				return "SUCCESS!";
			}
		}
		return "FAILED: LISTING DOES NOT EXIST.";
	}
}//CLASS
