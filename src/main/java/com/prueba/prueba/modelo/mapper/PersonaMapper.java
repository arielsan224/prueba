package com.prueba.prueba.modelo.mapper;

import com.prueba.prueba.modelo.Persona;
import com.prueba.prueba.repo.dao.PersonaDao;
import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaMapper implements RowMapper<Persona> {

    @Override
    public Persona mapRow (ResultSet rs, int nowNum) throws SQLException {

        Persona persona = new Persona();
        persona.setId(rs.getInt("ID"));
        persona.setPrimernombre(rs.getString(  "PRIMER_NOMBRE"));
        persona.setSegundonombre(rs.getString( "SEGUNDO_NOMBRE"));
        persona.setPrimerapellido(rs.getString("PRIMER_APELLIDO"));
        persona.setSegundoapellido(rs.getString("SEGUNDO_APELLIDO"));
        return persona;
    }


}
