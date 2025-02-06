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


import com.awiki.models.Usuario;
import com.awiki.services.UsuariosService;

@RestController
@RequestMapping(path = "api/usuarios/")
public class UsuariosController {

    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }
    
    @GetMapping
    public List <Usuario> getUsuarios(){
    	return usuariosService.getAllUsuarios();
    	
 	
    }
    
    
    @GetMapping(path = "{usuId}")
    public Usuario getUsuario(@PathVariable("usuId")Long id) {
    	return usuariosService.getUsuario(id);
    }
    
    @DeleteMapping(path="{usuId}")
	public Usuario deletUsuario(@PathVariable("usuId") Long id) {
		return usuariosService.deleteUsuario(id);
	}
	@PostMapping
	public Usuario adUsuario(@RequestBody Usuario usuario) {
		return usuariosService.addUsuario(usuario);
	}
	 @PutMapping(path = "{usuId}")
	    public Usuario updateUsuario(@PathVariable("usuId") Long idusuarios,
	                                 @RequestParam(name="nombre", required=false) String nombre,
	                                 @RequestParam(name="email", required=false) String email,
	                                 @RequestParam(name="nombre_usuario", required=false) String nombre_usuario,
	                                 @RequestParam(name="contraseña", required=false) String contraseña,
	                                 @RequestParam(name="imagen_perfil", required=false) String imagen_perfil,
	                                 @RequestParam(name="descripcion_perfil", required=false) String descripcion_perfil,
	                                 @RequestParam(name="es_perfil_empresa", required=false) Boolean es_perfil_empresa) {
	        return usuariosService.updateUsuario(idusuarios, nombre, email, nombre_usuario, contraseña, imagen_perfil, descripcion_perfil, es_perfil_empresa);

}

}




