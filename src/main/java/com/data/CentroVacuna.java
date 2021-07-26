package com.data;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CentroVacuna {
    private final String nombre;
    private final int numPersonas;
    private final int numMaxPersonas;
    private boolean deAlta;

    static final Logger logger = Logger.getLogger(CentroVacuna.class.getName());

    public CentroVacuna(String nom, int num){
        nombre = nom;
        numPersonas = num;
        numMaxPersonas = num+200;
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

    public int getNumMaxPersonas() {
        return numMaxPersonas;
    }

    public void setDeAlta(boolean bool){
        deAlta = bool;
    }

    public void print(){
        logger.log(Level.INFO,"Nombre del Centro: {0}", nombre);
        logger.log(Level.INFO,"Cantidad de personas vacunadas: {0}",numPersonas);
        logger.log(Level.INFO,"Cantidad de personas asignadas al centro: {0}",numMaxPersonas);
        logger.log(Level.INFO,"Porcentaje de vacunados: {0}",((float)numPersonas*100)/numMaxPersonas);
        logger.log(Level.INFO,"De alta: {0}",deAlta);
    }
}

