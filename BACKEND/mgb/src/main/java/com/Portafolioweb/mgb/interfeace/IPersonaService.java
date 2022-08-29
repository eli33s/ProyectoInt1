
package com.Portafolioweb.mgb.interfeace;

import com.Portafolioweb.mgb.entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersona();
    public void savePersona(Persona persona);
    public void deletPersona (long id);
    public Persona findPersona(long id);

    public void deletePersona(long id);
}
