package com.data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class VacunaGeneral {

    static final Logger logger = Logger.getLogger(VacunaGeneral.class.getName());

    private final List<CentroVacuna> lista_centros;
    private int total_necesitado;

    public VacunaGeneral(){
        total_necesitado = 1500;
        lista_centros = new ArrayList<>();
        lista_centros.add(new CentroVacuna("A",234));
        lista_centros.add(new CentroVacuna("B",432));
        lista_centros.add(new CentroVacuna("C",123));
    }

    public void darBaja(int index){
        lista_centros.get(index).setDeAlta(false);
    }

    public void darAlta(int index){
        lista_centros.get(index).setDeAlta(true);
    }

    public int getNumeroCentros(){
        return lista_centros.size();
    }

    public void print(){
        for(int i = 0; i < lista_centros.size(); i++){
            logger.info("Centro "+i+": "+" Cantidad: "+lista_centros.get(i).getNumPersonas());
        }
    }

    public CentroVacuna get(int index){
        return lista_centros.get(index);
    }

    public void genInfo(){
        var sum = 0;
        for(CentroVacuna cv:lista_centros){
            sum+=cv.getNumPersonas();
        }
        logger.info("Personas Vacunadas: "+sum);
    }
}
