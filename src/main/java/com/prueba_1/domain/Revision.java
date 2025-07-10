/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba_1.domain;

/**
 *
 * @author XPC
 */

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "revision")
public class Revision implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_revision")
    private Long idRevision;
    private String resena;
    private double precio_revision;
    private int edicion;
    private String imagen;
    private boolean activo;
    
    public Revision() {
    }

    public Revision(String resena, boolean activo) {
        this.resena = resena;
        this.activo = activo;
    }
}

