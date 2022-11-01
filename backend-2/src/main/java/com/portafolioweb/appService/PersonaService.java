package com.portafolioweb.appService;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portafolioweb.appEntity.Persona;
import com.portafolioweb.apprepository.PersonaRepository;



@Service

@Transactional
public class PersonaService {
	@Autowired
    PersonaRepository personaRepository;

    public List<Persona> list(){
        return personaRepository.findAll();
    }

    public Optional<Persona> getOne(Long id){
        return personaRepository.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre){
        return personaRepository.findByNombre(nombre);
    }

    public void  save(Persona persona){
    	personaRepository.save(persona);
    }

    public void delete(Long id){
        personaRepository.deleteById(id);
    }

    public boolean existsById(Long id){
        return personaRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre){
        return personaRepository.existsByNombre(nombre);
    }
	

}
