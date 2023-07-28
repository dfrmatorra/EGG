/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas
y la cantidad jugadas máximas que puede realizar el usuario.
 */
package Entidades;

/**
 *
 * @author CASA
 */
public class Ahorcado {
    private char [] palabra;
    private int letrasEncontradas;
    private int jugasdasMax;
    private int longitud;
    

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int jugasdasMax, int longitud) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugasdasMax = jugasdasMax;
        this.longitud = longitud;
    }

    
    public Ahorcado(char[] palabra, int jugasdasMax, int longitud) {
        this.palabra = palabra;
        this.jugasdasMax = jugasdasMax;
        this.longitud = longitud;
    }
    

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugasdasMax() {
        return jugasdasMax;
    }

    public void setJugasdasMax(int jugasdasMax) {
        this.jugasdasMax = jugasdasMax;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    
    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", jugasdasMax=" + jugasdasMax + '}';
    }
    
    
    
}
