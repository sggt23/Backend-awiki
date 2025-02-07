package com.awiki.services;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awiki.models.Usuario;
import com.awiki.repository.UsuariosRepository;

@Service
public class UsuariosService {

    //private final List<Usuario> listaUsuarios = new ArrayList<>();
   
  private final UsuariosRepository usuariosRepository;
    
    
   @Autowired 
   public UsuariosService(UsuariosRepository usuariosRepository) {
		super();
		this.usuariosRepository = usuariosRepository;
	} //constructor

// public UsuariosService() {
      //  listaUsuarios.add(new Usuario("Juan Pérez", "juan.perez@example.com", "juanperez", "password123", "ruta/imagen1.jpg", "Soy Juan", false));
        //listaUsuarios.add(new Usuario("María García", "maria.garcia@example.com", "mariagarcia", "secreto456", "ruta/imagen2.jpg", "Comerciante", true));
        //listaUsuarios.add(new Usuario("Carlos López", "carlos.lopez@example.com", "carloslopez", "clave789", "ruta/imagen3.jpg", "Emprendedor", false));
        //listaUsuarios.add(new Usuario("Ana Rodríguez", "ana.rodriguez@example.com", "anarodriguez", "contraseña10", "ruta/imagen4.jpg", "Amante de la naturaleza", false));
        //listaUsuarios.add(new Usuario("Pedro Martínez", "pedro.martinez@example.com", "pedromartinez", "miclave11", "ruta/imagen5.jpg", "Restaurantero", true));
  //  }

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
 		   usuario.setContraseña(usuario.getContraseña());
 		   return usuariosRepository.save(usuario);
 	   }else {
 		   return null;
 	   }
 	   
 	} // add usuario


    // updateUsuario
    
    public Usuario updateUsuario(long idusuarios, String nombre, String email, String nombre_usuario, String contraseña, String imagen_perfil, String descripcion_perfil, Boolean es_perfil_empresa) {
        Usuario usuarioActualizado = null;


        if (usuariosRepository.existsById(idusuarios)) { // Obtener el usuario por su ID
           
            Usuario usuario = usuariosRepository.findById(idusuarios).get();

            // Actualizar los campos si no son nulos
            if (nombre != null) usuario.setNombre(nombre);
            if (email != null) usuario.setEmail(email);
            if (nombre_usuario != null) usuario.setNombre_usuario(nombre_usuario);
            if (contraseña != null) usuario.setContraseña(contraseña);
            if (imagen_perfil != null) usuario.setImagen_perfil(imagen_perfil);
            if (descripcion_perfil != null) usuario.setDescripcion_perfil(descripcion_perfil);
            if (es_perfil_empresa != null) usuario.setEs_perfil_empresa(es_perfil_empresa);

            
            usuariosRepository.save(usuario);

        
            usuarioActualizado = usuario;
        }

        return usuarioActualizado;
    }
}

