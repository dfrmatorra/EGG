package Entidades;

// Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
public class Pelicula {

    private String titulo;
    private String director;
    private double duracion;

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }

    public int compareTo(Pelicula otraPelicula) {
        return this.titulo.compareTo(otraPelicula.getTitulo());
    }

    @Override
    public String toString() {
        return "Pelicula{"
                + "titulo='" + titulo + '\''
                + ", director='" + director + '\''
                + ", duracion=" + duracion
                + '}';
    }
}
