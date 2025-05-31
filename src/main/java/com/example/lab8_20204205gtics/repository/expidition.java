package com.example.lab8_20204205gtics.repository;

import com.example.lab8_20204205gtics.entity.Expeditions;
import com.example.lab8_20204205gtics.entity.Expidition_crew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface expidition extends JpaRepository<Expeditions,Long> {
}
