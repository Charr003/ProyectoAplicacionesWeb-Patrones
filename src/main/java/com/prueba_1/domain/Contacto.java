package com.prueba_1.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class Contacto {

    @NotEmpty(message = "El nombre es obligatorio")
    private String nombre;

    @NotEmpty(message = "El correo es obligatorio")
    @Email(message = "Correo inválido")
    private String correo;

    @NotEmpty(message = "El mensaje es obligatorio")
    private String mensaje;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
