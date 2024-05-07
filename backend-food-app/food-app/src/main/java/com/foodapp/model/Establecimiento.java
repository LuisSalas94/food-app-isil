package com.foodapp.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "establecimiento")
public class Establecimiento {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;
    private String nombre;
    private String raz_social;
    private String descripcion;
    private String direccion;
    private String horario;
    private String telefono;
    private String email;


}
