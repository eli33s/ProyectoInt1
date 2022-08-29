
package com.Portafolioweb.mgb.service;

import com.Portafolioweb.mgb.entity.Persona;
import com.Portafolioweb.mgb.interfeace.IPersonaService;
import com.Portafolioweb.mgb.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImpPersonaService implements IPersonaService {
@Autowired IPersonaRepository IpersonaRepository;
    @Override
    public List<Persona> getPersona() {
    List<Persona> persona =IpersonaRepository.findAll();
            return persona;
    }
    

    @Override
    public void savePersona(Persona persona) {
        IpersonaRepository.save(persona);
    }

    @Override
    public void deletPersona(long id) {
    IpersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(long id) {
       Persona persona = IpersonaRepository.findById(id).orElse(null);
       return persona;
    }

    @Override
    public void deletePersona(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
