package Entites;
//•Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
//establecido en estos dispositivos. Solo se usa en nivel básico.
//• Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le pasa
//el nivel de intensidad y el tiempo. El dispositivo debe retornar la energía consumida
public class Armadura {

    protected String colorPrimario;
    protected String colorSecundario;
    protected  Integer resistencia;
    protected Integer salud;
    protected Integer generador;
    protected String consola;
    protected String  botas;
    protected String  guantes;
    protected String  sintetizador;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, Integer resistencia, Integer salud, Integer generador, String consola, String botas, String guantes, String sintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
        this.salud = salud;
        this.generador = generador;
        this.consola = consola;
        this.botas = botas;
        this.guantes = guantes;
        this.sintetizador = sintetizador;
    }

    public void caminar(int intensidad, int tiempo) {
        int consumo = intensidad * tiempo;
        salud -= consumo;
    }
//establecida como consumo en la bota por el tiempo en el que se camine.

    }
    public void correr(int intensidad, int tiempo) { //• Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//energía establecida como consumo en la bota por el tiempo en el que se corra.
        int consumo = intensidad * tiempo;
        salud -= consumo;
    }

    public void propulsar(int intensidad, int tiempo) { //Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
        //energía por el tiempo que dure la propulsión.
        int consumo = intensidad * tiempo;
        salud -= consumo;

    }

    public void volar(int intensidad, int tiempo) { //Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
        //consumiendo el triple de la energía establecida para las botas y el doble para los guantes.
        int consumo = intensidad * tiempo;
        salud -= consumo;
    }

    public void escribir(int intensidad, int tiempo) {//• Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
        //establecido en estos dispositivos. Solo se usa en nivel básico.
        int consumo = intensidad * tiempo;
        salud -= consumo;
    }

    public void leer(int intensidad, int tiempo) {
        int consumo = intensidad * tiempo;
        salud -= consumo;
    }

//    public void disparar(int intensidad, int tiempo) {
//        //Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
//        int consumo = intensidad * tiempo;
//        salud -= consumo;
//    }
//
//    public void recargar(int intensidad, int tiempo) {
//        int consumo = intensidad * tiempo;
//        salud += consumo;
//    }





}
