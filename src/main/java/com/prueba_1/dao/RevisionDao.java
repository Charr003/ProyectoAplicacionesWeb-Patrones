/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.prueba_1.dao;

/**
 *
 * @author XPC
 */
import com.prueba_1.domain.Revision;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RevisionDao extends JpaRepository <Revision,Long> {

}
