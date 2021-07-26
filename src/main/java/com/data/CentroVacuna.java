package com.data;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CentroVacuna {
    private final String nombre;
    private final int numPersonas;
    private boolean deAlta;

    static final Logger logger = Logger.getLogger(CentroVacuna.class.getName());

    public CentroVacuna(String nom, int num){
        nombre = nom;
        numPersonas = num;
        deAlta = false;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public boolean getDeAlta(){
        return deAlta;
    }

    public String getNombre(){
        return nombre;
    }

    public void setDeAlta(boolean bool){
        deAlta = bool;
    }

    public void print(){
        logger.log(Level.INFO,"Nombre del Centro: {}", nombre);
        logger.log(Level.INFO,"Cantidad de personas vacunadas: {}",numPersonas);
        logger.log(Level.INFO,"De alta: {}",deAlta);
    }
}

