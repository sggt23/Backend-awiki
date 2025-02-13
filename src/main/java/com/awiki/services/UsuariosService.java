package com.awiki.services;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awiki.models.Usuario;
import com.awiki.repositories.UsuariosRepository;

@Service
public class UsuariosService {

    //private final List<Usuario> listaUsuarios = new ArrayList<>();
   
  private final UsuariosRepository usuariosRepository;
    
   @Autowired 
   public UsuariosService(UsuariosRepository usuariosRepository) {
		super();
		this.usuariosRepository = usuariosRepository;
	} //constructor

    // getAllUsuarios
    public List<Usuario> getAllUsuarios() {
        return usuariosRepository.findAll();
    }

    
    // getUsuario
    public Usuario getUsuario(Long id) {
       return usuariosRepository.findById(id).orElseThrow(
    		   () -> new IllegalArgumentException("El usuario con el id ["
    			        + id + "] no existe.")
    			    );    
    } //getUsuario

    
    // deleteUsuario
    public Usuario deleteUsuario(Long id) {
        Usuario usuario = null;
        if (usuariosRepository.existsById(id)) {
            usuario = usuariosRepository.findById(id).get(); // Obtener el usuario
            usuariosRepository.deleteById(id); // Eliminar el usuario por su ID
        } // if
        return usuario; // Devolver el usuario eliminado (o null si no existe)
    } // deleteUsuario

    
    public Usuario addUsuario(Usuario usuario) {
  	  
 	   Optional<Usuario> user=usuariosRepository.findByEmail(usuario.getEmail());
 	   if(user.isEmpty()) {
 		   usuario.setContrasena(usuario.getContrasena());
 		   return usuariosRepository.save(usuario);
 	   }else {
 		   return null;
 	   }
 	   
 	} // add usuario


    // updateUsuario
    
    public Usuario updateUsuario(
    		Long id, String nombre, String apellido, String email,
    		String contrasena, String imagenPerfil, String descripcionPerfil,
    		Boolean esPerfilEmpresa) {
        Usuario usuarioActualizado = null;
        if (usuariosRepository.existsById(id)) { // Obtener el usuario por su ID
            Usuario usuario = usuariosRepository.findById(id).get();
            // Actualizar los campos si no son nulos
            if (nombre != null) usuario.setNombre(nombre);
            if (apellido != null) usuario.setApellido(apellido);
            if (email != null) usuario.setEmail(email);
            if (contrasena != null) usuario.setContrasena(contrasena);
            if (imagenPerfil != null) usuario.setImagenPerfil(imagenPerfil);
            if (descripcionPerfil != null) usuario.setDescripcionPerfil(descripcionPerfil);
            if (esPerfilEmpresa != null) usuario.setEsPerfilEmpresa(esPerfilEmpresa);

            
            usuariosRepository.save(usuario);

        
            usuarioActualizado = usuario;
        }

        return usuarioActualizado;
    }
}

