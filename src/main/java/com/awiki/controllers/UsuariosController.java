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
    
    @GetMapping(path = "{id}")
    public Usuario getUsuario(@PathVariable("id") Long id) {
    	return usuariosService.getUsuario(id);
    }
    
    @PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuariosService.addUsuario(usuario);
    }
    
    
	
	@PutMapping(path = "{id}")
    public Usuario updateUsuario(@PathVariable("id") Long id,
         @RequestParam(name="nombre", required=false) String nombre,
         @RequestParam(name="apellido", required=false) String apellido,
         @RequestParam(name="email", required=false) String email,
         @RequestParam(name="contrasena", required=false) String contrasena,
         @RequestParam(name="imagenPerfil", required=false) String imagenPerfil,
         @RequestParam(name="descripcionPerfil", required=false) String descripcionPerfil,
         @RequestParam(name="esPerfilEmpresa", required=false) Boolean esPerfilEmpresa) {
       return usuariosService.updateUsuario(id, nombre, apellido, email, contrasena, imagenPerfil, descripcionPerfil, esPerfilEmpresa);

}	

}
