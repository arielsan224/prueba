package com.prueba.prueba.repo.daoImpl;

import com.prueba.prueba.modelo.Persona;
import com.prueba.prueba.modelo.mapper.PersonaMapper;
import com.prueba.prueba.repo.dao.PersonaDao;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaDaoImpl implements PersonaDao {

    private final JdbcTemplate jdbcTemplate;

    public PersonaDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Persona> obtenerTodo() {
        return jdbcTemplate.query("select * from persona", new PersonaMapper());
    }

    @Override
    public void guardar(Persona persona) {
        jdbcTemplate.update("INSERT INTO dbo.PERSONA" +
                "([PRIMER_NOMBRE]," +
                "[SEGUNDO_NOMBRE]," +
                "[PRIMER_APELLIDO]," +
                "[SEGUNDO_APELLIDO] )" +
                "VALUES (?,?,?,?)", persona.getPrimernombre(), persona.getSegundonombre(), persona.getPrimerapellido(), persona.getSegundoapellido()
        );

    }

    @Override
    public Optional<Persona> obtenerPorId(int id) {
        return jdbcTemplate.query("select * from persona where id = ?",new PersonaMapper(),id).stream().findFirst();
    }

    @Override
    public void eliminar(int id) {
        jdbcTemplate.update("delete persona where id = ?",id);

    }
}
