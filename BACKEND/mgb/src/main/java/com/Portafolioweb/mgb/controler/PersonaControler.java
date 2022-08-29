
package com.Portafolioweb.mgb.controler;

import com.Portafolioweb.mgb.entity.Persona;
import com.Portafolioweb.mgb.interfeace.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PersonaControler {
    @Autowired IPersonaService IpersonaService;
    
    @GetMapping("personas/traer")
    public List <Persona> getPersona()
    {
return IpersonaService.getPersona();}

@PostMapping("/personas/traer")
public String createPersona(@RequestBody Persona persona){
IpersonaService.savePersona(persona);
return "La persona fue creada correctamente";
}

@DeleteMapping("personas/borrar/(id)")
public String deletePersona (@PathVariable Long id){
IpersonaService.deletePersona(id);
return "La persona fue eliminada correctamente";
}
@PutMapping ("Personas/editar/(id)")
public Persona editPersona (@PathVariable Long id,
       @RequestParam("nombre") String nuevoNombre,
       @RequestParam("apellido") String nuevoApellido,
       @RequestParam("img")String nuevoImg)
       
       {Persona persona=IpersonaService.findPersona (id);
persona.setNombre(nuevoNombre);
persona.setApellido(nuevoApellido);
persona.setImg(nuevoImg);
IpersonaService.savePersona(persona);
return persona;}
}