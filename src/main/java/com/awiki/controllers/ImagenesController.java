package com.awiki.controllers;

import com.awiki.models.Imagen;
import com.awiki.services.ImagenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/imagenes/")
public class ImagenesController {

    private final ImagenesService imagenesService;

    @Autowired
    public ImagenesController(ImagenesService imagenesService) {
        this.imagenesService = imagenesService;
    }

    @GetMapping
    public List<Imagen> getImagenes() {
        return imagenesService.getAllImagenes();
    }

    @GetMapping(path = "{id}")
    public Imagen getImagen(@PathVariable("id") Long id) {
        return imagenesService.getImagen(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteImagen(@PathVariable("id") Long id) {
        imagenesService.deleteImagen(id);
    }

    @PostMapping
    public Imagen addImagen(@RequestBody Imagen imagen) {
        return imagenesService.addImagen(imagen);
    }

    @PutMapping(path = "{id}")
    public Imagen updateImagen(@PathVariable("id") Long id,
                               @RequestParam(required = false, name = "url") String url) {
        return imagenesService.updateImagen(id, url);
    }
}
