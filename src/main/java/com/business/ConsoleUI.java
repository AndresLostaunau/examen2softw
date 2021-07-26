package com.business;

import com.data.VacunaGeneral;

import java.util.Scanner;
import java.util.logging.Logger;

public class ConsoleUI {

    static final Logger logger = Logger.getLogger(ConsoleUI.class.getName());

    private static final VacunaGeneral vacunaGeneral = new VacunaGeneral();

    public void start(){
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
            logger.info("3. Crear centro.");
            logger.info("4. Cerrar Sesion");
            var state = Integer.parseInt(scanner.nextLine());
            if(state == 1){
                vacunaGeneral.print();
                var vcstate = Integer.parseInt(scanner.nextLine());
                var cv = vacunaGeneral.get(vcstate);
                cv.print();
                if(cv.getDeAlta()) {
                    logger.info("1. Dar de baja?");
                    cv.setDeAlta(Integer.parseInt(scanner.nextLine()) == 0);
                }
                else{
                    logger.info("Dar de alta?");
                    cv.setDeAlta(Integer.parseInt(scanner.nextLine()) == 1);
                }
            }else if(state == 2){
                vacunaGeneral.genInfo();
            }else if(state == 3) {
                logger.info("Ingrese nombre del local: ");
                var nom = scanner.nextLine();
                logger.info("Cantidad de personas ya vacunadas");
                var cant = Integer.parseInt(scanner.nextLine());
                vacunaGeneral.add(nom, cant);
            } else if(state == 4){
                return;
            }
        }
    }
}
