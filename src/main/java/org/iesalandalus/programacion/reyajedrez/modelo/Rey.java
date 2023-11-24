package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Color getColor() {
        return color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    public void setColor(Color color) {

        if (color == null){
            throw new IllegalArgumentException("Error: El argumento color es erróneo.");
        }
        this.color = color;
    }

    public void setPosicion(Posicion posicion) {

        if (posicion == null){
            throw new IllegalArgumentException("Error: El argumento color es erróneo.");
        }
        this.posicion = posicion;
    }

    public void setTotalMovimientos(int totalMovimientos) {

        if (totalMovimientos < 0){
            throw new IllegalArgumentException("Error: El número total de movimientos no puede ser negativo.");
        }
        this.totalMovimientos = totalMovimientos;
    }

    public Rey(){
        this.color = Color.BLANCO;
        this.posicion = new Posicion(1, 'e');
    }

    public Rey(Color color){

        switch (color){

            case BLANCO:
                this.posicion = new Posicion(1, 'e');
                break;

            case NEGRO:
                this.posicion = new Posicion(8, 'e');
                break;
        }
    }

    public void mover (Direccion direccion) throws OperationNotSupportedException {

        if (direccion == null){
            throw new IllegalArgumentException("Error: La dirección no puede ser nula.");
        }

        try {
            switch (direccion){

                case ENROQUE_CORTO, ENROQUE_LARGO:
                    break;

                case NORTE:
                    this.posicion.setFila(this.posicion.getFila() + 1);
                    break;

                case SUR:
                    this.posicion.setFila(this.posicion.getFila() - 1);
                    break;

                case ESTE:
                    this.posicion.setColumna((char) (this.posicion.getColumna() + 1));
                    break;

                case OESTE:
                    this.posicion.setColumna((char) (this.posicion.getColumna() - 1));
                    break;

                case NORESTE:
                    this.posicion = new Posicion(this.posicion.getFila() + 1,(char) (this.posicion.getColumna() + 1));
                    break;

                case SURESTE:
                    this.posicion = new Posicion(this.posicion.getFila() - 1,(char) (this.posicion.getColumna() + 1));
                    break;

                case NOROESTE:
                    this.posicion = new Posicion(this.posicion.getFila() + 1,(char) (this.posicion.getColumna() - 1));
                    break;

                case SUROESTE:
                    this.posicion = new Posicion(this.posicion.getFila() - 1,(char) (this.posicion.getColumna() - 1));
                    break;
            }
            setTotalMovimientos(getTotalMovimientos() + 1);

        } catch (IllegalArgumentException ex){
            throw new OperationNotSupportedException("Movimiento no permitido: " + ex.getMessage());
        }
    }
}