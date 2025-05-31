package com.example.lab8_20204205gtics.repository;

import com.example.lab8_20204205gtics.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface planetRepository extends JpaRepository<Planet,Long> {
}
