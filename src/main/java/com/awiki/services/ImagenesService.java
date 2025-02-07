package com.awiki.services;

import com.awiki.models.Imagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImagenesService {

    private final List<Imagen> imagenes = new ArrayList <>();

    @Autowired
    public void ImagenService() {
    	
    	imagenes.add(new Imagen("url/imagen1.jpg", 1, 101));
        imagenes.add(new Imagen("url/imagen2.png", 2, 102));
        imagenes.add(new Imagen("url/imagen3.gif", 3, 103));
        imagenes.add(new Imagen("url/imagen4.jpeg", 4, 104));
        imagenes.add(new Imagen("url/imagen5.svg", 5, 105));
        imagenes.add(new Imagen("url/imagen6.webp", 6, 106));
        imagenes.add(new Imagen("url/imagen7.bmp", 7, 107));
        imagenes.add(new Imagen("url/imagen8.tiff", 8, 108));
        imagenes.add(new Imagen("url/imagen9.ico", 9, 109));
        imagenes.add(new Imagen("url/imagen10.avif", 10, 110));
    		
    	}

    public List<Imagen> getAllImagenes() {
        return imagenes;
    }

    public Imagen getImagen(Long id) {
    	Imagen img = null;
        for (Imagen imagen : imagenes) {
            if (imagen.getId().equals(id)) {
                img = imagen;
                break;
            }
        }
        return img;
        }
    
    public Imagen deleteImagen(Long id) {
        Imagen img = null;
        for (Imagen imagen : imagenes) {
            if (imagen.getId().equals(id)) {
                img = imagen;
                imagenes.remove(imagen);
                break;
            }
        }
        return img;
    }

    public Imagen addImagen(Imagen imagen) {
        imagenes.add(imagen);
        return imagen;
    }

    

    public Imagen updateImagen(Long id, String url) {
        Imagen img = null;
        for (Imagen imagen : imagenes) {
            if (imagen.getId().equals(id)) {
                if (url != null) imagen.setUrl(url);
                if (id != null) imagen.setId(id);
                img = imagen;
                break;
            }
        }
        return img;
    }
}