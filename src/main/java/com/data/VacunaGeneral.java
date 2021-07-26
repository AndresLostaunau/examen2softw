package com.data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VacunaGeneral {

    static final Logger logger = Logger.getLogger(VacunaGeneral.class.getName());

    private final List<CentroVacuna> listaCentros;

    public VacunaGeneral(){
        listaCentros = new ArrayList<>();
        listaCentros.add(new CentroVacuna("A",234));
        listaCentros.add(new CentroVacuna("B",432));
        listaCentros.add(new CentroVacuna("C",123));
    }

    public void darBaja(int index){
        listaCentros.get(index).setDeAlta(false);
    }

    public void darAlta(int index){
        listaCentros.get(index).setDeAlta(true);
    }

    public int getNumeroCentros(){
        return listaCentros.size();
    }

    public void print(){
        for(int i = 0; i < listaCentros.size(); i++){
            logger.log(Level.INFO,"Centro: {}", listaCentros.get(i).getNombre());
        }
    }

    public CentroVacuna get(int index){
        return listaCentros.get(index);
    }

    public void genInfo(){
        var sum = 0;
        for(CentroVacuna cv: listaCentros){
            sum+=cv.getNumPersonas();
        }
        logger.log(Level.INFO,"Personas Vacunadas: {}",sum);
    }

    public void add(String nombre, int num){
        listaCentros.add(new CentroVacuna(nombre,num));
    }
}
