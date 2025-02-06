package com.awiki.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.awiki.models.Usuario;

@Service
public class UsuariosService {

    private final List<Usuario> listaUsuarios = new ArrayList<>();

    public UsuariosService() {
        listaUsuarios.add(new Usuario("Juan Pérez", "juan.perez@example.com", "juanperez", "password123", "ruta/imagen1.jpg", "Soy Juan", false));
        listaUsuarios.add(new Usuario("María García", "maria.garcia@example.com", "mariagarcia", "secreto456", "ruta/imagen2.jpg", "Comerciante", true));
        listaUsuarios.add(new Usuario("Carlos López", "carlos.lopez@example.com", "carloslopez", "clave789", "ruta/imagen3.jpg", "Emprendedor", false));
        listaUsuarios.add(new Usuario("Ana Rodríguez", "ana.rodriguez@example.com", "anarodriguez", "contraseña10", "ruta/imagen4.jpg", "Amante de la naturaleza", false));
        listaUsuarios.add(new Usuario("Pedro Martínez", "pedro.martinez@example.com", "pedromartinez", "miclave11", "ruta/imagen5.jpg", "Restaurantero", true));
    }

    // getAllUsuarios
    public List<Usuario> getAllUsuarios() {
        return listaUsuarios;
    }

    // getUsuario
    public Usuario getUsuario(Long id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getIdusuarios().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    // deleteUsuario
    public Usuario deleteUsuario(Long id) {
        Usuario usuarioAEliminar = getUsuario(id);
        if (usuarioAEliminar != null) {
            listaUsuarios.remove(usuarioAEliminar);
            return usuarioAEliminar;
        }
        return null;
    }

    // addUsuario
    public Usuario addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        return usuario;
    }

    // updateUsuario
    public Usuario updateUsuario(Long idusuarios, String nombre, String email, String nombre_usuario, String contraseña, String imagen_perfil, String descripcion_perfil, Boolean es_perfil_empresa) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getIdusuarios().equals(idusuarios)) {
                if (nombre != null) usuario.setNombre(nombre);
                if (email != null) usuario.setEmail(email);
                if (nombre_usuario != null) usuario.setNombre_usuario(nombre_usuario);
                if (contraseña != null) usuario.setContraseña(contraseña);
                if (imagen_perfil != null) usuario.setImagen_perfil(imagen_perfil);
                if (descripcion_perfil != null) usuario.setDescripcion_perfil(descripcion_perfil);
                if (es_perfil_empresa != null) usuario.setEs_perfil_empresa(es_perfil_empresa);
                return usuario;
            }
        }
        return null;
    }
}


