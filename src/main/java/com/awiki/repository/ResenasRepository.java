package com.awiki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awiki.models.Resena;

@Repository
public interface ResenasRepository extends JpaRepository<Resena, Long> {

	Optional<Resena> findByDescripcion(String descripcion);
	
}
