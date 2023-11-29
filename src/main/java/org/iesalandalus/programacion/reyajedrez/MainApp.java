package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;

public class MainApp {

    private Rey rey=null;
    private void ejecutarOpcion(int opcionElegida){

        switch (opcionElegida){
            case 1:
                crearReyDefecto();
                break;
            case 2:
                crearReyColor();
                break;
            case 3:
                mover();
                break;
            case 4:
                Consola.despedirse();
                break;
        }

    }
    private void crearReyDefecto(){
        rey = new Rey();
    }
    private void crearReyColor(){
        rey = new Rey(Consola.elegirOpcion());
    }
    private void mover(){
        Consola.mostrarMenuDirecciones();
        try{
            Direccion direccionElegida= Consola.elegirDireccion();
            rey.mover(direccionElegida);
        }catch (OperationNotSupportedException e){
            System.out.print(e.getMessage());
        }
    }
    private void mostrarRey(){
        if(rey!=null){
            System.out.println(rey.toString());
        } else {
            System.out.println("El rey aún no ha sido creado.");
        }
    }
    public static void main(String[] args) {


    }
}
