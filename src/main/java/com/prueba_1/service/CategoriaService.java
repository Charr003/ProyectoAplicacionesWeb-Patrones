/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.prueba_1.service;

/**
 *
 * @author XPC
 */


import com.prueba_1.domain.Categoria; 
import java.util.List; 

public interface CategoriaService {
    //asigna el metodo para despues implementarlo en el serviceImpl (Read)
    public List<Categoria> getCategorias(boolean activos);
    

    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
    
    
}
