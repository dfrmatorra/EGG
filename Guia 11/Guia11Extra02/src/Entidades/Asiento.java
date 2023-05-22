package Entidades;


import Enumeradores.Columna;

public class Asiento {

    private Columna columna;

    private int fila;

    public Asiento() {
    }

    public Asiento(Columna columna, int fila) {
        this.columna = columna;
        this.fila = fila;
    }

    public Columna getColumna() {
        return columna;
    }

    public void setColumna(Columna columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Asiento{" + "columna=" + columna + ", fila=" + fila + '}';
    }
    

}
