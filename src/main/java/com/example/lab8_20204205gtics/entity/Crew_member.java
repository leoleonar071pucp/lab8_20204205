package com.example.lab8_20204205gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "crew_members")
public class Crew_member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre_completo;


    @Column(nullable = false)
    private Date fecha_contratacion;


    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String especialidad;

    @Column(nullable = true)
    private String rango;



}
