package ru.job4j.accidents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accidents.service.SimpleAccidentService;

@Controller
public class AccidentController {

    private final SimpleAccidentService service;

    public AccidentController(SimpleAccidentService service) {
        this.service = service;
    }

    @GetMapping("/accidents")
    public String findAll(Model model) {
        model.addAttribute("accidents", service.findAll());
        model.addAttribute("user", "Maks");
        return "list";
    }
}
