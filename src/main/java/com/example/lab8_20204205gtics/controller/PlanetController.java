package com.example.lab8_20204205gtics.controller;
import com.example.lab8_20204205gtics.entity.Planet;
import com.example.lab8_20204205gtics.repository.planetRepository;
import

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/planet")
public class PlanetController {

    final planetRepository planetRepository;

    public PlanetController(planetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }


    @GetMapping(value = {"", "/"})
    public String listPlanetas(Model model) {
        model.addAttribute("listaProductos", planetRepository.findAll());
        return "planet/list";
    }

    @GetMapping("/new")
    public String nuevoPLaneta(Model model) {
        return "planet/newfrm";
    }

    @PostMapping("/save")
    public String guardarPlaneta(Planet planet) {
        planetRepository.save(planet);
        return "redirect:/product";
    }


}
