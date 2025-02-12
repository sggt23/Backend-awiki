package com.awiki.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.awiki.models.Listing;

	@Repository
	public interface ListingsRepository extends JpaRepository<Listing, Long>{
		Optional<Listing> findByNombre(String nombre);
	}
