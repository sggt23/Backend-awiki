package com.awiki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awiki.models.Publicacion;

@Repository
public interface PublicacionesRepository extends JpaRepository<Publicacion, Long> {
	Optional<Publicacion>findByDescripcion(String Descripcion);
}
