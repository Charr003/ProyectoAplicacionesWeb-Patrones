

package com.prueba_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class controller {

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
        // Validación simple (solo para pruebas)
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "redirect:/admin";
        } else if ("usuario".equals(username) && "user123".equals(password)) {
            return "redirect:/user";
        } else {
            model.addAttribute("error", true);
            return "login";
        }
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
