/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.impl;

import com.betancur.Inscripcion;
import com.betancur.dao.InscripcionDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class InscripcionDaoImpl implements InscripcionDao {

    private final List<Inscripcion> inscripciones;

    public InscripcionDaoImpl() {
        this.inscripciones = new ArrayList<>();
    }

    @Override
    public Inscripcion buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Inscripcion nuevaInscripcion) {
        this.inscripciones.add(nuevaInscripcion);
    }

}
