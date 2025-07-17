package com.prueba_1.controller;

import com.prueba_1.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {

    private List<Usuario> usuariosRegistrados = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginProcess(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {

        if ("admin".equals(username) && "admin123".equals(password)) {
            return "redirect:/admin";
        } else if ("usuario".equals(username) && "user123".equals(password)) {
            return "redirect:/user";
        } else {
            for (Usuario u : usuariosRegistrados) {
                if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                    return "redirect:/user";
                }
            }
        }

        model.addAttribute("error", true);
        return "login";
    }

    @GetMapping("/registro")
    public String registroPage(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String procesarRegistro(@ModelAttribute Usuario usuario,
                                   @RequestParam("confirmar") String confirmar,
                                   Model model) {

        if (!usuario.getPassword().equals(confirmar)) {
            model.addAttribute("error", "Las contraseñas no coinciden.");
            return "registro";
        }

        for (Usuario u : usuariosRegistrados) {
            if (u.getUsername().equals(usuario.getUsername())) {
                model.addAttribute("error", "El nombre de usuario ya está en uso.");
                return "registro";
            }
        }

        usuariosRegistrados.add(usuario);
        model.addAttribute("mensaje", "Registro exitoso. Ahora puede iniciar sesión.");
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }
}
