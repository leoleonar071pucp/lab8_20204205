package com.example.lab8_20204205gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String tipo_planeta;
    @Column(nullable = false)
    private Byte habitable;
    @Column(nullable = false)
    private Double gravedad_relativa;
    @Column(nullable = false)
    private String descripcion;


}
