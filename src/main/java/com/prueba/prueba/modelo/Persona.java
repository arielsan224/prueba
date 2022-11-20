package com.prueba.prueba.modelo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="PERSONA")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="PRIMER_NOMBRE")
    private  String primernombre;
    @Column (name="SEGUNDO_NOMBRE")
    private  String segundonombre;
    @Column (name ="PRIMER_APELLIDO")
    private  String primerapellido;
    @Column (name="SEGUNDO_APELLIDO")
    private  String segundoapellido;
}
