package com.prueba.prueba.web;


import com.prueba.prueba.modelo.Persona;
import com.prueba.prueba.servicio.PersonaServicio;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonaControlador {

    private PersonaServicio personaServicio;

    public PersonaControlador(PersonaServicio personaServicio) {
        this.personaServicio = personaServicio;
    }

    @GetMapping("/todo")
    @ApiOperation("Obtiene Todos los registros de Personas")
    public List<Persona> obtenerTodo(){
        return personaServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public void guardar (@RequestBody Persona persona){
        personaServicio.guardar(persona);
    }

    @GetMapping("/{id}")
    public Optional<Persona> obtenerPorId(@PathVariable int id){
        return personaServicio.obtenerPorId(id);
    }
    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable int id){
        personaServicio.eliminar(id);
    }
}
