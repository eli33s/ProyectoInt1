package com.portafolioweb.apprepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portafolioweb.appEntity.Persona;



@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	    Optional<Persona> findByNombre(String nombre);
	    boolean existsByNombre(String nombre);
	}


