
package com.Portafolioweb.mgb.repository;

import com.Portafolioweb.mgb.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Long>{
  
}
