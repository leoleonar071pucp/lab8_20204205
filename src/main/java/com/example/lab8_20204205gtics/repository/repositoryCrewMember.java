package com.example.lab8_20204205gtics.repository;

import com.example.lab8_20204205gtics.entity.Crew_member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public interface repositoryCrewMember extends JpaRepository<Crew_member,Long> {






}
