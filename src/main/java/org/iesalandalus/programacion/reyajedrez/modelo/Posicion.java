package org.iesalandalus.programacion.reyajedrez.modelo;

public class Posicion {

    private int fila;
    private char columna;

    public int getFila() {
        return fila;
    }
    public void setFila(int fila){

        if (fila < 1 || fila > 8){
            throw new IllegalArgumentException("Error, valor introducido erroneo. Introduce un valor entre 1 y 8");
        }
        this.fila = fila;
    }

    public char getColumna() { return columna; }

    public void setColumna(char columna){

        if (Character.toLowerCase(columna) < 'a' || Character.toLowerCase(columna) > 'h' ){
            throw new IllegalArgumentException("Error, valor introducido erroneo. Introduce una letra entre 'a' y 'h'");
        }
        this.columna = columna;
    }

    public Posicion(int fila, char columna){
        setFila(fila);
        setColumna(columna);
    }

    public Posicion (Posicion posicionCopia) {
        this.fila = posicionCopia.getFila();
        this.columna = posicionCopia.getColumna();
    }


}