/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba_1.dao;

import com.prueba_1.domain.Resena;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResenaDao extends JpaRepository<Resena, Long> {
    // No necesitas escribir nada más. Spring lo hace por ti.
}

