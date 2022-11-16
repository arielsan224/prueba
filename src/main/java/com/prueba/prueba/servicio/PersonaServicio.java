package com.prueba.prueba.servicio;

import com.prueba.prueba.modelo.Persona;
import com.prueba.prueba.repo.dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {
    private final PersonaDao personaDao;

    @Autowired
    public PersonaServicio(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }
    public List<Persona> obtenerTodo() {
        return personaDao.obtenerTodo();
    }

    public void guardar(Persona persona) {
        personaDao.guardar(persona);
    }

    public Optional<Persona> obtenerPorId(int id) {
        return personaDao.obtenerPorId(id);
    }


    public void eliminar(int id) {
        personaDao.eliminar(id);

    }

}
