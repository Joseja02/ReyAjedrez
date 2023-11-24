package org.iesalandalus.programacion.reyajedrez.modelo;

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



}
