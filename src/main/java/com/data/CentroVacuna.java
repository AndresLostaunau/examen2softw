package com.data;

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
        logger.info("Nombre del Centro: "+nombre);
        logger.info("Cantidad de personas vacunadas"+numPersonas);
        logger.info("De alta: "+deAlta);
    }
}

