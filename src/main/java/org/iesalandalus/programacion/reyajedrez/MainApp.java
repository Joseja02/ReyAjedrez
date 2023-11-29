package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

public class MainApp {

    private Rey rey;
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
    public static void main(String[] args) {


    }
}
