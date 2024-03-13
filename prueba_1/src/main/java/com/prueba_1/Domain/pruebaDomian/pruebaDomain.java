package com.prueba_1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "prueba_01")

public class pruebaDomain implements Serializable { 

    private static final long serialVersionUID = 1L;

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_examen") 
    private long id_examen;
    private String nombre;
    private double nota_examen;
    private String rutaImagen;
   
public pruebaDomain {
    }

    public pruebaDomainng descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

   
    }

