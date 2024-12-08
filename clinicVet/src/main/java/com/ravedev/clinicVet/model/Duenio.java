package com.ravedev.clinicVet.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "duenio")
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String dni;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String celular;
}
