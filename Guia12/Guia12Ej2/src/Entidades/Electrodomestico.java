package Entidades;

/**
 *
 * @author CASA
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoElectrico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoElectrico, int peso) {
        this.precio = precio;
        comprobarColor(color);
        this.color = color;
        comprobarConsumoElectrico(consumoElectrico);
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + '}';
    }

    //Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    //sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    //objeto y no será visible.
    public void comprobarConsumoElectrico(char consumoElectrico) {
        if (consumoElectrico != 'A' || consumoElectrico != 'B' || consumoElectrico != 'C' || consumoElectrico != 'D' || consumoElectrico != 'E') {
            this.consumoElectrico = 'F';
        }
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris")) {
            this.color = "blanco";
        }
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
     */
    public void precioFinal(char consumoElectrico, int peso) {
        this.precio = 1000;
        switch (consumoElectrico) {
            case 'A':
                this.precio = precio + 1000;
                break;
            case 'B':
                this.precio = precio + 800;
                break;
            case 'C':
                this.precio = precio + 600;
                break;

            case 'D':
                this.precio = precio + 500;
                break;
            case 'E':
                this.precio = precio + 300;
                break;
            case 'F':
                this.precio = precio + 100;
                break;
        }
             if (peso >= 1 && peso <= 19){
             this.precio = precio + 100;
        }
                  if (peso >=20  && peso <= 19){
             this.precio = precio + 100;
        }
        //TODO

    }

}
