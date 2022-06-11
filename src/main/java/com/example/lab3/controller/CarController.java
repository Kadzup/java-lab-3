package com.example.lab3.controller;

import com.example.lab3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public String getCars(Model model) {
        model.addAttribute("cars", carRepository.findAll());
        return "carsPage";
    }

    @GetMapping("/{id}")
    public String getCar(Model model, @PathVariable("id") Long id) {
        model.addAttribute("car", carRepository.findById(id));
        return "carPage";
    }
}
