package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public final class Consola {
    public Consola() {
    }
    public void mostrarMenu(){
        System.out.println("");
        System.out.println(" | ------- Programa Rey Ajedrez v1.0 (hecho por José Javier Sierra) ------- |");
        System.out.println("1.- Crear Rey por defecto");
        System.out.println("2.- Crear Rey eligiendo color");
        System.out.println("3.- Mover");
        System.out.println("4.- Salir");
        System.out.println("| ------------------------------------------------------------------------- |");
    }

    public int elegirOpcionMenu(){
        int opcionMenu;
        System.out.print("Elige una opción: ");
        opcionMenu = Entrada.entero();

        if (opcionMenu < 1 || opcionMenu > 4){
            do {
                System.out.print("ERROR: Has introducido una opción fuera de rango. Selecciona una de las opciones mostradas arriba: ");
                opcionMenu = Entrada.entero();
            } while (opcionMenu < 1 || opcionMenu > 4);
        }
        return opcionMenu;
    }

    public Color elegirOpcion(){
        Color colorElegido = Color.BLANCO;     // Asignamos por defecto el color BLANCO para poder inicializar la variable colorElegido.
        int opcionColor;
        System.out.println("| ----- Elige un color ----- |");
        System.out.println("1.- Blanco");
        System.out.println("2.- Negro");
        opcionColor = Entrada.entero();

        if (opcionColor < 1 || opcionColor > 2){
            do {
                System.out.print("ERROR: Has introducido una opción fuera de rango. Selecciona una de las opciones mostradas arriba: ");
                opcionColor = Entrada.entero();
            } while (opcionColor < 1 || opcionColor > 2);
        }
        switch (opcionColor){
            case 1:
                break;
            case 2:
                colorElegido = Color.NEGRO;
                break;
        }
        return colorElegido;
    }
}