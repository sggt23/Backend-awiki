package com.awiki.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awiki.models.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);
}
