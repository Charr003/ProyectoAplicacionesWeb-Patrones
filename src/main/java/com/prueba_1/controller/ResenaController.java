/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba_1.controller;

import com.prueba_1.domain.Resena;
import com.prueba_1.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ResenaController {

    @Autowired
    private ResenaService resenaService;

    @GetMapping("/resenas")
    public String mostrarResenas(Model model) {
        model.addAttribute("resenas", resenaService.getAllResenas());
        model.addAttribute("resena", new Resena());
        return "resenas";
    }

    @PostMapping("/resenas")
    public String guardarResena(@ModelAttribute Resena resena) {
        resenaService.guardar(resena);
        return "redirect:/resenas";
    }
}
