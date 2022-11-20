package com.prueba.prueba.servicio;

import com.prueba.prueba.crud.PersonaCrud;
import com.prueba.prueba.modelo.Persona;
import com.prueba.prueba.repo.dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {
    private final PersonaCrud personaCrud;
    private final PersonaDao personaDao;

    @Autowired
    public PersonaServicio(PersonaDao personaDao, PersonaCrud personaCrud) {
        this.personaCrud = personaCrud;
        this.personaDao = personaDao;
    }
    public List<Persona> obtenerTodo() {
        return (List<Persona>) personaCrud.findAll();
    }

    public void guardar(Persona persona) {
        //personaDao.guardar(persona);
        personaCrud.save(persona);
    }

    public void guardarDao(Persona persona) {
        //personaDao.guardar(persona);
        personaCrud.save(persona);
    }

  /*  public Persona guardarsimple(Persona persona) {
        return personaDao.guardarSimple(persona);

    }*/

    public Optional<Persona> obtenerPorId(int id) {
        //return personaDao.obtenerPorId(id);
        return personaCrud.findById(id);
    }


    public void eliminar(int id) {
        //personaDao.eliminar(id);
        personaCrud.deleteById(id);

    }

}
