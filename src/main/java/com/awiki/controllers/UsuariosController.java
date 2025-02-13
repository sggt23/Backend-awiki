package com.awiki.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.awiki.models.Resena;
import com.awiki.models.Usuario;
import com.awiki.services.UsuariosService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "api/usuarios/")
public class UsuariosController {

    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }//CONSTRUCTOR
    
    @GetMapping
    public List<Usuario> getUsuarios(){
    	return usuariosService.getAllUsuarios();
    }//GET controller (all)
    
    @GetMapping(path = "{id}")
    public Usuario getUsuario(@PathVariable("id") Long id) {
    	return usuariosService.getUsuario(id);
    }//GET controller (one)
    
    @PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuariosService.addUsuario(usuario);
    }//POST controller
	
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

	}//PUT controller
	
	@DeleteMapping(path="{id}")
	public Usuario deleteUsuario(@PathVariable("id") Long id) {
			return usuariosService.deleteUsuario(id);
	}//DELETE controller
}//CLASS