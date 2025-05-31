package com.example.lab8_20204205gtics.entity;
import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@IdClass(Expidition_crew.llaveCompuesta.class)
public class Expidition_crew {

    @Id
    @ManyToOne
    @JoinColumn(name = "expedition_id")
    private Expidition_crew expiditionCrew;

    @Id
    @ManyToOne
    @JoinColumn(name = "crew_member_id")
    private Crew_member crewMember;

    @Embeddable
    class llaveCompuesta implements Serializable {

        private Expidition_crew expiditionCrew;

        private Crew_member crew_member;

        // Getters y setters
    }
}



