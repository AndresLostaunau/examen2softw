package com;

import com.data.VacunaGeneral;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {

    static final Logger logger = Logger.getLogger(App.class.getName());

    public static VacunaGeneral vacunaGeneral;

    public static void main(String[] args){
        var scanner =  new Scanner(System.in);
        logger.info("Inicio Sesión");
        logger.info("Ingresar nombre en consola: ");
        var username = scanner.nextLine();
        logger.info("Ingresar contraseña en consola: ");
        var password = scanner.nextLine();
        for(int i = 0; i < username.length(); i++){
            if(password.charAt(username.length()-i-1) != username.charAt(i)){
                return;
            }
        }
        while (true){
            logger.info("1. Revisar centro.");
            logger.info("2. Información general.");
            logger.info("2. Cerrar Sesion");
            var state = Integer.parseInt(scanner.nextLine());
            if(state == 1){
                vacunaGeneral.print();
                var vcstate = Integer.parseInt(scanner.nextLine());
                vacunaGeneral.get(vcstate).print();
            }else if(state == 2){
                vacunaGeneral.genInfo();
            }else if(state == 3){
                return;
            }
        }
    }
}