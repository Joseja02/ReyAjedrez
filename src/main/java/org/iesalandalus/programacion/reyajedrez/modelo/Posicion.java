package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {

    private int fila;
    private char columna;

    public int getFila() {
        return fila;
    }
    public void setFila(int fila){

        if (fila < 1 || fila > 8){
            throw new IllegalArgumentException("ERROR: Fila no válida.");
        }
        this.fila = fila;
    }

    public char getColumna() { return columna; }

    public void setColumna(char columna){

        if (Character.toLowerCase(columna) < 'a' || Character.toLowerCase(columna) > 'h' ){
            throw new IllegalArgumentException("ERROR: Columna no válida.");
        }
        this.columna = columna;
    }

    public Posicion(int fila, char columna){
        setFila(fila);
        setColumna(columna);
    }

    public Posicion (Posicion posicionCopia) {
       if (posicionCopia == null){
           throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
       }
        this.fila = posicionCopia.getFila();
        this.columna = posicionCopia.getColumna();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    @Override
    public String toString() {
        return "fila=" + fila + ", columna=" + columna;
    }
}