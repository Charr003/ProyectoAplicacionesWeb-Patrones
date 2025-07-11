/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba_1.service;

import com.prueba_1.domain.Resena;
import java.util.List;

public interface ResenaService {
    List<Resena> getAllResenas();  // Mostrar todas las reseñas
    void guardar(Resena resena);   // Guardar una reseña nueva
}
