package com.example.lab3.controller;

import com.example.lab3.repository.CarRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("car-requests")
public class CarRequestController {

    @Autowired
    private CarRequestRepository carRequestRepository;

    @RequestMapping(value = "/createCarRequest", method = RequestMethod.POST)
    public void saveStudent(BindingResult errors, Model model) {

    }
}
