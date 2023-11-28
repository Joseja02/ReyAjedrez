package org.iesalandalus.programacion.reyajedrez;

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
}
