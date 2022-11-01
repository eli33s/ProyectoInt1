package com.portafolioweb.appsecurityRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portafolioweb.appsecurityEntity.Rol;
import com.portafolioweb.appsecurityEnums.RolNombre;



@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}