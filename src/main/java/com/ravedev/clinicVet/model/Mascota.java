package com.ravedev.clinicVet.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String especie;

    @Column(nullable = false)
    private String raza;

    @Column(nullable = false)
    private String color;

    @OneToOne
    @JoinColumn(name = "id_duenio", referencedColumnName = "id")
    private Duenio duenio;
}
