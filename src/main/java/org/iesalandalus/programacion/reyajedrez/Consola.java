package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
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
        System.out.println("");
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
    public void mostrarMenuDirecciones(){
        System.out.println("");
        System.out.println("1.- Norte");
        System.out.println("2.- Sur");
        System.out.println("3.- Este");
        System.out.println("4.- Oeste");
        System.out.println("5.- Noreste");
        System.out.println("6.- Noroeste");
        System.out.println("7.- Sureste");
        System.out.println("8.- Suroeste");
        System.out.println("9.- Enroque Largo");
        System.out.println("10.- Enroque Corte");
    }
    public Direccion elegirDireccion(){

        Direccion direccionElegida = Direccion.NORTE;   // Asignamos por defecto la dirección NORTE para poder inicializar la variable direccionElegida.
        int opcionDireccion;

        System.out.print("Introduce una de las opciones mostradas arriba: ");
        opcionDireccion = Entrada.entero();

        if (opcionDireccion < 1 || opcionDireccion > 10){
            do {
                System.out.print("ERROR: Has introducido una opción fuera de rango. Selecciona una de las opciones mostradas arriba: ");
                opcionDireccion = Entrada.entero();
            } while (opcionDireccion < 1 || opcionDireccion > 2);
        }

        switch (opcionDireccion){

            case 1:
                break;
            case 2:
                direccionElegida = Direccion.SUR;
                break;
            case 3:
                direccionElegida = Direccion.ESTE;
                break;
            case 4:
                direccionElegida = Direccion.OESTE;
                break;
            case 5:
                direccionElegida = Direccion.NORESTE;
                break;
            case 6:
                direccionElegida = Direccion.NOROESTE;
                break;
            case 7:
                direccionElegida = Direccion.SURESTE;
                break;
            case 8:
                direccionElegida = Direccion.SUROESTE;
                break;
            case 9:
                direccionElegida = Direccion.ENROQUE_LARGO;
                break;
            case 10:
                direccionElegida = Direccion.ENROQUE_CORTO;
                break;
        }
        return direccionElegida;
    }
    public void despedirse(){
        System.out.println("");
        System.out.println("¡Gracias por jugar! ¡Hasta la próxima!");
    }
}