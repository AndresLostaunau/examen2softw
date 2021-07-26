package com;

import com.business.ConsoleUI;
import java.util.logging.Logger;

public class App {

    static final Logger logger = Logger.getLogger(App.class.getName());

    private static final ConsoleUI consoleUI = new ConsoleUI();

    public static void main(String[] args){
        consoleUI.start();
    }
}