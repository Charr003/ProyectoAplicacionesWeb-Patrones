/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba_1.controller;

import com.prueba_1.domain.Contacto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactoController {

    @GetMapping("/contactenos")
    public String mostrarFormulario(Model model) {
        model.addAttribute("contacto", new Contacto());
        return "contactenos"; // el nombre del archivo HTML que crearemos
    }

    @PostMapping("/contactenos")
    public String enviarFormulario(@Valid @ModelAttribute("contacto") Contacto contacto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "contactenos"; // vuelve a mostrar el formulario si hay errores
        }
        // Aquí puedes agregar lógica para enviar el correo o guardar el mensaje en la BD
        model.addAttribute("mensajeExito", "Gracias por contactarnos, " + contacto.getNombre() + ". Te responderemos pronto.");
        model.addAttribute("contacto", new Contacto()); // limpiar formulario
        return "contactenos";
    }
}

