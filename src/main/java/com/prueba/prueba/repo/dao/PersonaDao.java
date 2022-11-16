package com.prueba.prueba.repo.dao;

import com.prueba.prueba.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaDao {

    List<Persona> obtenerTodo();
    void guardar (Persona persona);

    public Optional<Persona> obtenerPorId(int id);

    void  eliminar(int id);


}
