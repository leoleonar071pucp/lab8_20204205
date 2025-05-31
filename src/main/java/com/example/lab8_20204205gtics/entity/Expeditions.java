package com.example.lab8_20204205gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter
@Setter
@Table(name = "expeditions")
public class Expeditions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre_mision;

    @ManyToOne
    @JoinColumn(name = "id")
    @Column(nullable = false)
    private Planet planeta_destino;


    @Column(nullable = false)
    private DateTimeFormat.ISO fecha_lanzamiento;



    @Column(nullable = false)
    private String estado;

    @Column(nullable = true)
    private String objetivos;

    @Column(nullable = true)
    private String resultados;



}
