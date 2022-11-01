package com.portafolioweb.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import com.portafolioweb.appEntity.Persona;
import com.portafolioweb.appService.PersonaService;
import com.portafolioweb.appdto.Mensaje;
import com.portafolioweb.appdto.PersonaDto;

@RequestMapping
@RestController
public class PersonaController {
	@Autowired
    PersonaService personaService;

    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = personaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") Long id){
        if(personaService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Persona persona = personaService.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @GetMapping("/detailname/{nombre}")
    public ResponseEntity<Persona> getByNombre(@PathVariable("nombre") String nombre){
        if(!personaService.existsByNombre(nombre))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
       Persona persona = personaService.getByNombre(nombre).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

   @PreAuthorize("hasRol('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody PersonaDto personaDto){
    	 if(StringUtils.containsWhitespace(personaDto.getNombre()))
             return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
         if(StringUtils.containsWhitespace(personaDto.getApellido()))
             return new ResponseEntity(new Mensaje("el apellido es obligatorio"), HttpStatus.BAD_REQUEST);
         
         Persona persona = new Persona (personaDto.getNombre(), personaDto.getApellido(),personaDto.getApellido());
         personaService.save(persona);
         return new ResponseEntity(new Mensaje("persona creada"), HttpStatus.OK);
     
    }

    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody PersonaDto personaDto){
        if(!personaService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(StringUtils.containsWhitespace(personaDto.getNombre()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.containsWhitespace(personaDto.getApellido()))
            return new ResponseEntity(new Mensaje("el apellido es obligatorio"), HttpStatus.BAD_REQUEST);
        

        Persona persona = personaService.getOne(id).get();
        persona.setNombre(personaDto.getNombre());
        persona.setApellido(personaDto.getApellido());
        personaService.save(persona);
        return new ResponseEntity(new Mensaje("persona actualizada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRol('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Long id){
        if(!personaService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        personaService.delete(id);
        return new ResponseEntity(new Mensaje("persona eliminada"), HttpStatus.OK);
    }

}
