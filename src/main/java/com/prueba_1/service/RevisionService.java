/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.prueba_1.service;

/**
 *
 * @author XPC
 */
import com.prueba_1.domain.Revision; 
import java.util.List; 

public interface RevisionService {
    
    List<Revision> getRevisiones(boolean activos);
    Revision getRevision(Revision revision);
    void save(Revision revision);
    void delete(Revision revision);
}
