package com.prueba.prueba.crud;

import com.prueba.prueba.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrud extends CrudRepository<Persona, Integer> {
}
