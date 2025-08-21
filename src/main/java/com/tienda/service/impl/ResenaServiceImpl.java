/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba_1.service.impl;

import com.prueba_1.dao.ResenaDao;
import com.prueba_1.domain.Resena;
import com.prueba_1.service.ResenaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResenaServiceImpl implements ResenaService {

    @Autowired
    private ResenaDao resenaDao;

    @Override
    public List<Resena> getAllResenas() {
        return resenaDao.findAll();
    }

    @Override
    public void guardar(Resena resena) {
        resenaDao.save(resena);
    }
}

