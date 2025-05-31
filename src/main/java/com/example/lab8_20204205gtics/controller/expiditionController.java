package com.example.lab8_20204205gtics.controller;


import com.example.lab8_20204205gtics.repository.expiditionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expedition")
public class expiditionController {

    final expiditionRepository expiditionRepositoryrepository;

    public expiditionController(expiditionRepository expiditionRepositoryrepository) {
        this.expiditionRepositoryrepository = expiditionRepositoryrepository;
    }


    @GetMapping(value = {"", "/"})
    public String listPlanetas(Model model) {
        model.addAttribute("listExpediciones", expiditionRepositoryrepository.findAll());
        return "expedition/list";
    }

    @GetMapping("/new")
    public String nuevoExpidition(Model model) {
        return "expedition/newfrm";
    }



}
